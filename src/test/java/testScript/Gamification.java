package testScript;

import baseClass.BaseClass;
import org.testng.annotations.Test;
import pages.UserAdministratorPage;
import utilities.LoginFunctions;

public class Gamification extends BaseClass {

    @Test
    public void Gamification() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        UserAdministratorPage userAdministratorPage = new UserAdministratorPage(driver);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
        Thread.sleep(5000);
        userAdministratorPage.buttonAdministration();

    }
}
