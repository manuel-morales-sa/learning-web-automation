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

public class AdminTrackAddAndDeleteMixCoursesTest extends BaseClass {
   @Test
   public void AdminTrackAddAndDeleteMixCourses() throws Exception {
       LoginFunctions lf = new LoginFunctions(driver);
       PanelPage pp = new PanelPage(driver);
       LearningPathABMPage lpap = new LearningPathABMPage(driver);
       LearningPathPage lpp = new LearningPathPage(driver);

       driver.manage().window().maximize();
       lf.loginActions("manuel.automation@mailinator.com", "1234567890");
       Thread.sleep(2000);

       driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       pp.ButtonContent();
       pp.ButtonLearningPaths();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       lpap.InputLearningPathsC();
       Assert.assertEquals("Rutas de aprendizajes","Rutas de aprendizajes","Rutas de aprendizajes");
       lpap.InputLearningPaths("QA Track sin Cursos");
       Thread.sleep(6000);
       lpap.NameCourseQATrackConCursosRequeridos();
       Thread.sleep(3000);
       lpp.AddCourseIfNotExists();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       lpp.InputAddCoursesC();
       lpp.InputAddCourses("introduccion a la gastronomia");
       Thread.sleep(3000);
       lpp.AddCourseButton();
       lpp.SaveChangesAddCourses();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       //Borro curso de Crehana ya existente
       lpp.DeleteCourseCrehana();
       lpp.ButtonDeleteCourse();
       Assert.assertEquals("¿Estás seguro de que deseas eliminar","¿Estás seguro de que deseas eliminar","¿Estás seguro de que deseas eliminar");
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       lpp.ButtonDeleteConfirm();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       Assert.assertEquals("borrado satisfactoriamente","borrado satisfactoriamente","borrado satisfactoriamente");
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       driver.navigate().refresh();
       lpp.AddCourseIfNotExists();
       lpp.InputAddCoursesC();
       lpp.InputAddCourses("qa curso propio");
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       lpp.AddCourseElevate();
       lpp.SaveChangesAddCourses();
       Assert.assertEquals("Curso(s) agregado(s) satisfactoriamente","Curso(s) agregado(s) satisfactoriamente","Curso(s) agregado(s) satisfactoriamente");
       WebElement elemento = lpap.ValidoPosicionCursoQA();
       Assert.assertEquals(elemento.getText(), "QA Curso Propio Automation");
       Thread.sleep(3000);
       lpp.DeleteCourseCrehana();
       lpp.ButtonDeleteCourse();
       lpp.ButtonDeleteConfirm();
       Thread.sleep(3000);
       WebElement elemento1 = lpp.ValidationCoursesTotal();
       Assert.assertEquals(elemento1.getText(), "0\n" + "Total de cursos");

   }
}
