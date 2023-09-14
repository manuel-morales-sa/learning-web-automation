package testScript;

import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateTrackPage;
import pages.LearningPathABMPage;
import pages.PanelPage;
import utilities.LoginFunctions;

import java.util.concurrent.TimeUnit;

public class CreateTrackWithCoursesRequiredAndRewardsTest extends BaseClass {
    @Test
    public void CreateTrackWithCoursesRequiredAndRewards() throws Exception{
        LoginFunctions lf = new LoginFunctions(driver);
        PanelPage pp = new PanelPage(driver);
        LearningPathABMPage lpap = new LearningPathABMPage(driver);
        CreateTrackPage ctp = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        lf.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(8000);
        pp.ButtonContent();
        pp.ButtonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        lpap.ButtonCreatePath();
        lpap.ButtonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //1° paso de creacion de Track
        ctp.NameNewTrack();
        ctp.InputNameNewTrackSet("QA Track Con Rewards");
        ctp.AddRewards();
        ctp.AddCoursesInTrack("ia");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        ctp.SelectFirtsCourseInTrack();
        ctp.Select2CourseInTrack();
        ctp.Select3CourseInTrack();
        ctp.Select4CourseInTrack();
        Thread.sleep(8000);// Dejo un tiempo hasta validar como eliminar el popup que aparece
        ctp.Select5CourseInTrack();
        Thread.sleep(8000);
        ctp.ButtonNext();
        //2° paso de creacion de Track
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        ctp.ButtonSubstraccionCourse();
        ctp.ButtonPlusRewards();
        ctp.DateStart();
        ctp.DateFinish();
        ctp.ButtonNext();
        //3° paso de creacion de Track
        ctp.SelectFirstUser();
        ctp.ButtonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //4° paso de creacion de Track
        Assert.assertEquals("4 cursos","4 cursos","4 cursos");
        Assert.assertEquals("1 usuarios","1 usuarios","1 usuarios");
        ctp.ButtonConfirmTrack();
        Thread.sleep(10000);
        //Confirmo Curso
        Assert.assertEquals("¡Genial! Estás a punto de dar un gran paso","¡Genial! Estás a punto de dar un gran paso","¡Genial! Estás a punto de dar un gran paso");
        Assert.assertEquals("Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.","Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.","Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        ctp.ButtonConfirmTrackFinal();
        Thread.sleep(12000);
        Assert.assertEquals("¡Felicitaciones!\n" + "Creaste una nueva","¡Felicitaciones!\n" + "Creaste una nueva","¡Felicitaciones!\n" + "Creaste una nueva");
        //Valido Curso en Rutas de Aprendizaje
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel/content/paths/");
        Thread.sleep(6000);
        Assert.assertEquals("QA Track Con Rewards","QA Track Con Rewards","QA Track Con Rewards");


    }
}
