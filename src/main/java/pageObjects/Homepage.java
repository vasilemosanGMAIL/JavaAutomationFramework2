package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Homepage extends BasePage {
    private WebDriver driver;

    private final By toggle = By.cssSelector(".toggle");
    private final  By homeLink = By.linkText("HOMEPAGE");
    private final  By accordionLink = By.linkText("ACCORDION");
    private final  By browserTabLink = By.linkText("BROWSER TABS");
    private final  By buttonsLink = By.linkText("BUTTONS");
    private final  By calcLink = By.linkText("CALCULATOR (JS)");
    private final  By contactUsLink = By.linkText("CONTACT US FORM TEST");
    private final  By datePickerLink = By.linkText("DATE PICKER");
    private final  By dropdownLink = By.linkText("DROPDOWN CHECKBOX & RADIO");
    private final  By fileUpload = By.linkText("FILE UPLOAD");
    private final  By hiddenElementsLink = By.linkText("HIDDEN ELEMENTS");
    private final  By iFrameLink = By.linkText("IFRAME");
    private final  By loaderLink = By.linkText("LOADER");
    private final  By loginPortalLink = By.linkText("LOGIN PORTAL TEST");
    private final  By mouseLink = By.linkText("MOUSE MOVEMENT");
    private final  By popupLink = By.linkText("POP UPS & ALERTS");
    private final  By predictiveLink = By.linkText("PREDICTIVE SEARCH");
    private final  By tablesLink = By.linkText("TABLES");
    private final  By testStoreLink = By.linkText("TEST STORE");
    private final  By aboutMeLink = By.linkText("ABOUT ME");
    private final  By cookie = By.cssSelector(".close-cookie-warning > span");

    public Homepage()  throws IOException {
        super();
    }

    public WebElement getToggle() {
        this.driver = getDriver();
        return driver.findElement(toggle);
    }

    public WebElement getHomepageLink() {
        this.driver = getDriver();
        return driver.findElement(homeLink);
    }

    public WebElement getAccordionLink() {
        this.driver = getDriver();
        return driver.findElement(accordionLink);
    }

    public WebElement getBrowserTabLink() {
        this.driver = getDriver();
        return driver.findElement(browserTabLink);
    }

    public WebElement getButtonLink() {
        this.driver = getDriver();
        return driver.findElement(buttonsLink);
    }

    public WebElement getCalcLink() {
        this.driver = getDriver();
        return driver.findElement(calcLink);
    }

    public WebElement getContactUsLink() {
        this.driver = getDriver();
        return driver.findElement(contactUsLink);
    }

    public WebElement getDatePickerLink() {
        this.driver = getDriver();
        return driver.findElement(datePickerLink);
    }

    public WebElement getDropdownLink() {
        this.driver = getDriver();
        return driver.findElement(dropdownLink);
    }

    public WebElement getFileUploadLink() {
        this.driver = getDriver();
        return driver.findElement(fileUpload);
    }

    public WebElement getHiddenElementsLink() {
        this.driver = getDriver();
        return driver.findElement(hiddenElementsLink);
    }

    public WebElement getIframeLink() {
        this.driver = getDriver();
        return driver.findElement(iFrameLink);
    }

    public WebElement getLoaderLink() {
        this.driver = getDriver();
        return driver.findElement(loaderLink);
    }

    public WebElement getLoginPortalLink() {
        this.driver = getDriver();
        return driver.findElement(loginPortalLink);
    }

    public WebElement getMouseLink() {
        this.driver = getDriver();
        return driver.findElement(mouseLink);
    }

    public WebElement getPopupLink() {
        this.driver = getDriver();
        return driver.findElement(popupLink);
    }

    public WebElement getPredictiveLink() {
        this.driver = getDriver();
        return driver.findElement(predictiveLink);
    }

    public WebElement getTablesLink() {
        this.driver = getDriver();
        return driver.findElement(tablesLink);
    }

    public WebElement getTestStoreLink() {
        this.driver = getDriver();
        return driver.findElement(testStoreLink);
    }

    public WebElement getAboutMeLink() {
        this.driver = getDriver();
        return driver.findElement(aboutMeLink);
    }

    public WebElement getCookie() {
        this.driver = getDriver();
        return driver.findElement(cookie);
    }

}
