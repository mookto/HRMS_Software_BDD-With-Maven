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
        try {
            // 🧹 Kill any leftover Chrome processes (optional but helpful in CI/WSL2)
            Runtime.getRuntime().exec("pkill chrome");

            ChromeOptions options = new ChromeOptions();

            // ✅ Recommended flags for stability in WSL2/Docker/Jenkins
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-setuid-sandbox");
            options.addArguments("--disable-software-rasterizer");
            options.addArguments("--disable-dev-tools");
            options.addArguments("--disable-infobars");
            options.addArguments("--headless=new"); // Use if running without GUI

            // ✅ Create a unique user data directory to avoid session conflicts
            String tempProfile = System.getProperty("java.io.tmpdir") + "/profile-" + UUID.randomUUID();
            options.addArguments("--user-data-dir=" + tempProfile);

            // 🚀 Launch Chrome
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();

        } catch (IOException e) {
            System.err.println("⚠️ Could not kill chrome processes: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("🚨 Failed to initialize ChromeDriver: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
