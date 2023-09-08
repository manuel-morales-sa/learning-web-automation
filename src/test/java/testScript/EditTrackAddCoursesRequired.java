package testScript;
import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LearningPathABMPage;
import pages.LearningPathPage;
import pages.PanelPage;
import utilities.LoginFunctions;

public class EditTrackAddCoursesRequired extends BaseClass {
    @Test
    public void EditTrackAdminAddCourses() throws Exception {
        LoginFunctions lf = new LoginFunctions(driver);
        PanelPage pp = new PanelPage(driver);
        LearningPathABMPage lpap = new LearningPathABMPage(driver);
        LearningPathPage lpp = new LearningPathPage(driver);

        driver.manage().window().maximize();
        lf.loginActions("automation.user@crehana.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://qa.creha.co/org/crehana/panel/");
        Thread.sleep(3000);
        pp.ButtonContent();
        pp.ButtonLearningPaths();
        Thread.sleep(2000);
        lpap.InputLearningPathsC();
        Assert.assertEquals("Rutas de aprendizajes","Rutas de aprendizajes","Rutas de aprendizajes");
        lpap.InputLearningPaths("QA Track con cursos requeridos");
        Thread.sleep(2000);
        lpap.NameCourse();
        Thread.sleep(2000);
        Assert.assertEquals("QA Track con cursos requeridos","QA Track con cursos requeridos","QA Track con cursos requeridos");
        lpp.DeleteCourseRequired();
        lpp.ButtonDeleteCourse();
        Thread.sleep(2000);
        Assert.assertEquals("No es posible eliminar el cursoEscucha activa y empatíade la ruta QA Track con cursos requeridos","No es posible eliminar el cursoEscucha activa y empatíade la ruta QA Track con cursos requeridos","No es posible eliminar el cursoEscucha activa y empatíade la ruta QA Track con cursos requeridos");
        Assert.assertEquals("La cantidad de cursos asignados no puede ser menor a la cantidad de cursos requeridos que se configuró para completar la ruta.","La cantidad de cursos asignados no puede ser menor a la cantidad de cursos requeridos que se configuró para completar la ruta.","La cantidad de cursos asignados no puede ser menor a la cantidad de cursos requeridos que se configuró para completar la ruta.");
        lpp.ButtonOK();
        Thread.sleep(2000);
    }


}
