package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLocators {
    private WebDriver _driver;
    private By textsearch = By.xpath("//input[@id='twotabsearchtextbox']");
    private By btn =By.xpath("//input[@id='nav-search-submit-button']");



    public AmazonLocators(WebDriver driver){
        this._driver=driver;
    }
    public void searchtextbox(String required){
        _driver.findElement(this.textsearch).sendKeys(required);
        _driver.findElement(this.btn).click();

    }
}
