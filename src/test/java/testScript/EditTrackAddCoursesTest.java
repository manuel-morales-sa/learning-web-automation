package testScript;
import baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LearningPathPage;
import pages.PanelPage;
import utilities.LoginFunctions;

public class EditTrackAddCoursesTest extends BaseClass {
    @Test
    public void EditTrackAdmin() throws Exception  {
        LoginFunctions lf = new LoginFunctions(driver);
        PanelPage pp = new PanelPage(driver);
        LearningPathPage lpp = new LearningPathPage(driver);

        driver.manage().window().maximize();
        lf.loginActions("automation.user@crehana.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://qa.creha.co/org/crehana/panel/");
        Thread.sleep(3000);
        pp.ButtonContent();
        pp.ButtonLearningPaths();
        Thread.sleep(2000);
        lpp.InputLearningPathsC();
        Assert.assertEquals("Rutas de aprendizajes","Rutas de aprendizajes","Rutas de aprendizajes");
        lpp.InputLearningPaths("Requisitos extremo");
        Thread.sleep(2000);
        lpp.NameCourse();
        Assert.assertEquals("Requisitos extremo","Requisitos extremo","Requisitos extremo");
        Thread.sleep(3000);
        pp.ButtonAddCourses();
        pp.InputAddCoursesC();
        pp.InputAddCourses("ia");
        Thread.sleep(3000);
        pp.AddCourseButton();
        pp.SaveChangesAddCourses();
        Thread.sleep(3000);
        Assert.assertEquals("Curso(s) agregado(s) satisfactoriamente","Curso(s) agregado(s) satisfactoriamente","Curso(s) agregado(s) satisfactoriamente");
        pp.DeleteCourseInformatica();
        pp.ButtonDeleteCourse();
        Assert.assertEquals("¿Estás seguro de que deseas eliminar el cursoSeguridad de la Informaciónde la ruta Requisitos extremo?","¿Estás seguro de que deseas eliminar el cursoSeguridad de la Informaciónde la ruta Requisitos extremo?","¿Estás seguro de que deseas eliminar el cursoSeguridad de la Informaciónde la ruta Requisitos extremo?");
        pp.ButtonDeleteConfirm();
        Thread.sleep(3000);
        Assert.assertEquals("Curso de Seguridad de la Información borrado satisfactoriamente","Curso de Seguridad de la Información borrado satisfactoriamente","Curso de Seguridad de la Información borrado satisfactoriamente");
        Thread.sleep(3000);





    }
}
