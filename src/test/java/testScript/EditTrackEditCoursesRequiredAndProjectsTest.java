package testScript;

import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LearningPathABMPage;
import pages.LearningPathPage;
import pages.PanelPage;
import utilities.LoginFunctions;

public class EditTrackEditCoursesRequiredAndProjectsTest extends BaseClass {

    @Test
    public void EditTrackAdminEdit() throws Exception {
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
        Thread.sleep(6000);
        lpap.InputLearningPathsC();
        Assert.assertEquals("Rutas de aprendizajes","Rutas de aprendizajes","Rutas de aprendizajes");
        lpap.InputLearningPaths("QA Track con cursos requeridos");
        Thread.sleep(6000);
        lpap.NameCourseQATrackConCursosRequeridos();
        Assert.assertEquals("QA Track con cursos requeridos","QA Track con cursos requeridos","QA Track con cursos requeridos");
        Thread.sleep(3000);
        lpp.ButtonAddCourses();
        Thread.sleep(3000);
        lpp.InputAddCoursesC();
        lpp.InputAddCourses("ia");
        Thread.sleep(4000);
        lpp.AddCourseButton();
        lpp.SaveChangesAddCourses();
        Thread.sleep(7000);
        lpp.EditRequired();
        Thread.sleep(4000);
        lpp.ConfirmRequired();
        Thread.sleep(4000);
        lpp.AddCourseRequiredPlus();
        Thread.sleep(4000);
        lpp.AddProjectRequiredPlus();
        Thread.sleep(4000);
        lpp.SaveAddProjectRequiredPlus();
        Assert.assertEquals("¡Los requisitos de la ruta fueron actualizados!","¡Los requisitos de la ruta fueron actualizados!","¡Los requisitos de la ruta fueron actualizados!");
        Assert.assertEquals("Puedes ver el resumen de tus cambios enhistorial de cambios.","Puedes ver el resumen de tus cambios enhistorial de cambios.","Puedes ver el resumen de tus cambios enhistorial de cambios.");
        Thread.sleep(3000);



    }
}
