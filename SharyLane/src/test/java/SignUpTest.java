import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTest {
    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    private static final String baseUrl = "https://www.sharelane.com/cgi-bin/register.py";

    private void SendZipCode(String zipCode) {
        //Open url code zipcode page
        driver.get(baseUrl);
        //Input 5 digits into input field
        driver.findElement(By.name("zip_code")).sendKeys(zipCode);
        //click continue
        driver.findElement(By.cssSelector("[value=Continue]")).click();
    }

    private void Registration(String pass, String confirmPass) {
        driver.findElement(By.name("first_name")).sendKeys("stef");
        driver.findElement(By.name("last_name")).sendKeys("lilk");
        driver.findElement(By.name("email")).sendKeys("stefl1234@mail.ru");
        driver.findElement(By.name("password1")).sendKeys(pass);
        driver.findElement(By.name("password2")).sendKeys(confirmPass);
        driver.findElement(By.cssSelector("[value=Register]")).click();
    }

    @Test
    public void FiveDigitsZipCodeTest() {
        SendZipCode("90011");
        //add check
        WebElement registerButton = driver.findElement(By.cssSelector("[value=Register]"));
        Assert.assertTrue(registerButton.isDisplayed(), "'Register' button isn't displayed");
    }

    @Test
    public void FourDigitsZipCodeTest() {
        SendZipCode("9001");
        //add check
        WebElement errorMessage = driver.findElement(By.className("error_message"));
        boolean isErrorDisplayed = errorMessage.isDisplayed();
        Assert.assertTrue(isErrorDisplayed, "'Zip Code must be 5 characters");

    }

    @Test
    public void SixDigitsZipCodeTest() {
        SendZipCode("900111");
        //add check
        WebElement errorMessage = driver.findElement(By.className("error_message"));
        boolean isErrorDisplayed = errorMessage.isDisplayed();
        Assert.assertTrue(isErrorDisplayed, "'Zip Code must be 5 characters");
    }

    @Test
    public void PasswordThreeDigits() {
        SendZipCode("90011");
        Registration("123", "123");
        //add check
        WebElement errorMessage = driver.findElement(By.className("error_message"));
        boolean isErrorDisplayed = errorMessage.isDisplayed();
        Assert.assertTrue(isErrorDisplayed, "'Password cannot be 3 characters");
    }

    @Test
    public void DifferentPassword() {
        SendZipCode("90011");
        Registration("1234", "123456");
        //add check
        WebElement errorMessage = driver.findElement(By.className("error_message"));
        boolean isErrorDisplayed = errorMessage.isDisplayed();
        Assert.assertTrue(isErrorDisplayed, "'Password cannot be 6 characters");
    }

    @Test
    public void CharactersInThePassword() {
        SendZipCode("90011");
        Registration("qazwsx", "qazwsx");
    }

    @Test
    public void LoginSystemAndAddToCart() {
        SendZipCode("90011");
        Registration("1234","1234");
        //save log in
        User user = new User();
        user.setEmail(driver.findElement(By.xpath("//td[text()='Email']/following-sibling::td")).getText());
        user.setPass("1111");
        //click home
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        //click email and pass login
        driver.findElement(By.name("email")).sendKeys(user.getEmail());
        driver.findElement(By.name("password")).sendKeys(user.getPass());
        //click login
        driver.findElement(By.cssSelector("[value=Login]")).click();
        //click book
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=8");
        //click add to cart
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=8");
        //click to Shopping cart
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

