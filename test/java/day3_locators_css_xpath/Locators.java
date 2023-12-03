package day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        // setup driver
        WebDriverManager.chromedriver().setup();

        // create the driver object
        WebDriver driver = new ChromeDriver();

        // navigate to google
        driver.get("https://www.google.com/");


        // maximize the window
        driver.manage().window().maximize();

        // locate the element
        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));
        WebElement searchBoxWithName = driver.findElement(By.name("q"));
        WebElement aboutLink = driver.findElement(By.linkText("About"));

        //aboutLink.click();

        //driver.quit();

        //create a string what you want to search

        searchBoxWithID.sendKeys("Feyruz is handsome");

        searchBoxWithID.clear();

        String textToSearch = "Loop Academy";
        searchBoxWithID.sendKeys(textToSearch + Keys.ENTER);



        String expectedURL = "https://www.google.com/search?q=Loop+Academy&sca_esv=587383573&source=hp&ei=J_VrZeaVCcHU5NoPsa2B0AI&iflsig=AO6bgOgAAAAAZWwDN-34ZHjZjAVemzJSt2g2aO9dh45s&ved=0ahUKEwimxfLrqPKCAxVBKlkFHbFWACoQ4dUDCAw&uact=5&oq=Loop+Academy&gs_lp=Egdnd3Mtd2l6IgxMb29wIEFjYWRlbXlIHlAAWB1wAHgAkAEAmAEAoAEAqgEAuAEDyAEA-AEB&sclient=gws-wiz" ;


        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains("Loop")) {
            System.out.println("Actual URL contains \"Loop\"");
        } else {
            System.out.println("Actual URL DOES NOT contain \"Loop\"");
        }

        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Loop Academy - Google Search")){
            System.out.println("Actual Title contains \"Loop\"");
        }else{
            System.out.println("Actual Title DOES NOT contain \"Loop\"");
        }
        driver.quit();
    }
}
