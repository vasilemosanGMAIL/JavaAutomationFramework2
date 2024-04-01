package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShoppingCart extends BasePage {
    private WebDriver driver;
    private final By havePromo = By.cssSelector(".promo-code-button .collapse-button");
    private final By promoTextbox = By.cssSelector("input[name='discount_name']");
    private final By promoAddBtn = By.cssSelector("form[method='post']  span");
    private final By proceedToCheckoutBtn = By.cssSelector(".cart-detailed-actions .btn-primary");
    private final By deleteItemOne = By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
    private final By deleteItemTwo = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
    private final By totalValue = By.cssSelector(".cart-total .value");

    public ShoppingCart() throws IOException {
        super();
    }

    public WebElement getHavePromo() {
        this.driver = getDriver();
        return driver.findElement(havePromo);
    }

    public WebElement getPromoTextbox() {
        this.driver = getDriver();
        return driver.findElement(promoTextbox);
    }

    public WebElement getPromoAddBtn() {
        this.driver = getDriver();
        return driver.findElement(promoAddBtn);
    }

    public WebElement getProceedCheckoutBtn() {
        this.driver = getDriver();
        return driver.findElement(proceedToCheckoutBtn);
    }

    public WebElement getDeleteItemOne() {
        this.driver = getDriver();
        return driver.findElement(deleteItemOne);
    }

    public WebElement getDeleteItemTwo() {
        this.driver = getDriver();
        return driver.findElement(deleteItemTwo);
    }

    public WebElement getTotalAmount() {
        this.driver = getDriver();
        return driver.findElement(totalValue);
    }
}
