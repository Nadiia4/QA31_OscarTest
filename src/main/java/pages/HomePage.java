package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

WebElement homePageLink = driver.findElement(By.xpath("//a[conteins(.,'Oscar')]"));
WebElement loginAndregisterButton = driver.findElement(By.id(""));
    public void homeLinkIsVisible() {
        return homePageLink.isDisplayed();
    }


    public void clickToButtonLoginAndRegisterButton() {


    }
}
