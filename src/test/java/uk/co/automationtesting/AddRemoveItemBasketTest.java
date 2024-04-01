package uk.co.automationtesting;

import base.ExtentManager;
import base.Hooks;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObjects.*;

import java.io.IOException;

@Listeners(resources.Listeners.class)
public class AddRemoveItemBasketTest extends Hooks {
    public AddRemoveItemBasketTest() throws IOException {
    }

    @Test
    public void addRemoveItem() throws InterruptedException, IOException {
        ExtentManager.log("Starting AddRemoveItemBasketTest...");
        var home = new Homepage();
        home.getCookie().click();
        home.getTestStoreLink().click();
        /* JavascriptExecutor jse = (JavascriptExecutor)getDriver();
        jse.executeScript("arguments[0].scrollIntoView()", home.getTestStoreLink());
        home.getTestStoreLink().click(); */
        var shopHome = new ShopHomepage();
        ExtentManager.pass("Reached the homepage");
        shopHome.getProdOne().click();

        var shopProd = new ShopProductPage();
        ExtentManager.pass("Reached the product page");
        var option  = new Select(shopProd.getSizeOption());
        option.selectByVisibleText("M");
        ExtentManager.pass("Have successfully selected product size");
        shopProd.getQuantIncrease().click();
        shopProd.getAddToCartBtn().click();
        Thread.sleep(3000);

        var cPanel = new ShopContentPanel();
        cPanel.getContinueShopBtn().click();
        shopProd.getHomepageLink().click();
        shopHome.getProdTwo().click();
        shopProd.getAddToCartBtn().click();
        Thread.sleep(3000);
        cPanel.getCheckoutBtn().click();

        var cart = new ShoppingCart();
        cart.getDeleteItemTwo().click();
        //using wait to ensure the deletion has taken place
        waitForElementInvisible(cart.getDeleteItemTwo(), 3);
        var amount = cart.getTotalAmount().getText();
        System.out.println(amount);
        try{
            Assert.assertEquals(amount, "$49.24", "Amount is not correct " + amount);
            ExtentManager.pass("The total amount matches the expected amount");
        }catch(AssertionError e){
            Assert.fail("Cart amount did not match the expected amount");
            ExtentManager.fail("The total amount matches the expected amount.");
        }
    }

}
