package testScript;

import baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserAdministratorGamification;
import pages.UserAdministratorPage;
import utilities.LoginFunctions;

public class Gamification extends BaseClass {

    @Test
    public void Gamification() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        UserAdministratorPage userAdministratorPage = new UserAdministratorPage(driver);
        UserAdministratorGamification userAdministratorGamification = new UserAdministratorGamification(driver);

        driver.manage().window().maximize();
        Thread.sleep(5000);
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
        Thread.sleep(10000);
        userAdministratorGamification.buttonGamificacion();
        userAdministratorGamification.buttonProgressGamificacion();
        Thread.sleep(2000);

        WebElement elemento0 = userAdministratorGamification.TitleGamificacion();
        Assert.assertEquals(elemento0.getText(), "Gamificación");





    }
}
