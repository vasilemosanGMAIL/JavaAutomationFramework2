package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormPersInfo extends BasePage {
    private WebDriver driver;

    private final By genderMr = By.cssSelector("label:nth-of-type(1) > .custom-radio > input[name='id_gender']");
    private final By genderMrs = By.cssSelector("label:nth-of-type(2) > .custom-radio > input[name='id_gender']");
    private final By firstNameField = By.cssSelector("input[name='firstname']");
    private final By lastNameField = By.cssSelector("input[name='lastname']");
    //depricated:	By emailField = By.cssSelector("form#customer-form > section input[name='email']");
    private final By emailField = By.cssSelector("input#field-email"); //ADDDED 2024-03-15
    private final By passwordField = By.cssSelector("form#customer-form > section input[name='password']");
    private final By birthDateField = By.cssSelector("input[name='birthday']");
    private final By receiveOffersCheckbox = By.cssSelector("div:nth-of-type(7)  span > label > span");
    private final By newsletterCheckbox = By.cssSelector("div:nth-of-type(8)  span > label > span");
    private final By termsConditionsCheckbox = By.cssSelector("input[name='psgdpr']");
    private final By continueBtn = By.cssSelector("form#customer-form  button[name='continue']");

    public OrderFormPersInfo() throws IOException {
        super();
    }

    public WebElement getGenderMr() {
        this.driver = getDriver();
        return driver.findElement(genderMr);
    }

    public WebElement getGenderMrs() {
        this.driver = getDriver();
        return driver.findElement(genderMrs);
    }

    public WebElement getFirstNameField() {
        this.driver = getDriver();
        return driver.findElement(firstNameField);
    }

    public WebElement getLastnameField() {
        this.driver = getDriver();
        return driver.findElement(lastNameField);
    }

    public WebElement getEmailField() {
        this.driver = getDriver();
        return driver.findElement(emailField);
    }

    public WebElement getPasswordField() {
        this.driver = getDriver();
        return driver.findElement(passwordField);
    }

    public WebElement getBirthDateField() {
        this.driver = getDriver();
        return driver.findElement(birthDateField);
    }

    public WebElement getRecOfferCheckbox() {
        this.driver = getDriver();
        return driver.findElement(receiveOffersCheckbox);
    }

    public WebElement getNewsletterCheckbox() {
        this.driver = getDriver();
        return driver.findElement(newsletterCheckbox);
    }

    public WebElement getTermsConditionsCheckbox() {
        this.driver = getDriver();
        return driver.findElement(termsConditionsCheckbox);
    }

    public WebElement getContinueBtn() {
        this.driver = getDriver();
        return driver.findElement(continueBtn);
    }

}
