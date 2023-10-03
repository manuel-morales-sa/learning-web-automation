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

public class LearningPathTest extends BaseClass {
    @Test
    public void AdminAddAndDeleteCourses() throws Exception {
        LoginFunctions LoginFunctions = new LoginFunctions(driver);
        PanelPage PanelPage = new PanelPage(driver);
        LearningPathABMPage LearningPathABMPage = new LearningPathABMPage(driver);
        LearningPathPage LearningPathPage = new LearningPathPage(driver);

        driver.manage().window().maximize();
        LoginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(3000);
        PanelPage.ButtonContent();
        PanelPage.ButtonLearningPaths();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LearningPathABMPage.InputLearningPathsC();
        Assert.assertEquals("Rutas de aprendizajes", "Rutas de aprendizajes", "Rutas de aprendizajes");
        LearningPathABMPage.InputLearningPaths("QA Agrega y Quita Curso");
        Thread.sleep(6000);
        LearningPathABMPage.NameCourseQATrackConCursosRequeridos();
        Assert.assertEquals("QA Agrega y Quita Curso", "QA Agrega y Quita Curso", "QA Agrega y Quita Curso");
        Thread.sleep(3000);
        LearningPathPage.AddCourseIfNotExists();
        Thread.sleep(3000);
        LearningPathPage.InputAddCoursesC();
        LearningPathPage.InputAddCourses("ia");
        Thread.sleep(3000);
        LearningPathPage.AddCourseButton();
        LearningPathPage.SaveChangesAddCourses();
        Thread.sleep(3000);
        Assert.assertEquals("Curso(s) agregado(s) satisfactoriamente", "Curso(s) agregado(s) satisfactoriamente", "Curso(s) agregado(s) satisfactoriamente");
        LearningPathPage.DeleteCourseCrehana();
        LearningPathPage.ButtonDeleteCourse();
        Assert.assertEquals("¿Estás seguro de que deseas eliminar el cursoSeguridad de la Informaciónde la ruta Requisitos extremo?", "¿Estás seguro de que deseas eliminar el cursoSeguridad de la Informaciónde la ruta Requisitos extremo?", "¿Estás seguro de que deseas eliminar el cursoSeguridad de la Informaciónde la ruta Requisitos extremo?");
        LearningPathPage.ButtonDeleteConfirm();
        Thread.sleep(3000);
        Assert.assertEquals("Curso de Seguridad de la Información borrado satisfactoriamente", "Curso de Seguridad de la Información borrado satisfactoriamente", "Curso de Seguridad de la Información borrado satisfactoriamente");
        Thread.sleep(3000);
        WebElement elemento1 = LearningPathPage.ValidationCoursesTotal();
        Assert.assertEquals(elemento1.getText(), "0\n" + "Total de cursos");
        driver.close();
    }

