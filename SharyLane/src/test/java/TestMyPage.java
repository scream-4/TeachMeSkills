import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMyPage {
    WebDriver driver;
    private static final String PATH = "D:\\TeachMeSkills\\TeachMeSkills\\SharyLane\\src\\test\\resources\\index.html";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(PATH);
    }

    @Test
    public void checkElementOnPage() {
        System.out.println(driver.findElement(By.xpath("//h1")).getText());
        System.out.println(driver.findElement(By.name("actors")).getText());
        driver.findElement(By.id("elem")).click();
    }

    @Test
    public void checkBlockName() {
        System.out.println(driver.findElement(By.xpath("//h2")).getText());
    }

    @Test
    public void checkLinks() {
        driver.get("https://www.w3schools.com");
    }

    @Test
    public void checkTextOnPage() {
        System.out.println(driver.findElement(By.xpath("//img")).getAttribute("alt"));
    }

    @Test
    public void checkHands() {
        driver.findElement(By.id("rhand")).click();
        driver.findElement(By.id("lhand")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
