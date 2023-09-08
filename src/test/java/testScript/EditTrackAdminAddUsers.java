package testScript;

import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LearningPathABMPage;
import pages.PanelPage;
import utilities.LoginFunctions;

public class EditTrackAdminAddUsers extends BaseClass {
    @Test
    public void EditTrackAdminAddUsers() throws Exception {
        LoginFunctions lf = new LoginFunctions(driver);
        PanelPage pp = new PanelPage(driver);
        LearningPathABMPage lpp = new LearningPathABMPage(driver);

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
        lpp.InputLearningPaths("QA Track con cursos requeridos");
        Thread.sleep(2000);
        lpp.NameCourse();
        Thread.sleep(2000);
        Assert.assertEquals("QA Track con cursos requeridos","QA Track con cursos requeridos","QA Track con cursos requeridos");
    }
}
