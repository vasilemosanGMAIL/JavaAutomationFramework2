package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopHomepage extends BasePage {
    private WebDriver driver;

    private final By productOne = By.linkText("Hummingbird Printed T-Shirt");
    private final By productTwo = By.linkText("Hummingbird Printed Sweater");
    private final By productThree = By.linkText("The Best Is Yet To Come'...");
    private final By productFour = By.linkText("The Adventure Begins Framed...");
    private final By productFive = By.linkText("Today Is A Good Day Framed...");
    private final By productSix = By.linkText("Mug The Best Is Yet To Come");
    private final By productSeven = By.linkText("Mug The Adventure Begins");
    private final By productEight = By.linkText("Mug Today Is A Good Day");
    private final By loginBtn = By.cssSelector("[title] .hidden-sm-down");

    public ShopHomepage() throws IOException {
        super();
    }

    public WebElement getProdOne() {
        this.driver = getDriver();
        return driver.findElement(productOne);
    }

    public WebElement getProdTwo() {
        this.driver = getDriver();
        return driver.findElement(productTwo);
    }

    public WebElement getProdThree() {
        this.driver = getDriver();
        return driver.findElement(productThree);
    }

    public WebElement getProdFour() {
        this.driver = getDriver();
        return driver.findElement(productFour);
    }

    public WebElement getProdFive() {
        this.driver = getDriver();
        return driver.findElement(productFive);
    }

    public WebElement getProdSix() {
        this.driver = getDriver();
        return driver.findElement(productSix);
    }

    public WebElement getProdSeven() {
        this.driver = getDriver();
        return driver.findElement(productSeven);
    }

    public WebElement getProdEight() {
        this.driver = getDriver();
        return driver.findElement(productEight);
    }

    public WebElement getLoginBtn(){
        this.driver = getDriver();
        return driver.findElement(loginBtn);
    }
}
