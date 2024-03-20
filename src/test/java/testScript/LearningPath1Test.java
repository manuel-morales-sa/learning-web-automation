package testScript;

import baseClass.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.LoginFunctions;
import java.util.concurrent.TimeUnit;

public class LearningPath1Test extends BaseClass {
    @Test
    public void KloginStudentInPtah() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        StudentHomePage studentHomePage = new StudentHomePage(driver);

        driver.manage().window().maximize();
        Thread.sleep(5000);
        loginFunctions.loginActions("robot.1@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://www.crehana.com/org/qa-automation/learn/");
        Thread.sleep(5000);
        studentHomePage.contentButtonStudent();
        studentHomePage.learnPathButton();
        Thread.sleep(4000);
        WebElement elemento = studentHomePage.namePathGetStudent();
        Thread.sleep(3000);
        Assert.assertEquals(elemento.getText(), "QA Track Con Rewards");

        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
        Thread.sleep(6000);
        panelPage.popUpPanelAdminCenter();
        panelPage.popUpPanelAdminClose();
        Thread.sleep(2000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathABMPage.inputLearningPathsC();
        WebElement elemento0 = learningPathABMPage.tittleLearningPaths();
        Assert.assertEquals(elemento0.getText(), "Rutas de aprendizajes");
        learningPathABMPage.inputLearningPaths("QA Track Con Rewards");
        Thread.sleep(5000);
        learningPathABMPage.menuWithOptions();
        learningPathABMPage.buttonDeactivatePath();
        WebElement elemento1 = learningPathABMPage.messageQuestionDeactivate();
        Assert.assertEquals(elemento1.getText(), "¿Deseas desactivar la ruta?");
        learningPathABMPage.buttonConfirmDeactivate();
        Thread.sleep(3000);
        driver.navigate().to("https://www.crehana.com/org/qa-automation/learn/");
        Thread.sleep(5000);
        studentHomePage.contentButtonStudent();
        studentHomePage.learnPathButton();
        Thread.sleep(4000);
        WebElement elemento2 = studentHomePage.pathDeactivate();
        Thread.sleep(3000);
        Assert.assertEquals(elemento2.getText(), "Ruta deshabilitada");
    }

}