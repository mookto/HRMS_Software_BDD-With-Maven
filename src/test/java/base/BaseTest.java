package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.UUID;

public class BaseTest {
	public static WebDriver driver;

    @BeforeMethod
    public void setup() {



        ChromeOptions options = new ChromeOptions();

// Essential flags for Docker/Headless/Jenkins environments
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        //options.addArguments("--headless"); // Optional, depending on your use case
        options.addArguments("--remote-allow-origins=*");


// Fix the user-data-dir issue:
      //  options.addArguments("--user-data-dir=/tmp/chrome-user-data-" + System.currentTimeMillis());

        // ✅ Ensure a unique user-data-dir is used (to avoid "already in use" error)
        String tempProfile = System.getProperty("java.io.tmpdir") + "/profile-" + UUID.randomUUID();
        options.addArguments("--user-data-dir=" + tempProfile);

        // Optional: explicitly set binary if you're using custom chrome
        // options.setBinary("/usr/bin/google-chrome");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
