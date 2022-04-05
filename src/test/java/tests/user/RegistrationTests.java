package tests.user;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginAndRegisterPage;
import tests.TestBase;

public class RegistrationTests extends TestBase {

    HomePage homePage;
    LoginAndRegisterPage loginAndRegisterPage;
    LoginAndRegisterPage = new LoginAndRegisterPage(driver);

    @BeforeMethod
    public void intTest(){
        homePage = new HomePage(driver);
        loginAndRegisterPage = new LoginAndRegisterPage(driver);
    }

    @Test
    public void registrationPositiveTest(){

        homePage.clickToButtonLoginAndRegisterButton();
        Assert.assertTrue(loginAndRegisterPage.loginAndRegistrationFormIsOpened());


    }
}
