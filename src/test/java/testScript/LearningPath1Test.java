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
    public void AdminAddAndDeleteCourses() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        LearningPathPage learningPathPage = new LearningPathPage(driver);

        driver.manage().window().maximize();
        Thread.sleep(5000);
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
        Thread.sleep(8000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathABMPage.inputLearningPathsC();
        WebElement elemento0 = learningPathABMPage.tittleLearningPaths();
        Assert.assertEquals(elemento0.getText(), "Rutas de aprendizajes");
        learningPathABMPage.inputLearningPaths("QA Agrega y Quita Curso");
        Thread.sleep(6000);
        learningPathABMPage.nameCourseQATrackConCursosRequeridos();
        WebElement elemento1 = learningPathPage.titleCourseInCOurse();
        Assert.assertEquals(elemento1.getText(), "QA Agrega y Quita Curso");
        Thread.sleep(3000);
        learningPathPage.addCourseIfNotExists();
        Thread.sleep(3000);
        learningPathPage.inputAddCoursesC();
        learningPathPage.inputAddCourses("ia");
        Thread.sleep(3000);
        learningPathPage.addCourseButton();
        learningPathPage.saveChangesAddCourses();
        Thread.sleep(3000);
        WebElement elemento2 = learningPathPage.popupAddCourseOK();
        Assert.assertEquals(elemento2.getText(), "Curso(s) agregado(s) satisfactoriamente");
        Thread.sleep(3000);
        learningPathPage.deleteCourseCrehana();
        learningPathPage.buttonDeleteCourse();
        WebElement elemento3 = learningPathPage.popupQuestionDeleteMessage();
        Assert.assertEquals(elemento3.getText(), "¿Estás seguro de que deseas eliminar el curso");
        Thread.sleep(3000);
        Thread.sleep(3000);
        learningPathPage.buttonDeleteConfirm();
        Thread.sleep(3000);
        WebElement elemento5 = learningPathPage.popupAddCourseOK();
        Assert.assertEquals(elemento5.getText(), "Curso de O novo líder e seu papel na sociedade da era da informação borrado satisfactoriamente");
        Thread.sleep(3000);
        Thread.sleep(3000);
        WebElement elemento6 = learningPathPage.validationCoursesTotal();
        Assert.assertEquals(elemento6.getText(), "0\n" + "Total de cursos");
        driver.navigate().refresh();
    }
}