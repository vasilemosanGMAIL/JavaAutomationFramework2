package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopLoginPage extends BasePage {
    private WebDriver driver;
    private final By email = By.cssSelector("section input[name='email']");
    private final By password = By.cssSelector("section input[name='password']");
    private final By submitBtn = By.cssSelector("button#submit-login");

    public ShopLoginPage() throws IOException {
        super();
    }

    public WebElement getEmail() {
        this.driver = getDriver();
        return driver.findElement(email);
    }

    public WebElement getPassword() {
        this.driver = getDriver();
        return driver.findElement(password);
    }

    public WebElement getSubmitBtn() {
        this.driver = getDriver();
        return driver.findElement(submitBtn);
    }

}
