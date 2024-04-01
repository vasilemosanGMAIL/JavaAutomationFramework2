package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormShippingMethod extends BasePage {
    private WebDriver driver;

    private final By deliveryMsgTextbox = By.cssSelector("textarea#delivery_message");
    private final By continueBtn = By.cssSelector("[name='confirmDeliveryOption']");

    public OrderFormShippingMethod() throws IOException {
        super();
    }

    public WebElement getDeliveryMsgTextbox() {
        this.driver = getDriver();
        return driver.findElement(deliveryMsgTextbox);
    }

    public WebElement getContinueBtn() {
        this.driver = getDriver();
        return driver.findElement(continueBtn);
    }
}
