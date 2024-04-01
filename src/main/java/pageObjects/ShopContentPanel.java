package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopContentPanel extends BasePage {
    private WebDriver driver;

    private final By continueShoppingBtn = By.xpath("//button[contains(text(), 'Continue')]");
    private final By checkoutBtn = By.partialLinkText("CHECKOUT");

    public ShopContentPanel() throws IOException {
        super();
    }

    public WebElement getContinueShopBtn() {
        this.driver = getDriver();
        return driver.findElement(continueShoppingBtn);
    }

    public WebElement getCheckoutBtn() {
        this.driver = getDriver();
        return driver.findElement(checkoutBtn);
    }
}
