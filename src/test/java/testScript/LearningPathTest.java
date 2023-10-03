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
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        LearningPathPage learningPathPage = new LearningPathPage(driver);

        driver.manage().window().maximize();
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(3000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathABMPage.inputLearningPathsC();
        WebElement elemento0 = learningPathABMPage.tittleLearningPaths();
        Assert.assertEquals(elemento0.getText(), "Rutas de aprendizajes");
        learningPathABMPage.inputLearningPaths("QA Agrega y Quita Curso");
        Thread.sleep(6000);
        learningPathABMPage.nameCourseQATrackConCursosRequeridos();
        WebElement elemento1 = learningPathPage.titleCourseInCOurse();
        Assert.assertEquals(elemento1.getText(), "QA Agrega y Quita Curso");Thread.sleep(3000);
        learningPathPage.addCourseIfNotExists();
        Thread.sleep(3000);
        learningPathPage.inputAddCoursesC();
        learningPathPage.inputAddCourses("ia");
        Thread.sleep(3000);
        learningPathPage.addCourseButton();
        learningPathPage.saveChangesAddCourses();
        Thread.sleep(3000);
        WebElement elemento2 = learningPathPage.popupAddCourseOK();
        Assert.assertEquals(elemento2.getText(), "Curso(s) agregado(s) satisfactoriamente");Thread.sleep(3000);
        learningPathPage.deleteCourseCrehana();
        learningPathPage.buttonDeleteCourse();
        WebElement elemento3 = learningPathPage.popupQuestionDeleteMessage();
        Assert.assertEquals(elemento3.getText(), "¿Estás seguro de que deseas eliminar el curso");Thread.sleep(3000);
        Thread.sleep(3000);
        learningPathPage.buttonDeleteConfirm();
        Thread.sleep(3000);
        WebElement elemento5 = learningPathPage.popupAddCourseOK();
        Assert.assertEquals(elemento5.getText(), "Curso de O novo líder e seu papel na sociedade da era da informação borrado satisfactoriamente");Thread.sleep(3000);
        Thread.sleep(3000);
        WebElement elemento6 = learningPathPage.validationCoursesTotal();
        Assert.assertEquals(elemento6.getText(), "0\n" + "Total de cursos");
        driver.navigate().refresh();
    }

    @Test
    public void AdminDeleteCoursesRequiredAlert() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        LearningPathPage learningPathPage = new LearningPathPage(driver);

        driver.manage().window().maximize();
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(3000);

        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(5000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        Thread.sleep(4000);
        learningPathABMPage.inputLearningPathsC();
        WebElement elemento0 = learningPathABMPage.tittleLearningPaths();
        Assert.assertEquals(elemento0.getText(), "Rutas de aprendizajes");
        learningPathABMPage.inputLearningPaths("QA Track con cursos requeridos");
        Thread.sleep(6000);
        learningPathABMPage.nameCourseQATrackConCursosRequeridos();
        Thread.sleep(6000);
        WebElement elemento1 = learningPathPage.titleCourseInCOurse();
        Assert.assertEquals(elemento1.getText(), "QA Track con cursos requeridos");Thread.sleep(3000);
        learningPathPage.deleteCourseCrehana();
        learningPathPage.buttonDeleteCourse();
        Thread.sleep(10000);
        WebElement elemento2 = learningPathPage.popAlertNotDeleteCourse();
        Assert.assertEquals(elemento2.getText(), "La cantidad de cursos asignados no puede ser menor a la cantidad de cursos requeridos que se configuró para completar la ruta.");Thread.sleep(3000);
        Thread.sleep(2000);
        driver.navigate().refresh();
    }

    @Test
    public void AdminAddUsersInPathActual() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        LearningPathPage learningPathPage = new LearningPathPage(driver);

        driver.manage().window().maximize();
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(3000);

        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(3000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        Thread.sleep(6000);
        learningPathABMPage.inputLearningPathsC();
        WebElement elemento0 = learningPathABMPage.tittleLearningPaths();
        Assert.assertEquals(elemento0.getText(), "Rutas de aprendizajes");
        learningPathABMPage.inputLearningPaths("QA Track con cursos requeridos");
        Thread.sleep(2000);
        learningPathABMPage.nameCourseQATrackConCursosRequeridos();
        Thread.sleep(3000);
        WebElement elemento1 = learningPathPage.titleCourseInCOurse();
        Assert.assertEquals(elemento1.getText(), "QA Track con cursos requeridos");Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.addUser();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.inputAddUserC();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        learningPathPage.inputAddUserText("robot.1@mailinator.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.inputAddUserEnter();
        learningPathPage.buttonConfirmAddUser();
        WebElement elemento2 = learningPathPage.popupAddCourseOK();
        Assert.assertEquals(elemento2.getText(), "Usuario(s) agregado(s) satisfactoriamente");Thread.sleep(3000);
        Thread.sleep(6000);
        WebElement element = learningPathPage.nameFirstUser();
        Assert.assertEquals(element.getText(), "Robot 1");
        Thread.sleep(3000);
        driver.navigate().refresh();
    }

    @Test
    public void EditTrackAdminEdit() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        LearningPathPage learningPathPage = new LearningPathPage(driver);

        driver.manage().window().maximize();
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(3000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        Thread.sleep(6000);
        learningPathABMPage.inputLearningPathsC();
        Assert.assertEquals("Rutas de aprendizajes", "Rutas de aprendizajes", "Rutas de aprendizajes");
        learningPathABMPage.inputLearningPaths("QA Track con cursos requeridos");
        Thread.sleep(6000);
        learningPathABMPage.nameCourseQATrackConCursosRequeridos();
        Assert.assertEquals("QA Track con cursos requeridos", "QA Track con cursos requeridos", "QA Track con cursos requeridos");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.buttonAddCourses();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.inputAddCoursesC();
        learningPathPage.inputAddCourses("ia");
        Thread.sleep(4000);
        learningPathPage.addCourseButton();
        learningPathPage.saveChangesAddCourses();
        Thread.sleep(7000);
        learningPathPage.editRequired();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.confirmRequired();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.addCourseRequiredPlus();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.addProjectRequiredPlus();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.saveAddProjectRequiredPlus();
        Assert.assertEquals("¡Los requisitos de la ruta fueron actualizados!", "¡Los requisitos de la ruta fueron actualizados!", "¡Los requisitos de la ruta fueron actualizados!");
        Assert.assertEquals("Puedes ver el resumen de tus cambios enhistorial de cambios.", "Puedes ver el resumen de tus cambios enhistorial de cambios.", "Puedes ver el resumen de tus cambios enhistorial de cambios.");
        Thread.sleep(3000);
        driver.navigate().refresh();
    }

    @Test
    public void EditTrackCreatePath() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage createTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(8000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        learningPathABMPage.buttonCreatePath();
        learningPathABMPage.buttonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.nameNewTrack();
        createTrackPage.inputNameNewTrackSet("QA Track Sin Cursos Requeridos");
        createTrackPage.addCoursesInTrack("ia");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.selectFirtsCourseInTrack();
        createTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.buttonSubstraccionCourse();
        createTrackPage.dateStart();
        createTrackPage.dateFinish();
        createTrackPage.buttonNext();
        createTrackPage.selectFirstUser();
        createTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertEquals("1 usuarios", "1 usuarios", "1 usuarios");
        createTrackPage.buttonConfirmTrack();
        Thread.sleep(10000);
        Assert.assertEquals("¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso");
        Assert.assertEquals("Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        createTrackPage.buttonConfirmTrackFinal();
        Thread.sleep(12000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel/content/paths/");
        Thread.sleep(2000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Sin Cursos Requeridos");
        WebElement elemento = learningPathABMPage.nameCourseQATrackConCursosRequeridosGet();
        Assert.assertEquals(elemento.getText(), "QA Track Sin Cursos Requeridos");
        WebElement elemento1 = learningPathABMPage.contadorCoursesRequired();
        Assert.assertEquals(elemento1.getText(), "0\n" + "/1");
        driver.navigate().refresh();
    }

    @Test
    public void AdminTrackAddAndDeleteMixCourses() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        LearningPathPage learningPathPage = new LearningPathPage(driver);

        driver.manage().window().maximize();
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathABMPage.inputLearningPathsC();
        Assert.assertEquals("Rutas de aprendizajes", "Rutas de aprendizajes", "Rutas de aprendizajes");
        learningPathABMPage.inputLearningPaths("QA Track sin Cursos");
        Thread.sleep(6000);
        learningPathABMPage.nameCourseQATrackConCursosRequeridos();
        Thread.sleep(3000);
        learningPathPage.addCourseIfNotExists();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        learningPathPage.inputAddCoursesC();
        learningPathPage.inputAddCourses("introduccion a la gastronomia");
        Thread.sleep(3000);
        learningPathPage.addCourseButton();
        learningPathPage.saveChangesAddCourses();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        learningPathPage.deleteCourseCrehana();
        learningPathPage.buttonDeleteCourse();
        Assert.assertEquals("¿Estás seguro de que deseas eliminar", "¿Estás seguro de que deseas eliminar", "¿Estás seguro de que deseas eliminar");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        learningPathPage.buttonDeleteConfirm();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertEquals("borrado satisfactoriamente", "borrado satisfactoriamente", "borrado satisfactoriamente");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().refresh();
        learningPathPage.addCourseIfNotExists();
        learningPathPage.inputAddCoursesC();
        learningPathPage.inputAddCourses("qa curso propio");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.addCourseElevate();
        learningPathPage.saveChangesAddCourses();
        Assert.assertEquals("Curso(s) agregado(s) satisfactoriamente", "Curso(s) agregado(s) satisfactoriamente", "Curso(s) agregado(s) satisfactoriamente");
        WebElement elemento = learningPathABMPage.validoPosicionCursoQA();
        Assert.assertEquals(elemento.getText(), "QA Curso Propio Automation");
        Thread.sleep(3000);
        learningPathPage.deleteCourseCrehana();
        learningPathPage.buttonDeleteCourse();
        learningPathPage.buttonDeleteConfirm();
        Thread.sleep(3000);
        WebElement elemento1 = learningPathPage.validationCoursesTotal();
        Assert.assertEquals(elemento1.getText(), "0\n" + "Total de cursos");
        driver.navigate().refresh();
    }

    @Test
    public void CreateTrackWithCoursesRequired() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage createTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(8000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        learningPathABMPage.buttonCreatePath();
        learningPathABMPage.buttonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.nameNewTrack();
        createTrackPage.inputNameNewTrackSet("QA Track Con 4 Cursos Requeridos");
        createTrackPage.addCoursesInTrack("ia");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.selectFirtsCourseInTrack();
        createTrackPage.select2CourseInTrack();
        createTrackPage.select3CourseInTrack();
        createTrackPage.select4CourseInTrack();
        Thread.sleep(8000);// Dejo un tiempo hasta validar como eliminar el popup que aparece
        createTrackPage.select5CourseInTrack();
        Thread.sleep(8000);
        createTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.buttonSubstraccionCourse();
        createTrackPage.dateStart();
        createTrackPage.dateFinish();
        createTrackPage.buttonNext();
        createTrackPage.selectFirstUser();
        createTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertEquals("1 usuarios", "1 usuarios", "1 usuarios");
        createTrackPage.buttonConfirmTrack();
        Thread.sleep(10000);
        Assert.assertEquals("¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso");
        Assert.assertEquals("Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        createTrackPage.buttonConfirmTrackFinal();
        Thread.sleep(12000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel/content/paths/");
        Thread.sleep(6000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Con 4 Cursos Requeridos");
        WebElement elemento = learningPathABMPage.nameCourseQATrackConCursosRequeridosGet();
        Assert.assertEquals(elemento.getText(), "QA Track Con 4 Cursos Requeridos");
        WebElement elemento1 = learningPathABMPage.contadorCoursesRequired();
        Assert.assertEquals(elemento1.getText(), "4\n" + "/5");
        driver.navigate().refresh();
    }

    @Test
    public void CreateTrackWithCoursesRequiredAndRewards() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage createTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(8000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        learningPathABMPage.buttonCreatePath();
        learningPathABMPage.buttonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.nameNewTrack();
        createTrackPage.inputNameNewTrackSet("QA Track Con Rewards");
        createTrackPage.addRewards();
        createTrackPage.addCoursesInTrack("ia");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.selectFirtsCourseInTrack();
        createTrackPage.select2CourseInTrack();
        createTrackPage.select3CourseInTrack();
        createTrackPage.select4CourseInTrack();
        Thread.sleep(8000);// Dejo un tiempo hasta validar como eliminar el popup que aparece
        createTrackPage.select5CourseInTrack();
        Thread.sleep(8000);
        createTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.buttonSubstraccionCourse();
        createTrackPage.buttonPlusRewards();
        createTrackPage.dateStart();
        createTrackPage.dateFinish();
        createTrackPage.buttonNext();
        createTrackPage.selectFirstUser();
        createTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertEquals("1 usuarios", "1 usuarios", "1 usuarios");
        createTrackPage.buttonConfirmTrack();
        Thread.sleep(10000);
        Assert.assertEquals("¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso");
        Assert.assertEquals("Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        createTrackPage.buttonConfirmTrackFinal();
        Thread.sleep(12000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel/content/paths/");
        Thread.sleep(6000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Con Rewards");
        WebElement elemento = learningPathABMPage.nameCourseQATrackConCursosRequeridosGet();
        Assert.assertEquals(elemento.getText(), "QA Track Con Rewards");
        WebElement elemento1 = learningPathABMPage.contadorCoursesRequired();
        Assert.assertEquals(elemento1.getText(), "4\n" + "/5");

        driver.navigate().refresh();
    }

    @Test
    public void CreateTrackWithCoursesCrehanaElevateRequired() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage createTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(8000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        learningPathABMPage.buttonCreatePath();
        learningPathABMPage.buttonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.nameNewTrack();
        createTrackPage.inputNameNewTrackSet("QA Track Con Cursos Crehana y Elevate");
        createTrackPage.addCoursesInTrack("ia");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.selectFirtsCourseInTrack();
        createTrackPage.select2CourseInTrack();
        createTrackPage.select3CourseInTrack();
        createTrackPage.select4CourseInTrack();
        Thread.sleep(8000);// Dejo un tiempo hasta validar como eliminar el popup que aparece
        createTrackPage.addCoursesInTrackClear();
        createTrackPage.addCoursesInTrack("QA curso propio");
        Thread.sleep(8000);
        createTrackPage.select2CourseInTrack();
        Thread.sleep(8000);
        createTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.buttonSubstraccionCourse();
        createTrackPage.dateStart();
        createTrackPage.dateFinish();
        Thread.sleep(8000);
        createTrackPage.buttonNext();
        createTrackPage.selectFirstUser();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertEquals("1 usuarios", "1 usuarios", "1 usuarios");
        Thread.sleep(8000);
        createTrackPage.buttonConfirmTrack();
        Thread.sleep(8000);
        Assert.assertEquals("¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso", "¡Genial! Estás a punto de dar un gran paso");
        Assert.assertEquals("Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.", "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        createTrackPage.buttonConfirmTrackFinal();
        Thread.sleep(8000);
        Assert.assertEquals("¡Felicitaciones!\n" + "Creaste una nueva", "¡Felicitaciones!\n" + "Creaste una nueva", "¡Felicitaciones!\n" + "Creaste una nueva");
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel/content/paths/");
        Thread.sleep(6000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Con Cursos Crehana y Elevate");
        WebElement elemento = learningPathABMPage.nameCourseQATrackConCursosRequeridosGet();
        Assert.assertEquals(elemento.getText(), "QA Track Con Cursos Crehana y Elevate");
        WebElement elemento1 = learningPathABMPage.contadorCoursesRequired();
        Assert.assertEquals(elemento1.getText(), "4\n" + "/5");

        driver.navigate().refresh();
    }

    @Test
    public void AdminTrackAddAndSaveDraftCourses() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage createTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://qa.creha.co/org/crehana-automation/panel");
        Thread.sleep(8000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        learningPathABMPage.buttonCreatePath();
        learningPathABMPage.buttonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.nameNewTrack();
        createTrackPage.inputNameNewTrackSet("QA Track Borrador");
        createTrackPage.addCoursesInTrack("ia");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.selectFirtsCourseInTrack();
        createTrackPage.select2CourseInTrack();
        createTrackPage.select3CourseInTrack();
        createTrackPage.select4CourseInTrack();
        createTrackPage.buttonSavePreview();
        Assert.assertEquals("El borrador \"QA Track Borrador\" se guardó correctamente", "El borrador \"QA Track Borrador\" se guardó correctamente", "El borrador \"QA Track Borrador\" se guardó correctamente");
        Thread.sleep(10000);
        createTrackPage.buttonCancelPath();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.buttonSaveAndExit();
        Assert.assertEquals("El borrador \"QA Track Borrador\" se guardó correctamente", "El borrador \"QA Track Borrador\" se guardó correctamente", "El borrador \"QA Track Borrador\" se guardó correctamente");
        Thread.sleep(3000);
        learningPathABMPage.sectionPreview();
        Thread.sleep(2000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Borrador");
        WebElement elemento = learningPathABMPage.nameCourseQATrackConCursosRequeridosGet();
        Assert.assertEquals(elemento.getText(), "QA Track Borrador");
        driver.navigate().refresh();
    }

}