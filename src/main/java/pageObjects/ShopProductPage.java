package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopProductPage extends BasePage {

    private WebDriver driver;

    private final By sizeOption = By.cssSelector("[data-product-attribute='1']");
    private final By quantityIncrease = By.cssSelector(".touchspin-up");
    private final By quantityDecrease = By.cssSelector(".touchspin-down");
    private final By addToCartBtn = By.cssSelector(".add-to-cart.btn.btn-primary");
    private final By homepageLink = By.xpath("//span[.='Home']");

    public ShopProductPage() throws IOException {
        super();
    }

    public WebElement getSizeOption() {
        this.driver = getDriver();
        return driver.findElement(sizeOption);
    }

    public WebElement getQuantIncrease() {
        this.driver = getDriver();
        return driver.findElement(quantityIncrease);
    }

    public WebElement getQuantDecrease() {
        this.driver = getDriver();
        return driver.findElement(quantityDecrease);
    }

    public WebElement getAddToCartBtn() {
        this.driver = getDriver();
        return driver.findElement(addToCartBtn);
    }

    public WebElement getHomepageLink() {
        this.driver = getDriver();
        return driver.findElement(homepageLink);
    }

}