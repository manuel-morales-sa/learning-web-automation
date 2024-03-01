package baseClass;

import com.sun.activation.registries.MailcapParseException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    @BeforeMethod()
    @Parameters({"url"})
    public void initialize(String url) throws InterruptedException, MailcapParseException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.get(url);
    }

    @AfterMethod
    public void afterTest() {
        System.out.println("Borrando browser");
        driver.quit();
    }

}