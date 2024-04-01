package uk.co.automationtesting;

import base.ExtentManager;
import base.Hooks;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;

@Listeners(resources.Listeners.class)
public class OrderCompleteTest extends Hooks {

    public OrderCompleteTest() throws IOException {
        super();
    }

    @Test
    public void endToEndTest() throws InterruptedException, IOException {
        ExtentManager.log("Starting OrderCompleteTest...");
        var home = new Homepage();
        home.getCookie().click();
        home.getTestStoreLink().click();
        ExtentManager.pass("Reached the store homepage");
        /* JavascriptExecutor jse = (JavascriptExecutor)getDriver();
        jse.executeScript("arguments[0].scrollIntoView()", home.getTestStoreLink());
        home.getTestStoreLink().click(); */
        var shopHome = new ShopHomepage();
        shopHome.getProdOne().click();
        ExtentManager.pass("Reached the shop product page");
        var shopProd = new ShopProductPage();
        var option  = new Select(shopProd.getSizeOption());
        option.selectByVisibleText("M");
        shopProd.getQuantIncrease().click();
        shopProd.getAddToCartBtn().click();

        Thread.sleep(3000);

        var cPanel = new ShopContentPanel();
        cPanel.getCheckoutBtn().click();

        var cart = new ShoppingCart();
        cart.getHavePromo().click();
        Thread.sleep(1000);
        cart.getPromoTextbox().sendKeys("20OFF");
        cart.getPromoAddBtn().click();
        Thread.sleep(3000);
        cart.getProceedCheckoutBtn().click();
        var pInfo = new OrderFormPersInfo();
        pInfo.getGenderMr().click();
        pInfo.getFirstNameField().sendKeys("Vasile");
        pInfo.getLastnameField().sendKeys("Mosan");
        pInfo.getEmailField().sendKeys("johnsmith@test.com");
        pInfo.getTermsConditionsCheckbox().click();
        Thread.sleep(3000);
        pInfo.getContinueBtn().click();
        var orderDelivery = new OrderFormDelivery();
        orderDelivery.getAddressField().sendKeys("123 Main Street");
        orderDelivery.getCityField().sendKeys("Huston");
        var state  = new Select(orderDelivery.getStateDropdown());
        state.selectByVisibleText("Texas");
        orderDelivery.getPostcodeField().sendKeys("77021");
        Thread.sleep(3000);
        orderDelivery.getContinueBtn().click();
        var shipMethod = new OrderFormShippingMethod();
        shipMethod.getDeliveryMsgTextbox().sendKeys("If I am not in, please leave my delivery on my porch");
        Thread.sleep(3000);
        shipMethod.getContinueBtn().click();
        var orderPay = new OrderFormPayment();
        orderPay.getPayByCheckRadioBtn().click();
        orderPay.getTermsConditionsCheckbox().click();
        Thread.sleep(3000);
        orderPay.getOrderBtn().click();
        ExtentManager.pass("Have successfully placed order");
    }

}
