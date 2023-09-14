package testScript;

import baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateTrackPage;
import pages.LearningPathABMPage;
import pages.PanelPage;
import utilities.LoginFunctions;

import java.util.concurrent.TimeUnit;

public class CreateTrackAddAndSaveDraftCoursesTest extends BaseClass {
    @Test
    public void AdminTrackAddAndSaveDraftCourses() throws Exception{
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
        ctp.InputNameNewTrackSet("QA Track Borrador");
        ctp.AddCoursesInTrack("ia");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        ctp.SelectFirtsCourseInTrack();
        ctp.Select2CourseInTrack();
        ctp.Select3CourseInTrack();
        ctp.Select4CourseInTrack();
        ctp.ButtonSavePreview();
        Assert.assertEquals("El borrador \"QA Track Borrador\" se guardó correctamente","El borrador \"QA Track Borrador\" se guardó correctamente","El borrador \"QA Track Borrador\" se guardó correctamente");
        Thread.sleep(10000);
        ctp.ButtonCancelPath();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        ctp.ButtonSaveAndExit();
        Assert.assertEquals("El borrador \"QA Track Borrador\" se guardó correctamente","El borrador \"QA Track Borrador\" se guardó correctamente","El borrador \"QA Track Borrador\" se guardó correctamente");
        Thread.sleep(3000);
        lpap.SectionPreview();
        Thread.sleep(2000);
        lpap.InputLearningPathsC();
        lpap.InputLearningPaths("QA Track Borrador");
        WebElement elemento = lpap.NameCourseQATrackConCursosRequeridosGet();
        Assert.assertEquals(elemento.getText(), "QA Track Borrador");

    }
}
