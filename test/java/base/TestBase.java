package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utilities.WebDriverFactory;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

   // @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}
