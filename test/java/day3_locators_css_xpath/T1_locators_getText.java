package day3_locators_css_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.DocuportConstants;
import utilities.WebDriverFactory;

public class T1_locators_getText {
    public static void main(String[] args) {



        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");


        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys(DocuportConstants.USERNAME_CLIENT);


        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();

        WebElement errorMessageForEmptyPassword = driver.findElement(By.className("v-messages__message"));
        String actualErrorMessage = errorMessageForEmptyPassword.getText();

        if (actualErrorMessage.equals(DocuportConstants.ERROR_MASSAGE_FOR_EMPTY_PASSWORD)){
            System.out.println("Expected error message; " + DocuportConstants.ERROR_MASSAGE_FOR_EMPTY_PASSWORD + ", matches actual error message: " + actualErrorMessage + ", Test Pass");
        }else{
            System.out.println("Expected error message; " + DocuportConstants.ERROR_MASSAGE_FOR_EMPTY_PASSWORD + ", matches actual error message: " + actualErrorMessage);
            System.out.println("TEST FAILED");
        }
        driver.quit();
    }
}
