package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebDriverInstance {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            try {
                driver.set(createDriver());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return driver.get();
    }

    public static WebDriver createDriver() throws IOException {
        WebDriver driver = null;
        var prop = new Properties();

        String basePath = System.getProperty("user.dir");
        String propertiesFile = basePath + File.separator + "src" + File.separator + "main" + File.separator + "java" +
                File.separator + "resources" + File.separator + "config.properties";
        FileInputStream data = new FileInputStream(propertiesFile);
        prop.load(data);

        if (prop.getProperty("browser").equals("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);
        } else if (prop.getProperty("browser").equals("edge")) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--incognito");
            driver = new EdgeDriver(options);
        }

        return driver;
    }

    public static void cleanupDriver() {
        driver.get().quit();
        driver.remove();
    }
}
