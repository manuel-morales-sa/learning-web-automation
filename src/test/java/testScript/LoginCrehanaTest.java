package testScript;

import baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginCrehanaPage;

public class LoginCrehanaTest extends BaseClass {
    @Test
    public void userLoginSuccess()throws Exception{
        LandingPage lp = new LandingPage(driver);
        LoginCrehanaPage lcp = new LoginCrehanaPage(driver);
        HomePage hp = new HomePage(driver);

        Thread.sleep(1000);
        lp.landingLoginButton();
        lcp.LoginEmailTextInput("automation.user@crehana.com");
        lcp.LoginPasswordTextInput("1234567890");
        lcp.LoginStartSessionButton();
        //hp.welcomeAssert();
        Thread.sleep(2000);

        WebElement element = hp.welcomeAssert();
        Assert.assertEquals(element.getText(),"¡Te damos la bienvenida a Crehana!");
        System.out.println("Prueba OK..." + element.getText());
        driver.navigate().refresh();
    }

    /*@Test
    public void userLoginEmailIncorrect()throws Exception{
        LandingPage lp = new LandingPage(driver);
        LoginCrehanaPage lcp = new LoginCrehanaPage(driver);
        HomePage hp = new HomePage(driver);

        Thread.sleep(1000);
        lp.landingLoginButton();
        lcp.LoginEmailTextInput("correo.error@crehana.com");
        lcp.LoginPasswordTextInput("1234567890");
        lcp.LoginStartSessionButton();
        Thread.sleep(2000);

        WebElement element = hp.welcomeAssert();
        Assert.assertEquals(element.getText(),"¡Te damos la bienvenida a Crehana!");
        System.out.println("Prueba OK..." + element.getText());
    }*/
}
