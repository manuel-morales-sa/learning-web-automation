package testScript;

import baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateTrackPage;
import pages.LearningPathABMPage;
import pages.PanelPage;
import utilities.LoginFunctions;
import java.util.concurrent.TimeUnit;

public class LearningPath1Test extends BaseClass {
    @Test
    public void deleteSaveDraftCourses() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage createTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(8000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        Thread.sleep(4000);
        WebElement elemento0 = learningPathABMPage.tittleLearningPaths();
        Assert.assertEquals(elemento0.getText(), "Rutas de aprendizajes");
        learningPathABMPage.sectionPreview();
        Thread.sleep(2000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Borrador");
        WebElement elemento = learningPathABMPage.nameCourseGet();
        Assert.assertEquals(elemento.getText(), "QA Track Borrador");
        Thread.sleep(4000);
        learningPathABMPage.menuWithOptions();
        Thread.sleep(2000);
        learningPathABMPage.optionDeletePathDraft();
        Thread.sleep(4000);
        WebElement elemento2 = learningPathABMPage.messageDeletePathDraft();
        Assert.assertEquals(elemento2.getText(), "¿Deseas eliminar el borrador");
        WebElement elemento3 = learningPathABMPage.messageDownAlertDelete();
        Assert.assertEquals(elemento3.getText(), "Una ves eliminado, no podrás recuperar el borrador y tendrás que crear una nueva ruta.");
        learningPathABMPage.buttonConfirmDeletePath();
        Thread.sleep(3000);
        WebElement elemento4 = learningPathABMPage.textPopUpAlert();
        Assert.assertEquals(elemento4.getText(), "Se ha eliminado el borrador QA Track Borrador éxitosamente");

    }
}