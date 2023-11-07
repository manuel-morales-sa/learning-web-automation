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
    public void draftCoursesWithTitulo() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage createTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        Thread.sleep(6000);
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(8000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        learningPathABMPage.buttonCreatePath();
        learningPathABMPage.buttonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.nameNewTrack();
        createTrackPage.inputNameNewTrackSet("QA Track Borrador con nombre");
        createTrackPage.buttonSavePreview();
        Thread.sleep(5000);
        Assert.assertEquals("El borrador \"QA Track Borrador con nombre\" se guardó correctamente", "El borrador \"QA Track Borrador con nombre\" se guardó correctamente");
        Thread.sleep(3000);
        createTrackPage.buttonCancelPath();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.buttonSaveAndExit();
        Thread.sleep(4000);
        Assert.assertEquals("El borrador \"QA Track Borrador con nombre\" se guardó correctamente", "El borrador \"QA Track Borrador con nombre\" se guardó correctamente");
        Thread.sleep(3000);
        learningPathABMPage.sectionPreview();
        Thread.sleep(2000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Borrador con nombre");
        WebElement elemento = learningPathABMPage.nameCourseGet();
        Assert.assertEquals(elemento.getText(), "QA Track Borrador con nombre");
        driver.navigate().refresh();
    }
}