package testScript;

import baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LearningPathABMPage;
import pages.LearningPathPage;
import pages.PanelPage;
import utilities.LoginFunctions;

import java.util.concurrent.TimeUnit;

public class Pruebas extends BaseClass {
    @Test
    public void EditTrackAdminEdit() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        LearningPathPage learningPathPage = new LearningPathPage(driver);

        driver.manage().window().maximize();
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(6000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        Thread.sleep(10000);
        learningPathABMPage.inputLearningPathsC();
        WebElement elemento0 = learningPathABMPage.tittleLearningPaths();
        Assert.assertEquals(elemento0.getText(), "Rutas de aprendizajes");
        learningPathABMPage.inputLearningPaths("QA Track con cursos requeridos");
        Thread.sleep(6000);
        learningPathABMPage.nameCourseQATrackConCursosRequeridos();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement elemento1 = learningPathPage.titleCourseInCOurse();
        Assert.assertEquals(elemento1.getText(), "QA Track con cursos requeridos");Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.buttonAddCourses();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.inputAddCoursesC();
        learningPathPage.inputAddCourses("ia");
        Thread.sleep(4000);
        learningPathPage.addCourseButton();
        learningPathPage.saveChangesAddCourses();
        Thread.sleep(7000);
        learningPathPage.editRequired();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.confirmRequired();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.addCourseRequiredPlus();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.addProjectRequiredPlus();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.saveAddProjectRequiredPlus();
        WebElement elemento3 = learningPathPage.messageUpdateRequired();
        Assert.assertEquals(elemento3.getText(), "¡Los requisitos de la ruta fueron actualizados!");Thread.sleep(3000);
        WebElement elemento4 = learningPathPage.messageHistorial();
        Assert.assertEquals(elemento4.getText(), "Puedes ver el resumen de tus cambios enhistorial de cambios.");Thread.sleep(3000);
        Thread.sleep(3000);
        driver.navigate().refresh();
    }
}
