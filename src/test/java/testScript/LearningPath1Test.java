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
    public void CreatePathWithCoursesElevate() throws Exception{
        LoginFunctions LoginFunctions = new LoginFunctions(driver);
        PanelPage PanelPage = new PanelPage(driver);
        LearningPathABMPage LearningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage CreateTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        LoginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(8000);
        PanelPage.buttonContent();
        PanelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LearningPathABMPage.ButtonCreatePath();
        LearningPathABMPage.ButtonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.nameNewTrack();
        CreateTrackPage.inputNameNewTrackSet("QA Track Con Curso Elevate");
        CreateTrackPage.addCoursesInTrack("QA curso propio");
        Thread.sleep(8000);
        CreateTrackPage.select2CourseInTrack();
        Thread.sleep(8000);
        CreateTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.buttonSubstraccionCourse();
        CreateTrackPage.dateStart();
        CreateTrackPage.dateFinish();
        Thread.sleep(8000);
        CreateTrackPage.buttonNext();
        CreateTrackPage.selectFirstUser();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertEquals("1 usuarios", "1 usuarios", "1 usuarios");
        Thread.sleep(8000);
        CreateTrackPage.buttonConfirmTrack();
        Thread.sleep(8000);
        Assert.assertEquals("¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso");
        Assert.assertEquals("Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        CreateTrackPage.buttonConfirmTrackFinal();
        Thread.sleep(8000);
        Assert.assertEquals("¡Felicitaciones!\n" + "Creaste una nueva", "¡Felicitaciones!\n" + "Creaste una nueva", "¡Felicitaciones!\n" + "Creaste una nueva");
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel/content/paths/");
        Thread.sleep(6000);
        LearningPathABMPage.InputLearningPathsC();
        LearningPathABMPage.InputLearningPaths("QA Track Con Curso Elevate");
        WebElement elemento = LearningPathABMPage.nameCourseQATrackConCursosRequeridosGet();
        Assert.assertEquals(elemento.getText(), "QA Track Con Curso Elevate");
       driver.navigate().refresh();
    }
    @Test
    public void DeletePathWithCoursesElevate() throws Exception{
        LoginFunctions LoginFunctions = new LoginFunctions(driver);
        PanelPage PanelPage = new PanelPage(driver);
        LearningPathABMPage LearningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage CreateTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        LoginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(8000);
        PanelPage.buttonContent();
        PanelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LearningPathABMPage.InputLearningPathsC();
        LearningPathABMPage.InputLearningPaths("QA Track Con Curso Elevate");
        LearningPathABMPage.MenuWithOptions();
        LearningPathABMPage.OptionDeletePath();
        Thread.sleep(8000);
        WebElement elemento = LearningPathABMPage.MessageDeletePath();
        Assert.assertEquals(elemento.getText(), "¿Deseas eliminar la ruta");
        LearningPathABMPage.ButtonConfirmDeletePath();
        Thread.sleep(3000);
        WebElement elemento3 = LearningPathABMPage.TextPopUpAlert();
        Assert.assertEquals(elemento3.getText(), "Se ha eliminado el borrador QA Track Con Curso Elevate éxitosamente");

    }
}
