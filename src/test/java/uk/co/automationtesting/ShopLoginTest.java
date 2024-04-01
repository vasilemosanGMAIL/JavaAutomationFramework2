package uk.co.automationtesting;

import base.ExtentManager;
import base.Hooks;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.Homepage;
import pageObjects.ShopHomepage;
import pageObjects.ShopLoginPage;
import pageObjects.ShopYourAccount;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Listeners(resources.Listeners.class)
public class ShopLoginTest extends Hooks {
    public ShopLoginTest() throws IOException {
    }

    @Test
    public void addRemoveItem() throws IOException, InterruptedException {
        ExtentManager.log("Starting ShopLoginTest...");
        var home = new Homepage();
        home.getCookie().click();
        home.getTestStoreLink().click();
        var shopHome = new ShopHomepage();
        shopHome.getLoginBtn().click();
        //Login
        var workbookLocation = new FileInputStream(System.getProperty("user.dir") + File.separator + "src"
                + File.separator + "main" + File.separator + "java" + File.separator + "resources" + File.separator +
                "credentials.xlsx");

        var workbook = new XSSFWorkbook(workbookLocation);
        //sheet index => point to Sheet1 in the Excel file
        var sheet = workbook.getSheetAt(0);
        Row row1 = sheet.getRow(5);
        //here we retrieve email
        Cell cellR1C0 = row1.getCell(0);
        //here we retrieve password
        Cell cellR1C1 = row1.getCell(1);
        //Converting email and password to strings
        String emailRow1 = cellR1C0.toString();
        String passwordRow1 = cellR1C1.toString();

        var shop = new ShopLoginPage();
        shop.getEmail().sendKeys(emailRow1);
        shop.getPassword().sendKeys(passwordRow1);
        shop.getSubmitBtn().click();

        var yourAcc = new ShopYourAccount();
        try{
            yourAcc.getSingOutBtn().click();
            ExtentManager.pass("user HAS signed in");
        }catch (Exception e){
            ExtentManager.fail("user could NOT sign in");
            Assert.fail();
        }
        //yourAcc.getSingOutBtn().click();
        //data from row 2 of excel
        Row row2 = sheet.getRow(2);
        Cell cellR2C0 = row2.getCell(0);
        Cell cellR2C1 = row2.getCell(1);
        String emailRow2 = cellR2C0.toString();
        String passwordRow2 = cellR2C1.toString();
        //Login with another user credentials from Excel file
        shopHome.getLoginBtn().click();
        shop.getEmail().sendKeys(emailRow2);
        shop.getPassword().sendKeys(passwordRow2);
        shop.getSubmitBtn().click();
        try{
            yourAcc.getSingOutBtn().click();
            ExtentManager.pass("user HAS signed in");
        }catch (Exception e){
            ExtentManager.fail("user could NOT sign in");
            Assert.fail();
        }
    }

}
