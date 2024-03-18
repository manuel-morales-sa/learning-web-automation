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
    public void AdminTrackAddAndDeleteMixCourses() throws Exception {
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
        learningPathABMPage.inputLearningPaths("QA Agrega y Quita Curso");
        Thread.sleep(6000);
        learningPathABMPage.nameCourseQATrackConCursosRequeridos();
        Thread.sleep(3000);
        learningPathPage.addCourseIfNotExists();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        learningPathPage.inputAddCoursesC();
        learningPathPage.inputAddCourses("introduccion a la gastronomia");
        Thread.sleep(3000);
        learningPathPage.addCourseButton();
        learningPathPage.saveChangesAddCourses();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        learningPathPage.deleteCourseCrehana();
        learningPathPage.buttonDeleteCourse();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        learningPathPage.buttonDeleteConfirm();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement elemento1 = learningPathPage.popupAddCourseOK();
        Assert.assertEquals(elemento1.getText(), "Curso(s) agregado(s) satisfactoriamente");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().refresh();
        learningPathPage.addCourseButton();
        learningPathPage.inputAddCoursesC();
        learningPathPage.inputAddCourses("qa curso propio");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.addCourseElevate();
        learningPathPage.saveChangesAddCourses();
        Thread.sleep(3000);
        WebElement elemento2 = learningPathPage.popupAddCourseOK();
        Assert.assertEquals(elemento2.getText(), "Curso(s) agregado(s) satisfactoriamente");
        WebElement elemento = learningPathABMPage.validoPosicionCursoQA();
        Assert.assertEquals(elemento.getText(), "QA Curso Propio Automation");
        Thread.sleep(3000);
        learningPathPage.deleteCourseCrehana();
        learningPathPage.buttonDeleteCourse();
        learningPathPage.buttonDeleteConfirm();
        Thread.sleep(3000);
        WebElement elemento3 = learningPathPage.validationCoursesTotal();
        Assert.assertEquals(elemento3.getText(), "0\n" + "Total de cursos");
        driver.navigate().refresh();
    }
}