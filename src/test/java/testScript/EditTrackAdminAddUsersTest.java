package testScript;
import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LearningPathABMPage;
import pages.LearningPathPage;
import pages.PanelPage;
import utilities.LoginFunctions;

public class EditTrackAdminAddUsersTest extends BaseClass {
    @Test
    public void EditTrackAdminAddUsers() throws Exception {
        LoginFunctions lf = new LoginFunctions(driver);
        PanelPage pp = new PanelPage(driver);
        LearningPathABMPage lpap = new LearningPathABMPage(driver);
        LearningPathPage lpp = new LearningPathPage(driver);

        driver.manage().window().maximize();
        lf.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel/");
        Thread.sleep(3000);
        pp.ButtonContent();
        pp.ButtonLearningPaths();
        Thread.sleep(6000);
        lpap.InputLearningPathsC();
        Assert.assertEquals("Rutas de aprendizajes","Rutas de aprendizajes","Rutas de aprendizajes");
        lpap.InputLearningPaths("QA Track con cursos requeridos");
        Thread.sleep(2000);
        lpap.NameCourse();
        Thread.sleep(3000);
        Assert.assertEquals("QA Track con cursos requeridos","QA Track con cursos requeridos","QA Track con cursos requeridos");
        Thread.sleep(8000);
        lpp.AddUser();
        Thread.sleep(2000);
        lpp.InputAddUserC();
        lpp.InputAddUserText("automation.user@crehana.com");
        Thread.sleep(2000);
        lpp.InputAddUserEnter();
        lpp.InputAddUserC();


    }
}
