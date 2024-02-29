package testScript;

import baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LearningPathABMPage;
import pages.LearningPathPage;
import pages.PanelPage;
import pages.UserAdministratorPage;
import utilities.LoginFunctions;


public class CreateUserTest extends BaseClass {
    @Test
    public void CreateUser() throws Exception {
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
