package testScript;

import baseClass.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateTrackPage;
import pages.LearningPathABMPage;
import pages.LearningPathPage;
import pages.PanelPage;
import utilities.LoginFunctions;
import java.util.concurrent.TimeUnit;

public class LearningPath1Test extends BaseClass {
    @Test
    public void AdminAddUsersInPathActual() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        LearningPathPage learningPathPage = new LearningPathPage(driver);

        driver.manage().window().maximize();
        Thread.sleep(5000);
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
        Thread.sleep(6000);
        panelPage.popUpPanelAdminCenter();
        panelPage.popUpPanelAdminClose();
        Thread.sleep(2000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        Thread.sleep(6000);
        learningPathABMPage.inputLearningPathsC();
        WebElement elemento0 = learningPathABMPage.tittleLearningPaths();
        Assert.assertEquals(elemento0.getText(), "Rutas de aprendizajes");
        learningPathABMPage.inputLearningPaths("QA Track Con Rewards");
        Thread.sleep(2000);
        learningPathABMPage.nameCourseQATrackConCursosRequeridos();
        Thread.sleep(3000);
        WebElement elemento1 = learningPathPage.titleCourseInCOurse();
        Assert.assertEquals(elemento1.getText(), "QA Track Con Rewards");
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.addUser();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.inputAddUserC();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(6000);
        learningPathPage.inputAddUserText("robot.1@mailinator.com");
        Thread.sleep(8000);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.inputAddUserClickUser();
        learningPathPage.buttonConfirmAddUsersValidated();
        WebElement elemento2 = learningPathPage.messageAddUserOk();
        Assert.assertEquals(elemento2.getText(), "Usuario(s) agregado(s) satisfactoriamente");
        Thread.sleep(6000);
        WebElement element = learningPathPage.nameFirstUser();
        Assert.assertEquals(element.getText(), "Robot 1");
        Thread.sleep(3000);
        driver.navigate().refresh();
    }
}