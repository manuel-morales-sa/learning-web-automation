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

public class EditTrackAddCoursesTest extends BaseClass {
    @Test
    public void EditTrackAdmin() throws Exception  {
        LoginFunctions lf = new LoginFunctions(driver);
        PanelPage pp = new PanelPage(driver);
        LearningPathABMPage lpap = new LearningPathABMPage(driver);
        LearningPathPage lpp = new LearningPathPage(driver);

        driver.manage().window().maximize();
        lf.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(3000);
        pp.ButtonContent();
        pp.ButtonLearningPaths();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        lpap.InputLearningPathsC();
        Assert.assertEquals("Rutas de aprendizajes","Rutas de aprendizajes","Rutas de aprendizajes");
        lpap.InputLearningPaths("QA Agrega y Quita Curso");
        Thread.sleep(6000);
        lpap.NameCourseQATrackConCursosRequeridos();
        Assert.assertEquals("QA Agrega y Quita Curso","QA Agrega y Quita Curso","QA Agrega y Quita Curso");
        Thread.sleep(3000);
        lpp.AddCourseIfNotExists();
        Thread.sleep(3000);
        lpp.InputAddCoursesC();
        lpp.InputAddCourses("ia");
        Thread.sleep(3000);
        lpp.AddCourseButton();
        lpp.SaveChangesAddCourses();
        Thread.sleep(3000);
        Assert.assertEquals("Curso(s) agregado(s) satisfactoriamente","Curso(s) agregado(s) satisfactoriamente","Curso(s) agregado(s) satisfactoriamente");
        lpp.DeleteCourseCrehana();
        lpp.ButtonDeleteCourse();
        Assert.assertEquals("¿Estás seguro de que deseas eliminar el cursoSeguridad de la Informaciónde la ruta Requisitos extremo?","¿Estás seguro de que deseas eliminar el cursoSeguridad de la Informaciónde la ruta Requisitos extremo?","¿Estás seguro de que deseas eliminar el cursoSeguridad de la Informaciónde la ruta Requisitos extremo?");
        lpp.ButtonDeleteConfirm();
        Thread.sleep(3000);
        Assert.assertEquals("Curso de Seguridad de la Información borrado satisfactoriamente","Curso de Seguridad de la Información borrado satisfactoriamente","Curso de Seguridad de la Información borrado satisfactoriamente");
        Thread.sleep(3000);
        WebElement elemento1 = lpp.ValidationCoursesTotal();
        Assert.assertEquals(elemento1.getText(), "0\n" + "Total de cursos");





    }
}
