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
    public void DCreateTrackWithCoursesRequired() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage createTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        Thread.sleep(6000);
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
        Thread.sleep(6000);
        panelPage.popUpPanelAdminCenter();
        panelPage.popUpPanelAdminClose();
        Thread.sleep(2000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        learningPathABMPage.buttonCreatePath();
        learningPathABMPage.buttonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.nameNewTrack();
        createTrackPage.inputNameNewTrackSet("QA Track Con 3 Cursos Requeridos");
        createTrackPage.addCoursesInTrack("ia");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.selectFirtsCourseInTrack();
        createTrackPage.select2CourseInTrack();
        createTrackPage.popUpInTrack();
        createTrackPage.buttonEntendido();
        createTrackPage.select3CourseInTrack();

        Thread.sleep(2000);
        createTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.dateStart();
        createTrackPage.dateFinish();
        createTrackPage.buttonNext();
        createTrackPage.selectFirstUser();
        createTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement elemento = createTrackPage.resumeListUsers();
        Assert.assertEquals(elemento.getText(), "1 usuarios");
        createTrackPage.buttonConfirmTrack();
        Thread.sleep(10000);
        WebElement elemento0 = createTrackPage.messageGenial();
        Assert.assertEquals(elemento0.getText(), "¡Genial! Estás a punto de dar un gran paso");
        WebElement elemento1 = createTrackPage.messageGenialConfirmar();
        Assert.assertEquals(elemento1.getText(), "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        createTrackPage.buttonConfirmTrackFinal();
        Thread.sleep(12000);
        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/content/paths/");
        Thread.sleep(6000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Con 3 Cursos Requeridos");
        WebElement elemento3 = learningPathABMPage.nameCourseGet();
        Assert.assertEquals(elemento3.getText(), "QA Track Con 3 Cursos Requeridos");
        WebElement elemento4 = learningPathABMPage.contadorCoursesRequired();
        Assert.assertEquals(elemento4.getText(), "3\n" + "/3");
        driver.navigate().refresh();
    }
}