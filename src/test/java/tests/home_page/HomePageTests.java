package tests.home_page;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.TestBase;

import static helpers.APIHelper.thisIsStaticMethod;

public class HomePageTests extends TestBase {
HomePage homePage;

     @BeforeMethod
     public void intTest(){
     homePage = new HomePage(driver);

     }

    @Test
    public void homePageValidationTest(){

        Assert.assertTrue(homePage.homeLinkIsVisible(),"Home Link");

    }

    @Test
    public void test2(){
        //thisIsStaticMethod();
        System.out.println("This second test");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    @Test
    public void test3(){
        //thisIsStaticMethod();
        System.out.println("This third test");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
