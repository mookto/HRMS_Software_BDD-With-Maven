package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeOptions;
public class BaseTest {
	public static WebDriver driver;

    @BeforeMethod
    public void setup() {



        ChromeOptions options = new ChromeOptions();

// Essential flags for Docker/Headless/Jenkins environments
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--headless"); // Optional, depending on your use case
        options.addArguments("--remote-allow-origins=*");

// Fix the user-data-dir issue:
        options.addArguments("--user-data-dir=/tmp/chrome-user-data-" + System.currentTimeMillis());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
