package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class BasePage {
    private String url;
    private Properties prop;
    public static String screenshotDestinationPath;

    public BasePage() throws IOException {
        prop = new Properties();
        String basePath = System.getProperty("user.dir");
        String propertiesFile = basePath + File.separator + "src" + File.separator + "main" + File.separator + "java" +
                File.separator + "resources" + File.separator + "config.properties";
        FileInputStream data = new FileInputStream(propertiesFile);
        prop.load(data);
    }

    public static WebDriver getDriver() {
        return WebDriverInstance.getDriver();
    }

    public String getUrl() {
        return url = prop.getProperty("url");
    }

    public static String takeSnapShot(String name) throws IOException {
        File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        String destFile = System.getProperty("user.dir") + File.separator + "target"
                + File.separator + "screenshots" + File.separator + timestamp() + ".png";
        screenshotDestinationPath = destFile;
        try{
            FileUtils.copyFile(srcFile, new File(destFile));
        }catch (IOException e){
            e.printStackTrace();
        }
        return name;
    }

    public static String timestamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

    public static String getScreenshotDestinationPath(){
        return screenshotDestinationPath;
    }

    public static void waitForElementInvisible(WebElement element, int timerInSeconds){
        var wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timerInSeconds));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}
