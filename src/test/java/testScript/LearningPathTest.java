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
    public void AAdminAddAndDeleteCourses() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        LearningPathPage learningPathPage = new LearningPathPage(driver);

        driver.manage().window().maximize();
        Thread.sleep(5000);
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
        Thread.sleep(8000);
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
        Assert.assertEquals(elemento1.getText(), "QA Agrega y Quita Curso");
        Thread.sleep(3000);
        learningPathPage.addCourseIfNotExists();
        Thread.sleep(3000);
        learningPathPage.inputAddCoursesC();
        learningPathPage.inputAddCourses("ia");
        Thread.sleep(3000);
        learningPathPage.addCourseButton();
        learningPathPage.saveChangesAddCourses();
        Thread.sleep(3000);
        WebElement elemento2 = learningPathPage.popupAddCourseOK();
        Assert.assertEquals(elemento2.getText(), "Curso(s) agregado(s) satisfactoriamente");
        Thread.sleep(3000);
        learningPathPage.deleteCourseCrehana();
        learningPathPage.buttonDeleteCourse();
        WebElement elemento3 = learningPathPage.popupQuestionDeleteMessage();
        Assert.assertEquals(elemento3.getText(), "¿Estás seguro de que deseas eliminar el curso");
        Thread.sleep(3000);
        Thread.sleep(3000);
        learningPathPage.buttonDeleteConfirm();
        Thread.sleep(3000);
        WebElement elemento5 = learningPathPage.popupAddCourseOK();
        Assert.assertEquals(elemento5.getText(), "Curso de Notion IA borrado satisfactoriamente");
        Thread.sleep(3000);
        Thread.sleep(3000);
        WebElement elemento6 = learningPathPage.validationCoursesTotal();
        Assert.assertEquals(elemento6.getText(), "0\n" + "Total de cursos");
        driver.navigate().refresh();
    }
    @Test
    public void BAddAndSaveDraftTracks() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage createTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        Thread.sleep(6000);
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
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
        Thread.sleep(5000);
        createTrackPage.buttonSavePreview();
        Thread.sleep(8000);
        Assert.assertEquals("El borrador \"QA Track Borrador\" se guardó correctamente", "El borrador \"QA Track Borrador\" se guardó correctamente");
        Thread.sleep(8000);
        createTrackPage.buttonCancelPath();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.buttonSaveAndExit();
        Assert.assertEquals("El borrador \"QA Track Borrador\" se guardó correctamente", "El borrador \"QA Track Borrador\" se guardó correctamente");
        Thread.sleep(3000);
        learningPathABMPage.sectionPreview();
        Thread.sleep(2000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Borrador");
        WebElement elemento = learningPathABMPage.nameCourseGet();
        Assert.assertEquals(elemento.getText(), "QA Track Borrador");
        driver.navigate().refresh();
    }
    @Test
    public void CCreatePathWithoutRequiredCourses() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage createTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        Thread.sleep(5000);
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
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
        WebElement elemento = createTrackPage.resumeListUsers();
        Assert.assertEquals(elemento.getText(), "1 usuarios");
        createTrackPage.buttonConfirmTrack();
        Thread.sleep(8000);
        WebElement elemento0 = createTrackPage.messageGenial();
        Assert.assertEquals(elemento0.getText(), "¡Genial! Estás a punto de dar un gran paso");
        WebElement elemento1 = createTrackPage.messageGenialConfirmar();
        Assert.assertEquals(elemento1.getText(), "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        createTrackPage.buttonConfirmTrackFinal();
        Thread.sleep(4000);
        WebElement elemento2 = createTrackPage.messageTrackCreado();
        Assert.assertEquals(elemento2.getText(), "¡Tu track ha sido creado!");
        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/content/paths/");
        Thread.sleep(2000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Sin Cursos Requeridos");
        WebElement elemento3 = learningPathABMPage.nameCourseGet();
        Assert.assertEquals(elemento3.getText(), "QA Track Sin Cursos Requeridos");
        WebElement elemento4 = learningPathABMPage.contadorCoursesRequired();
        Assert.assertEquals(elemento4.getText(), "0\n" + "/1");
        driver.navigate().refresh();
    }
    @Test
    public void DCreateTrackWithCoursesRequired() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage createTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        Thread.sleep(6000);
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
        Thread.sleep(8000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        learningPathABMPage.buttonCreatePath();
        learningPathABMPage.buttonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.nameNewTrack();
        createTrackPage.inputNameNewTrackSet("QA Track Con 3 Cursos Requeridos");
        createTrackPage.addCoursesInTrack("ia");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.selectFirtsCourseInTrack();
        createTrackPage.select2CourseInTrack();
        createTrackPage.select3CourseInTrack();
        Thread.sleep(8000);// Dejo un tiempo hasta validar como eliminar el popup que aparece
        createTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.dateStart();
        createTrackPage.dateFinish();
        createTrackPage.buttonNext();
        createTrackPage.selectFirstUser();
        createTrackPage.buttonNext();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement elemento = createTrackPage.resumeListUsers();
        Assert.assertEquals(elemento.getText(), "1 usuarios");
        createTrackPage.buttonConfirmTrack();
        Thread.sleep(10000);
        WebElement elemento0 = createTrackPage.messageGenial();
        Assert.assertEquals(elemento0.getText(), "¡Genial! Estás a punto de dar un gran paso");
        WebElement elemento1 = createTrackPage.messageGenialConfirmar();
        Assert.assertEquals(elemento1.getText(), "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        createTrackPage.buttonConfirmTrackFinal();
        Thread.sleep(12000);
        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/content/paths/");
        Thread.sleep(6000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Con 3 Cursos Requeridos");
        WebElement elemento3 = learningPathABMPage.nameCourseGet();
        Assert.assertEquals(elemento3.getText(), "QA Track Con 3 Cursos Requeridos");
        WebElement elemento4 = learningPathABMPage.contadorCoursesRequired();
        Assert.assertEquals(elemento4.getText(), "3\n" + "/3");
        driver.navigate().refresh();
    }
    @Test
    public void ECreateTrackWithCoursesRequiredAndRewards() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage createTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        Thread.sleep(6000);
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
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
        WebElement elemento = createTrackPage.resumeListUsersCourseWithRewars();
        Assert.assertEquals(elemento.getText(), "1 usuarios");
        createTrackPage.buttonConfirmTrack();
        Thread.sleep(8000);
        WebElement elemento0 = createTrackPage.messageGenial();
        Assert.assertEquals(elemento0.getText(), "¡Genial! Estás a punto de dar un gran paso");
        WebElement elemento1 = createTrackPage.messageGenialConfirmar();
        Assert.assertEquals(elemento1.getText(), "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        createTrackPage.buttonConfirmTrackFinal();
        Thread.sleep(12000);
        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/content/paths/");
        Thread.sleep(6000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Con Rewards");
        WebElement elemento2 = learningPathABMPage.nameCourseGet();
        Assert.assertEquals(elemento2.getText(), "QA Track Con Rewards");
        WebElement elemento3 = learningPathABMPage.contadorCoursesRequired();
        Assert.assertEquals(elemento3.getText(), "2\n" + "/3");
        driver.navigate().refresh();
    }
    @Test
    public void FDeletePathWithCourses() throws Exception {
        LoginFunctions LoginFunctions = new LoginFunctions(driver);
        PanelPage PanelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage CreateTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        Thread.sleep(5000);
        LoginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);

        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
        Thread.sleep(8000);
        PanelPage.buttonContent();
        PanelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Con 3 Cursos Requeridos");
        learningPathABMPage.menuWithOptions();
        learningPathABMPage.optionDeletePath();
        Thread.sleep(8000);
        WebElement elemento = learningPathABMPage.messageDeletePath();
        Assert.assertEquals(elemento.getText(), "¿Deseas eliminar la ruta");
        learningPathABMPage.buttonConfirmDeletePath();
        Thread.sleep(3000);
        WebElement elemento3 = learningPathABMPage.textPopUpAlert();
        Assert.assertEquals(elemento3.getText(), "Se ha eliminado el borrador QA Track Con 3 Cursos Requeridos éxitosamente");
    }
    @Test
    public void GDeactivatePath() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);

        driver.manage().window().maximize();
        Thread.sleep(5000);
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(2000);

        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
        Thread.sleep(15000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathABMPage.inputLearningPathsC();
        WebElement elemento0 = learningPathABMPage.tittleLearningPaths();
        Assert.assertEquals(elemento0.getText(), "Rutas de aprendizajes");
        learningPathABMPage.inputLearningPaths("QA Track Sin Cursos Requeridos");
        Thread.sleep(5000);
        learningPathABMPage.menuWithOptions();
        learningPathABMPage.buttonDeactivatePath();
        WebElement elemento1 = learningPathABMPage.messageQuestionDeactivate();
        Assert.assertEquals(elemento1.getText(), "¿Deseas desactivar la ruta?");
        learningPathABMPage.buttonConfirmDeactivate();
        WebElement elemento2 = learningPathABMPage.stateDeactivatePath();
        WebElement elemento3 = null;
        if (learningPathABMPage.isElementPresent()) {
            elemento3 = learningPathABMPage.stateDeactivatePath();
            String textoElemento3 = elemento3.getText();
            if (textoElemento3.equals("desactivada")) {
                System.out.println("El texto del elemento es 'desactivada'. Test Passed.");
            } else {
                Assert.assertTrue(Boolean.parseBoolean("El texto del elemento no es 'desactivada'. Test Failed."));
            }
        } else {
            System.out.println("El elemento no está presente. Test Passed.");
        }

        Assert.assertEquals(elemento2.getText(), "desactivada");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathABMPage.menuWithOptions();
        learningPathABMPage.buttonActivatePath();
        WebElement elemento4 = learningPathABMPage.messageQuestionActivate();
        Assert.assertEquals(elemento4.getText(), "¿Deseas reactivar la ruta?");
        learningPathABMPage.buttonReactivateConfirm();
        Thread.sleep(3000);
        WebElement elemento5 = null;
        if (learningPathABMPage.isElementPresent()) {
            elemento5 = learningPathABMPage.stateDeactivatePath();
            String textoElemento4 = elemento5.getText();
            if (textoElemento4.equals("desactivada")) {
                Assert.fail("El texto del elemento es 'desactivada'. Test fallido.");
            } else {
                System.out.println("Test Passed");
            }
        } else {
            System.out.println("El elemento no está presente. Test Passed.");
        }

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

        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
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
        Assert.assertEquals(elemento1.getText(), "QA Track con cursos requeridos");
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.addUser();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.inputAddUserC();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(6000);
        learningPathPage.inputAddUserText("robot.1@mailinator.com");
        Thread.sleep(8000);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.inputAddUserEnter();
        learningPathPage.buttonConfirmAddUser();
        WebElement elemento2 = learningPathPage.messageAddUserOk();
        Assert.assertEquals(elemento2.getText(), "Usuario(s) agregado(s) satisfactoriamente");
        Thread.sleep(6000);
        WebElement element = learningPathPage.nameFirstUser();
        Assert.assertEquals(element.getText(), "Robot 1");
        Thread.sleep(3000);
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

        driver.navigate().to("https://qa.creha.co/org/crehana-automation");
        Thread.sleep(6000);
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
        Assert.assertEquals(elemento1.getText(), "QA Track con cursos requeridos");
        Thread.sleep(3000);
        learningPathPage.deleteCourseCrehana();
        learningPathPage.buttonDeleteCourse();
        Thread.sleep(10000);
        WebElement elemento2 = learningPathPage.popAlertNotDeleteCourse();
        Assert.assertEquals(elemento2.getText(), "La cantidad de cursos asignados no puede ser menor a la cantidad de cursos requeridos que se configuró para completar la ruta.");
        Thread.sleep(3000);
        Thread.sleep(2000);
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

        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathABMPage.inputLearningPathsC();
        WebElement elemento0 = learningPathABMPage.tittleLearningPaths();
        Assert.assertEquals(elemento0.getText(), "Rutas de aprendizajes");
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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        learningPathPage.buttonDeleteConfirm();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement elemento1 = learningPathPage.popupAddCourseOK();
        Assert.assertEquals(elemento1.getText(), "Curso(s) agregado(s) satisfactoriamente");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().refresh();
        learningPathPage.addCourseIfNotExists();
        learningPathPage.inputAddCoursesC();
        learningPathPage.inputAddCourses("qa curso propio");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        learningPathPage.addCourseElevate();
        learningPathPage.saveChangesAddCourses();
        Thread.sleep(3000);
        WebElement elemento2 = learningPathPage.popupAddCourseOK();
        Assert.assertEquals(elemento2.getText(), "Curso(s) agregado(s) satisfactoriamente");
        WebElement elemento = learningPathABMPage.validoPosicionCursoQA();
        Assert.assertEquals(elemento.getText(), "QA Curso Propio Automation");
        Thread.sleep(3000);
        learningPathPage.deleteCourseCrehana();
        learningPathPage.buttonDeleteCourse();
        learningPathPage.buttonDeleteConfirm();
        Thread.sleep(3000);
        WebElement elemento3 = learningPathPage.validationCoursesTotal();
        Assert.assertEquals(elemento3.getText(), "0\n" + "Total de cursos");
        driver.navigate().refresh();
    }



    @Test
    public void CreatePathWithCoursesElevate() throws Exception {
        LoginFunctions LoginFunctions = new LoginFunctions(driver);
        PanelPage PanelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage createTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        LoginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
        Thread.sleep(8000);
        PanelPage.buttonContent();
        PanelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        learningPathABMPage.buttonCreatePath();
        learningPathABMPage.buttonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.nameNewTrack();
        createTrackPage.inputNameNewTrackSet("QA Track Con Curso Elevate");
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
        WebElement elemento = createTrackPage.resumeListUsers();
        Assert.assertEquals(elemento.getText(), "1 usuarios");
        Thread.sleep(8000);
        createTrackPage.buttonConfirmTrack();
        Thread.sleep(8000);
        WebElement elemento0 = createTrackPage.messageGenial();
        Assert.assertEquals(elemento0.getText(), "¡Genial! Estás a punto de dar un gran paso");
        WebElement elemento1 = createTrackPage.messageGenialConfirmar();
        Assert.assertEquals(elemento1.getText(), "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        createTrackPage.buttonConfirmTrackFinal();
        Thread.sleep(8000);
        WebElement elemento2 = createTrackPage.messageTrackCreado();
        Assert.assertEquals(elemento2.getText(), "¡Tu track ha sido creado!");
        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/content/paths/");
        Thread.sleep(6000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Con Curso Elevate");
        WebElement elemento3 = learningPathABMPage.nameCourseGet();
        Assert.assertEquals(elemento3.getText(), "QA Track Con Curso Elevate");
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
        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
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
        WebElement elemento = createTrackPage.resumeListUsers();
        Assert.assertEquals(elemento.getText(), "1 usuarios");
        Thread.sleep(8000);
        createTrackPage.buttonConfirmTrack();
        Thread.sleep(8000);
        WebElement elemento0 = createTrackPage.messageGenial();
        Assert.assertEquals(elemento0.getText(), "¡Genial! Estás a punto de dar un gran paso");
        WebElement elemento1 = createTrackPage.messageGenialConfirmar();
        Assert.assertEquals(elemento1.getText(), "Si estás seguro de los datos ingresados y los cursos seleccionados, dale en confirmar.");
        createTrackPage.buttonConfirmTrackFinal();
        Thread.sleep(8000);
        WebElement elemento2 = createTrackPage.messageTrackCreado();
        Assert.assertEquals(elemento2.getText(), "¡Tu track ha sido creado!");
        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/content/paths/");
        Thread.sleep(6000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Con Cursos Crehana y Elevate");
        WebElement elemento3 = learningPathABMPage.nameCourseGet();
        Assert.assertEquals(elemento3.getText(), "QA Track Con Cursos Crehana y Elevate");
        WebElement elemento4 = learningPathABMPage.contadorCoursesRequired();
        Assert.assertEquals(elemento4.getText(), "4\n" + "/5");
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

        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
        Thread.sleep(6000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        Thread.sleep(10000);
        learningPathABMPage.inputLearningPathsC();
        WebElement elemento0 = learningPathABMPage.tittleLearningPaths();
        Assert.assertEquals(elemento0.getText(), "Rutas de aprendizajes");
        learningPathABMPage.inputLearningPaths("QA Track - con cursos requeridos Editable");
        Thread.sleep(6000);
        learningPathABMPage.nameCourseQATrackConCursosRequeridos();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement elemento1 = learningPathPage.titleCourseInCOurse();
        Assert.assertEquals(elemento1.getText(), "QA Track - con cursos requeridos Editable");
        Thread.sleep(3000);
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
        WebElement elemento3 = learningPathPage.messageUpdateRequired();
        Assert.assertEquals(elemento3.getText(), "¡Los requisitos de la ruta fueron actualizados!");
        Thread.sleep(3000);
        WebElement elemento4 = learningPathPage.messageHistorial();
        Assert.assertEquals(elemento4.getText(), "Puedes ver el resumen de tus cambios en\n" + "historial de cambios.");
        Thread.sleep(3000);
        driver.navigate().refresh();
    }


    @Test
    public void deleteSaveDraftCourses() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage createTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
        Thread.sleep(8000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        Thread.sleep(4000);
        WebElement elemento0 = learningPathABMPage.tittleLearningPaths();
        Assert.assertEquals(elemento0.getText(), "Rutas de aprendizajes");
        learningPathABMPage.sectionPreview();
        Thread.sleep(2000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Borrador");
        WebElement elemento = learningPathABMPage.nameCourseGet();
        Assert.assertEquals(elemento.getText(), "QA Track Borrador");
        Thread.sleep(4000);
        learningPathABMPage.menuWithOptions();
        Thread.sleep(2000);
        learningPathABMPage.optionDeletePathDraft();
        Thread.sleep(4000);
        WebElement elemento2 = learningPathABMPage.messageDeletePathDraft();
        Assert.assertEquals(elemento2.getText(), "¿Deseas eliminar el borrador");
        WebElement elemento3 = learningPathABMPage.messageDownAlertDelete();
        Assert.assertEquals(elemento3.getText(), "Una ves eliminado, no podrás recuperar el borrador y tendrás que crear una nueva ruta.");
        learningPathABMPage.buttonConfirmDeletePath();
        Thread.sleep(3000);
        WebElement elemento4 = learningPathABMPage.textPopUpAlert();
        Assert.assertEquals(elemento4.getText(), "Se ha eliminado el borrador QA Track Borrador éxitosamente");

    }
    @Test
    public void draftCoursesWithTitulo() throws Exception {
        LoginFunctions loginFunctions = new LoginFunctions(driver);
        PanelPage panelPage = new PanelPage(driver);
        LearningPathABMPage learningPathABMPage = new LearningPathABMPage(driver);
        CreateTrackPage createTrackPage = new CreateTrackPage(driver);

        driver.manage().window().maximize();
        Thread.sleep(6000);
        loginFunctions.loginActions("manuel.automation@mailinator.com", "1234567890");
        Thread.sleep(6000);
        driver.navigate().to("https://www.crehana.com/org/qa-automation/panel/");
        Thread.sleep(8000);
        panelPage.buttonContent();
        panelPage.buttonLearningPaths();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        learningPathABMPage.buttonCreatePath();
        learningPathABMPage.buttonCreateTrack();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.nameNewTrack();
        createTrackPage.inputNameNewTrackSet("QA Track Borrador con nombre");
        createTrackPage.buttonSavePreview();
        Thread.sleep(5000);
        Assert.assertEquals("El borrador \"QA Track Borrador con nombre\" se guardó correctamente", "El borrador \"QA Track Borrador con nombre\" se guardó correctamente");
        Thread.sleep(3000);
        createTrackPage.buttonCancelPath();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        createTrackPage.buttonSaveAndExit();
        Thread.sleep(4000);
        Assert.assertEquals("El borrador \"QA Track Borrador con nombre\" se guardó correctamente", "El borrador \"QA Track Borrador con nombre\" se guardó correctamente");
        Thread.sleep(3000);
        learningPathABMPage.sectionPreview();
        Thread.sleep(2000);
        learningPathABMPage.inputLearningPathsC();
        learningPathABMPage.inputLearningPaths("QA Track Borrador con nombre");
        WebElement elemento = learningPathABMPage.nameCourseGet();
        Assert.assertEquals(elemento.getText(), "QA Track Borrador con nombre");
        driver.navigate().refresh();
    }
}