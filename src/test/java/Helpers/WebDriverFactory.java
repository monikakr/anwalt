package Helpers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;


public class WebDriverFactory {
    private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

    private static WebDriver driver;

    public static WebDriver getWebDriver() {
        if (driver != null) {
            return driver;
        }
        driver = drivers.get("Chrome");
        if (driver == null) {
            //  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            drivers.put("Chrome", driver);
        }
        return driver;
    }

    public static void disposeDriver() {
        for (String key : drivers.keySet()) {
            drivers.get(key).close();
            drivers.get(key).quit();
        }
    }
}
