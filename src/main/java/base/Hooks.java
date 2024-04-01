package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class Hooks extends BasePage{

    public Hooks() throws IOException {
    }

    @BeforeTest
    public void setup(){
        getDriver().get(getUrl());
    }

    @AfterTest
    public void tearDown(){
        WebDriverInstance.cleanupDriver();
    }

}
