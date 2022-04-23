package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AmazonLocators;

public class Amazon {
    private WebDriver _driver;
    @BeforeMethod
    public void openbroser(){
        System.setProperty("webdriver.chrome.driver","src/test/java/dependcies/chromedriver.exe");
        _driver =new ChromeDriver();
        _driver.manage().window().maximize();
    }
    @Test
    public void search(){
        _driver.get("https://www.amazon.in/");
        AmazonLocators amazonLocators =new AmazonLocators(_driver);
        amazonLocators.searchtextbox("oneplusnord");

    }


}