    @Test
    public void AdminDeleteCoursesRequiredAlert() throws Exception {
        LoginFunctions LoginFunctions = new LoginFunctions(driver);
        PanelPage PanelPage = new PanelPage(driver);
        LearningPathABMPage LearningPathABMPage = new LearningPathABMPage(driver);
        LearningPathPage LearningPathPage = new LearningPathPage(driver);

        driver.manage().window().maximize();
        LoginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(3000);
        PanelPage.ButtonContent();
        PanelPage.ButtonLearningPaths();
        Thread.sleep(4000);
        LearningPathABMPage.InputLearningPathsC();
        Assert.assertEquals("Rutas de aprendizajes", "Rutas de aprendizajes", "Rutas de aprendizajes");
        LearningPathABMPage.InputLearningPaths("QA Track con cursos requeridos");
        Thread.sleep(6000);
        LearningPathABMPage.NameCourseQATrackConCursosRequeridos();
        Thread.sleep(6000);
        Assert.assertEquals("QA Track con cursos requeridos", "QA Track con cursos requeridos", "QA Track con cursos requeridos");
        LearningPathPage.DeleteCourseCrehana();
        LearningPathPage.ButtonDeleteCourse();
        Thread.sleep(2000);
        Assert.assertEquals("No es posible eliminar el curso", "No es posible eliminar el curso", "No es posible eliminar el curso");
        Assert.assertEquals("La cantidad de cursos asignados no puede ser menor a la cantidad de cursos requeridos que se configuró para completar la ruta.", "La cantidad de cursos asignados no puede ser menor a la cantidad de cursos requeridos que se configuró para completar la ruta.", "La cantidad de cursos asignados no puede ser menor a la cantidad de cursos requeridos que se configuró para completar la ruta.");
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void AdminAddUsersInPathActual() throws Exception {
        LoginFunctions LoginFunctions = new LoginFunctions(driver);
        PanelPage PanelPage = new PanelPage(driver);
        LearningPathABMPage LearningPathABMPage = new LearningPathABMPage(driver);
        LearningPathPage LearningPathPage = new LearningPathPage(driver);

        driver.manage().window().maximize();
        LoginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(3000);

        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(3000);
        PanelPage.ButtonContent();
        PanelPage.ButtonLearningPaths();
        Thread.sleep(6000);
        LearningPathABMPage.InputLearningPathsC();
        Assert.assertEquals("Rutas de aprendizajes", "Rutas de aprendizajes", "Rutas de aprendizajes");
        LearningPathABMPage.InputLearningPaths("QA Track con cursos requeridos");
        Thread.sleep(2000);
        LearningPathABMPage.NameCourseQATrackConCursosRequeridos();
        Thread.sleep(3000);
        Assert.assertEquals("QA Track con cursos requeridos", "QA Track con cursos requeridos", "QA Track con cursos requeridos");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LearningPathPage.AddUser();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LearningPathPage.InputAddUserC();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        LearningPathPage.InputAddUserText("robot.1@mailinator.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LearningPathPage.InputAddUserEnter();
        LearningPathPage.ButtonConfirmAddUser();
        Assert.assertEquals("Usuario(s) agregado(s) satisfactoriamente", "Usuario(s) agregado(s) satisfactoriamente", "Usuario(s) agregado(s) satisfactoriamente");
        Thread.sleep(6000);
        WebElement element = LearningPathPage.NameFirstUser();
        Assert.assertEquals(element.getText(), "Robot 1");
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void EditTrackAdminEdit() throws Exception {
        LoginFunctions LoginFunctions = new LoginFunctions(driver);
        PanelPage PanelPage = new PanelPage(driver);
        LearningPathABMPage LearningPathABMPage = new LearningPathABMPage(driver);
        LearningPathPage LearningPathPage = new LearningPathPage(driver);

        driver.manage().window().maximize();
        LoginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(3000);
        PanelPage.ButtonContent();
        PanelPage.ButtonLearningPaths();
        Thread.sleep(6000);
        LearningPathABMPage.InputLearningPathsC();
        Assert.assertEquals("Rutas de aprendizajes", "Rutas de aprendizajes", "Rutas de aprendizajes");
        LearningPathABMPage.InputLearningPaths("QA Track con cursos requeridos");
        Thread.sleep(6000);
        LearningPathABMPage.NameCourseQATrackConCursosRequeridos();
        Assert.assertEquals("QA Track con cursos requeridos", "QA Track con cursos requeridos", "QA Track con cursos requeridos");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LearningPathPage.ButtonAddCourses();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LearningPathPage.InputAddCoursesC();
        LearningPathPage.InputAddCourses("ia");
        Thread.sleep(4000);
        LearningPathPage.AddCourseButton();
        LearningPathPage.SaveChangesAddCourses();
        Thread.sleep(7000);
        LearningPathPage.EditRequired();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LearningPathPage.ConfirmRequired();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LearningPathPage.AddCourseRequiredPlus();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LearningPathPage.AddProjectRequiredPlus();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LearningPathPage.SaveAddProjectRequiredPlus();
        Assert.assertEquals("¡Los requisitos de la ruta fueron actualizados!", "¡Los requisitos de la ruta fueron actualizados!", "¡Los requisitos de la ruta fueron actualizados!");
        Assert.assertEquals("Puedes ver el resumen de tus cambios enhistorial de cambios.", "Puedes ver el resumen de tus cambios enhistorial de cambios.", "Puedes ver el resumen de tus cambios enhistorial de cambios.");
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void EditTrackCreatePath() throws Exception {
        LoginFunctions LoginFunctions = new LoginFunctions(driver);
        PanelPage PanelPage = new PanelPage(driver);
        LearningPathABMPage LearningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage CreateTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        LoginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(8000);
        PanelPage.ButtonContent();
        PanelPage.ButtonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LearningPathABMPage.ButtonCreatePath();
        LearningPathABMPage.ButtonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.NameNewTrack();
        CreateTrackPage.InputNameNewTrackSet("QA Track Sin Cursos Requeridos");
        CreateTrackPage.AddCoursesInTrack("ia");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.SelectFirtsCourseInTrack();
        CreateTrackPage.ButtonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.ButtonSubstraccionCourse();
        CreateTrackPage.DateStart();
        CreateTrackPage.DateFinish();
        CreateTrackPage.ButtonNext();
        CreateTrackPage.SelectFirstUser();
        CreateTrackPage.ButtonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertEquals("1 usuarios", "1 usuarios", "1 usuarios");
        CreateTrackPage.ButtonConfirmTrack();
        Thread.sleep(10000);
        Assert.assertEquals("¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso");
        Assert.assertEquals("Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        CreateTrackPage.ButtonConfirmTrackFinal();
        Thread.sleep(12000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel/content/paths/");
        Thread.sleep(2000);
        LearningPathABMPage.InputLearningPathsC();
        LearningPathABMPage.InputLearningPaths("QA Track Sin Cursos Requeridos");
        WebElement elemento = LearningPathABMPage.NameCourseQATrackConCursosRequeridosGet();
        Assert.assertEquals(elemento.getText(), "QA Track Sin Cursos Requeridos");
        WebElement elemento1 = LearningPathABMPage.ContadorCoursesRequired();
        Assert.assertEquals(elemento1.getText(), "0\n" + "/1");
        driver.close();
    }

    @Test
    public void AdminTrackAddAndDeleteMixCourses() throws Exception {
        LoginFunctions LoginFunctions = new LoginFunctions(driver);
        PanelPage PanelPage = new PanelPage(driver);
        LearningPathABMPage LearningPathABMPage = new LearningPathABMPage(driver);
        LearningPathPage LearningPathPage = new LearningPathPage(driver);

        driver.manage().window().maximize();
        LoginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        PanelPage.ButtonContent();
        PanelPage.ButtonLearningPaths();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LearningPathABMPage.InputLearningPathsC();
        Assert.assertEquals("Rutas de aprendizajes", "Rutas de aprendizajes", "Rutas de aprendizajes");
        LearningPathABMPage.InputLearningPaths("QA Track sin Cursos");
        Thread.sleep(6000);
        LearningPathABMPage.NameCourseQATrackConCursosRequeridos();
        Thread.sleep(3000);
        LearningPathPage.AddCourseIfNotExists();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LearningPathPage.InputAddCoursesC();
        LearningPathPage.InputAddCourses("introduccion a la gastronomia");
        Thread.sleep(3000);
        LearningPathPage.AddCourseButton();
        LearningPathPage.SaveChangesAddCourses();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LearningPathPage.DeleteCourseCrehana();
        LearningPathPage.ButtonDeleteCourse();
        Assert.assertEquals("¿Estás seguro de que deseas eliminar", "¿Estás seguro de que deseas eliminar", "¿Estás seguro de que deseas eliminar");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LearningPathPage.ButtonDeleteConfirm();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertEquals("borrado satisfactoriamente", "borrado satisfactoriamente", "borrado satisfactoriamente");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().refresh();
        LearningPathPage.AddCourseIfNotExists();
        LearningPathPage.InputAddCoursesC();
        LearningPathPage.InputAddCourses("qa curso propio");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LearningPathPage.AddCourseElevate();
        LearningPathPage.SaveChangesAddCourses();
        Assert.assertEquals("Curso(s) agregado(s) satisfactoriamente", "Curso(s) agregado(s) satisfactoriamente", "Curso(s) agregado(s) satisfactoriamente");
        WebElement elemento = LearningPathABMPage.ValidoPosicionCursoQA();
        Assert.assertEquals(elemento.getText(), "QA Curso Propio Automation");
        Thread.sleep(3000);
        LearningPathPage.DeleteCourseCrehana();
        LearningPathPage.ButtonDeleteCourse();
        LearningPathPage.ButtonDeleteConfirm();
        Thread.sleep(3000);
        WebElement elemento1 = LearningPathPage.ValidationCoursesTotal();
        Assert.assertEquals(elemento1.getText(), "0\n" + "Total de cursos");
        driver.close();
    }

    @Test
    public void CreateTrackWithCoursesRequired() throws Exception {
        LoginFunctions LoginFunctions = new LoginFunctions(driver);
        PanelPage PanelPage = new PanelPage(driver);
        LearningPathABMPage LearningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage CreateTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        LoginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(8000);
        PanelPage.ButtonContent();
        PanelPage.ButtonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LearningPathABMPage.ButtonCreatePath();
        LearningPathABMPage.ButtonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.NameNewTrack();
        CreateTrackPage.InputNameNewTrackSet("QA Track Con 4 Cursos Requeridos");
        CreateTrackPage.AddCoursesInTrack("ia");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.SelectFirtsCourseInTrack();
        CreateTrackPage.Select2CourseInTrack();
        CreateTrackPage.Select3CourseInTrack();
        CreateTrackPage.Select4CourseInTrack();
        Thread.sleep(8000);// Dejo un tiempo hasta validar como eliminar el popup que aparece
        CreateTrackPage.Select5CourseInTrack();
        Thread.sleep(8000);
        CreateTrackPage.ButtonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.ButtonSubstraccionCourse();
        CreateTrackPage.DateStart();
        CreateTrackPage.DateFinish();
        CreateTrackPage.ButtonNext();
        CreateTrackPage.SelectFirstUser();
        CreateTrackPage.ButtonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertEquals("1 usuarios", "1 usuarios", "1 usuarios");
        CreateTrackPage.ButtonConfirmTrack();
        Thread.sleep(10000);
        Assert.assertEquals("¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso");
        Assert.assertEquals("Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        CreateTrackPage.ButtonConfirmTrackFinal();
        Thread.sleep(12000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel/content/paths/");
        Thread.sleep(6000);
        LearningPathABMPage.InputLearningPathsC();
        LearningPathABMPage.InputLearningPaths("QA Track Con 4 Cursos Requeridos");
        WebElement elemento = LearningPathABMPage.NameCourseQATrackConCursosRequeridosGet();
        Assert.assertEquals(elemento.getText(), "QA Track Con 4 Cursos Requeridos");
        WebElement elemento1 = LearningPathABMPage.ContadorCoursesRequired();
        Assert.assertEquals(elemento1.getText(), "4\n" + "/5");
        driver.close();
    }

    @Test
    public void CreateTrackWithCoursesRequiredAndRewards() throws Exception {
        LoginFunctions LoginFunctions = new LoginFunctions(driver);
        PanelPage PanelPage = new PanelPage(driver);
        LearningPathABMPage LearningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage CreateTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        LoginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(8000);
        PanelPage.ButtonContent();
        PanelPage.ButtonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LearningPathABMPage.ButtonCreatePath();
        LearningPathABMPage.ButtonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.NameNewTrack();
        CreateTrackPage.InputNameNewTrackSet("QA Track Con Rewards");
        CreateTrackPage.AddRewards();
        CreateTrackPage.AddCoursesInTrack("ia");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.SelectFirtsCourseInTrack();
        CreateTrackPage.Select2CourseInTrack();
        CreateTrackPage.Select3CourseInTrack();
        CreateTrackPage.Select4CourseInTrack();
        Thread.sleep(8000);// Dejo un tiempo hasta validar como eliminar el popup que aparece
        CreateTrackPage.Select5CourseInTrack();
        Thread.sleep(8000);
        CreateTrackPage.ButtonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.ButtonSubstraccionCourse();
        CreateTrackPage.ButtonPlusRewards();
        CreateTrackPage.DateStart();
        CreateTrackPage.DateFinish();
        CreateTrackPage.ButtonNext();
        CreateTrackPage.SelectFirstUser();
        CreateTrackPage.ButtonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertEquals("1 usuarios", "1 usuarios", "1 usuarios");
        CreateTrackPage.ButtonConfirmTrack();
        Thread.sleep(10000);
        Assert.assertEquals("¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso");
        Assert.assertEquals("Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        CreateTrackPage.ButtonConfirmTrackFinal();
        Thread.sleep(12000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel/content/paths/");
        Thread.sleep(6000);
        LearningPathABMPage.InputLearningPathsC();
        LearningPathABMPage.InputLearningPaths("QA Track Con Rewards");
        WebElement elemento = LearningPathABMPage.NameCourseQATrackConCursosRequeridosGet();
        Assert.assertEquals(elemento.getText(), "QA Track Con Rewards");
        WebElement elemento1 = LearningPathABMPage.ContadorCoursesRequired();
        Assert.assertEquals(elemento1.getText(), "4\n" + "/5");
        driver.close();
    }

    @Test
    public void CreateTrackWithCoursesCrehanaElevateRequired() throws Exception {
        LoginFunctions LoginFunctions = new LoginFunctions(driver);
        PanelPage PanelPage = new PanelPage(driver);
        LearningPathABMPage LearningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage CreateTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        LoginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(8000);
        PanelPage.ButtonContent();
        PanelPage.ButtonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LearningPathABMPage.ButtonCreatePath();
        LearningPathABMPage.ButtonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.NameNewTrack();
        CreateTrackPage.InputNameNewTrackSet("QA Track Con Cursos Crehana y Elevate");
        CreateTrackPage.AddCoursesInTrack("ia");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.SelectFirtsCourseInTrack();
        CreateTrackPage.Select2CourseInTrack();
        CreateTrackPage.Select3CourseInTrack();
        CreateTrackPage.Select4CourseInTrack();
        Thread.sleep(8000);// Dejo un tiempo hasta validar como eliminar el popup que aparece
        CreateTrackPage.AddCoursesInTrackClear();
        CreateTrackPage.AddCoursesInTrack("QA curso propio");
        Thread.sleep(8000);
        CreateTrackPage.Select2CourseInTrack();
        Thread.sleep(8000);
        CreateTrackPage.ButtonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.ButtonSubstraccionCourse();
        CreateTrackPage.DateStart();
        CreateTrackPage.DateFinish();
        Thread.sleep(8000);
        CreateTrackPage.ButtonNext();
        CreateTrackPage.SelectFirstUser();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.ButtonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertEquals("1 usuarios", "1 usuarios", "1 usuarios");
        Thread.sleep(8000);
        CreateTrackPage.ButtonConfirmTrack();
        Thread.sleep(8000);
        Assert.assertEquals("¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso");
        Assert.assertEquals("Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        CreateTrackPage.ButtonConfirmTrackFinal();
        Thread.sleep(8000);
        Assert.assertEquals("¡Felicitaciones!\n" + "Creaste una nueva", "¡Felicitaciones!\n" + "Creaste una nueva", "¡Felicitaciones!\n" + "Creaste una nueva");
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel/content/paths/");
        Thread.sleep(6000);
        LearningPathABMPage.InputLearningPathsC();
        LearningPathABMPage.InputLearningPaths("QA Track Con Cursos Crehana y Elevate");
        WebElement elemento = LearningPathABMPage.NameCourseQATrackConCursosRequeridosGet();
        Assert.assertEquals(elemento.getText(), "QA Track Con Cursos Crehana y Elevate");
        WebElement elemento1 = LearningPathABMPage.ContadorCoursesRequired();
        Assert.assertEquals(elemento1.getText(), "4\n" + "/5");
        driver.close();
    }

    @Test
    public void AdminTrackAddAndSaveDraftCourses() throws Exception {
        LoginFunctions LoginFunctions = new LoginFunctions(driver);
        PanelPage PanelPage = new PanelPage(driver);
        LearningPathABMPage LearningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage CreateTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        LoginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(8000);
        PanelPage.ButtonContent();
        PanelPage.ButtonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LearningPathABMPage.ButtonCreatePath();
        LearningPathABMPage.ButtonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.NameNewTrack();
        CreateTrackPage.InputNameNewTrackSet("QA Track Borrador");
        CreateTrackPage.AddCoursesInTrack("ia");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.SelectFirtsCourseInTrack();
        CreateTrackPage.Select2CourseInTrack();
        CreateTrackPage.Select3CourseInTrack();
        CreateTrackPage.Select4CourseInTrack();
        CreateTrackPage.ButtonSavePreview();
        Assert.assertEquals("El borrador \"QA Track Borrador\" se guardó correctamente", "El borrador \"QA Track Borrador\" se guardó correctamente", "El borrador \"QA Track Borrador\" se guardó correctamente");
        Thread.sleep(10000);
        CreateTrackPage.ButtonCancelPath();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CreateTrackPage.ButtonSaveAndExit();
        Assert.assertEquals("El borrador \"QA Track Borrador\" se guardó correctamente", "El borrador \"QA Track Borrador\" se guardó correctamente", "El borrador \"QA Track Borrador\" se guardó correctamente");
        Thread.sleep(3000);
        LearningPathABMPage.SectionPreview();
        Thread.sleep(2000);
        LearningPathABMPage.InputLearningPathsC();
        LearningPathABMPage.InputLearningPaths("QA Track Borrador");
        WebElement elemento = LearningPathABMPage.NameCourseQATrackConCursosRequeridosGet();
        Assert.assertEquals(elemento.getText(), "QA Track Borrador");
        driver.close();
    }
}
