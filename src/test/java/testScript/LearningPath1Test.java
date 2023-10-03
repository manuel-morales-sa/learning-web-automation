package testScript;

import baseClass.BaseClass;
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
    public void CreateTrackWithCoursesRequiredAndRewards() throws Exception {
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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        learningPathABMPage.buttonCreatePath();
        learningPathABMPage.buttonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.nameNewTrack();
        createTrackPage.inputNameNewTrackSet("QA Track Con Rewards");
        createTrackPage.addRewards();
        createTrackPage.addCoursesInTrack("ia");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.selectFirtsCourseInTrack();
        createTrackPage.select2CourseInTrack();
        createTrackPage.select3CourseInTrack();
        createTrackPage.select4CourseInTrack();
        Thread.sleep(8000);// Dejo un tiempo hasta validar como eliminar el popup que aparece
        createTrackPage.select5CourseInTrack();
        Thread.sleep(8000);
        createTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.buttonSubstraccionCourse();
        createTrackPage.buttonPlusRewards();
        createTrackPage.dateStart();
        createTrackPage.dateFinish();
        createTrackPage.buttonNext();
        createTrackPage.selectFirstUser();
        createTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement elemento = learningPathABMPage.resumeListUsers();
        Assert.assertEquals(elemento.getText(), "1 usuarios");
        createTrackPage.buttonConfirmTrack();
        Thread.sleep(10000);
        WebElement elemento0 = learningPathABMPage.messageGenial();
        Assert.assertEquals(elemento0.getText(), "¡Genial! Estás a punto de dar un gran paso");
        WebElement elemento1 = learningPathABMPage.messageGenialConfirmar();
        Assert.assertEquals(elemento1.getText(), "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        createTrackPage.buttonConfirmTrackFinal();
        Thread.sleep(12000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel/content/paths/");
        Thread.sleep(6000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Con Rewards");
        WebElement elemento2 = learningPathABMPage.nameCourseQATrackConCursosRequeridosGet();
        Assert.assertEquals(elemento2.getText(), "QA Track Con Rewards");
        WebElement elemento3 = learningPathABMPage.contadorCoursesRequired();
        Assert.assertEquals(elemento3.getText(), "4\n" + "/5");
        driver.navigate().refresh();
    }
}
