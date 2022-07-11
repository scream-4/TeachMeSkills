import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest {
    private static final String baseUrl = "https://www.sharelane.com/cgi-bin/register.py";

    @Test
    public void FiveDigitsZipCodeTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url code zipcode page
        driver.get(baseUrl);
        //Input 5 digits into input field
        driver.findElement(By.name("zip_code")).sendKeys("90011");
        //click continue
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        //add check
        WebElement registerButton = driver.findElement(By.cssSelector("[value=Register]"));
        Assert.assertTrue(registerButton.isDisplayed(), "'Register' button isn't displayed");
        //close driver
        driver.quit();
        //end

    }

    @Test
    public void FourDigitsZipCodeTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url code zipcode page
        driver.get(baseUrl);
        //Input 5 digits into input field
        driver.findElement(By.name("zip_code")).sendKeys("9001");
        //click continue
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        //add check
        WebElement errorMessage = driver.findElement(By.className("error_message"));
        boolean isErrorDisplayed = errorMessage.isDisplayed();
        driver.quit();
        Assert.assertTrue(isErrorDisplayed, "'Zip Code must be 5 characters");

    }

    @Test
    public void SixDigitsZipCodeTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url code zipcode page
        driver.get(baseUrl);
        //Input 5 digits into input field
        driver.findElement(By.name("zip_code")).sendKeys("900111");
        //click continue
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        //add check
        WebElement errorMessage = driver.findElement(By.className("error_message"));
        boolean isErrorDisplayed = errorMessage.isDisplayed();
        driver.quit();
        Assert.assertTrue(isErrorDisplayed, "'Zip Code must be 5 characters");
    }

    @Test
    public void PasswordThreeDigits() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url code zipcode page
        driver.get(baseUrl);
        //Input 5 digits into input field
        driver.findElement(By.name("zip_code")).sendKeys("90011");
        //click continue
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("stef");
        driver.findElement(By.name("last_name")).sendKeys("lilk");
        driver.findElement(By.name("email")).sendKeys("stefl1234@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("123");
        driver.findElement(By.name("password2")).sendKeys("123");
        //click continue
        driver.findElement(By.cssSelector("[value=Register]")).click();
        //add check
        WebElement errorMessage = driver.findElement(By.className("error_message"));
        boolean isErrorDisplayed = errorMessage.isDisplayed();
        driver.quit();
        Assert.assertTrue(isErrorDisplayed, "'Password cannot be 3 characters");
    }

    @Test
    public void DifferentPassword() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url code zipcode page
        driver.get(baseUrl);
        //Input 5 digits into input field
        driver.findElement(By.name("zip_code")).sendKeys("90011");
        //click continue
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("stef");
        driver.findElement(By.name("last_name")).sendKeys("lilk");
        driver.findElement(By.name("email")).sendKeys("stefl1234@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("123456");
        driver.findElement(By.name("password2")).sendKeys("1234");
        //click continue
        driver.findElement(By.cssSelector("[value=Register]")).click();
        //add check
        WebElement errorMessage = driver.findElement(By.className("error_message"));
        boolean isErrorDisplayed = errorMessage.isDisplayed();
        driver.quit();
        Assert.assertTrue(isErrorDisplayed, "'Password cannot be 6 characters");
    }

    @Test
    public void CharactersInThePassword(){
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url code zipcode page
        driver.get(baseUrl);
        //Input 5 digits into input field
        driver.findElement(By.name("zip_code")).sendKeys("90011");
        //click continue
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("stef");
        driver.findElement(By.name("last_name")).sendKeys("lilk");
        driver.findElement(By.name("email")).sendKeys("stefl1234@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("qazwsx");
        driver.findElement(By.name("password2")).sendKeys("qazwsx");
        //click continue
        driver.findElement(By.cssSelector("[value=Register]")).click();
    }

    @Test
    public void LoginSystemAndAddToCart() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open url code zipcode page
        driver.get(baseUrl);
        //Input 5 digits into input field
        driver.findElement(By.name("zip_code")).sendKeys("90011");
        //click continue
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        //registration
        driver.findElement(By.name("first_name")).sendKeys("stef");
        driver.findElement(By.name("last_name")).sendKeys("lilk");
        driver.findElement(By.name("email")).sendKeys("stefl1234@mail.ru");
        driver.findElement(By.name("password1")).sendKeys("1234");
        driver.findElement(By.name("password2")).sendKeys("1234");
        //click continue
        driver.findElement(By.cssSelector("[value=Register]")).click();
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
}

