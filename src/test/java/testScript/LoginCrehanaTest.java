package testScript;

import baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LandingPage;
import utilities.LoginFunctions;

public class LoginCrehanaTest extends BaseClass {
    @Test
    public void userLoginSuccess() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        HomePage home = new HomePage(driver);

        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        WebElement element = home.welcomeAssert();
        Assert.assertEquals(element.getText(), "¡Te damos la bienvenida a Crehana!");
        System.out.println("Prueba OK..." + element.getText());
    }

    @Test
    public void userLoginEmailIncorrect()throws Exception{
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        HomePage home = new HomePage(driver);

        loginFunctions.loginActions("user.error@mailinator.com", "1234567890");
        Thread.sleep(2000);

        WebElement element = home.welcomeAssert();
        Assert.assertEquals(element.getText(), "¡Te damos la bienvenida a Crehana!");
        System.out.println("Prueba OK..." + element.getText());
    }

}