package testScript;

import baseClass.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.LoginFunctions;

import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.window;

public class LoginCrehanaTest extends BaseClass {
    @Test
    public void userLoginSuccess() throws Exception {
        driver.manage().window().maximize();
        LoginFunctions lf = new LoginFunctions(driver);
        HomePage hp = new HomePage(driver);

        lf.loginActions("automation.user@crehana.com", "1234567890");
        Thread.sleep(3000);

        WebElement element = hp.welcomeAssert();
        Assert.assertEquals(element.getText(), "¡Te damos la bienvenida a Crehana!");
        System.out.println("Prueba OK..." + element.getText());

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Scroll Action Down
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        hp.googlePlayButton();
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
