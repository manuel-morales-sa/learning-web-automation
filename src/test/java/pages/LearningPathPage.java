package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearningPathPage extends BasePage {

    //Estos elementos pertenecen a Objetos dentro de una Ruta de aprendizaje. Parte CURSOS.
    @FindBy(xpath = "//*[@id=\"AdminDashboardBody\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/h3")
    private WebElement titleCourseInCOurse;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[2]/div[1]/button[1]")
    private WebElement buttonAddCourses;

    @FindBy(xpath = "/html/body/div[9]/div[4]/div/div/div/div/div/div/div/label/div/div/input")
    private WebElement inputAddCoursesC;

    @FindBy(xpath = "/html/body/div[9]/div[4]/div/div/div/div/div/div/div/label/div/div/input")
    private WebElement inputAddCourses;

    @FindBy(xpath = "/html/body/div[9]/div[4]/div/div/div/div/div/div/div/div[2]/div/div[1]/button")
    private WebElement addCourseButton;

    @FindBy(xpath = "//button[contains(text(),'Guardar cambios')]")
    private WebElement saveChangesAddCourses;
    @FindBy(xpath = "/html[1]/body[1]/div[4]")
    private WebElement popupAddCourseOK;

    @FindBy(xpath = "//span[contains(text(),'¿Estás seguro de que deseas eliminar el curso')]")
    private WebElement popupQuestionDeleteMessage;
    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement popupQuestionDeleteMessageNameCourse;
    @FindBy(xpath = "//p[contains(text(),'La cantidad de cursos asignados no puede ser menor')]")
    private WebElement popAlertNotDeleteCourse;
    @FindBy(xpath = "/html[1]/body[1]/div[4]")
    private WebElement popupConfirmDeleteCourse;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[6]/div[1]/div[1]/button[1]")
    private WebElement deleteCourseInformatica;

    @FindBy(xpath = "//span[contains(text(),'Eliminar de la ruta')]")
    private WebElement buttonDeleteCourse;

    @FindBy(xpath = "//button[contains(text(),'Si, eliminar')]")
    private WebElement buttonDeleteConfirm;

    @FindBy(xpath = "//tbody/tr[5]/td[6]/div[1]/div[1]/button[1]")
    private WebElement deleteCourseRequired;

    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    private WebElement buttonOK;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/div[5]/div/div[1]/div[2]/button[1]/span")
    private WebElement addCourseIfNotExists;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]")
    private WebElement validationCoursesTotal;

    //Estos elementos pertenecen a Objetos dentro de una Ruta de aprendizaje. Parte USUARIOS.
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div[2]/div[4]/div[3]/p/button")
    private WebElement addUser;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement inputAddUserC;

    @FindBy(xpath = "//input[@id='react-select-react-select-users-input-input']")
    private WebElement inputAddUserText;

    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[2]/div/div/div[1]/div/div[2]")
    private WebElement inputAddUserEnter;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]")
    private WebElement buttonConfirmAddUser;

    @FindBy(xpath = "//p[contains(text(),'Robot 1')]")
    private WebElement nameFirstUser;
    @FindBy (xpath = "//p[contains(text(),'Usuario(s) agregado(s) satisfactoriamente')]")
    private WebElement messageAddUserOk;

    //Estos elementos pertenecen a Objetos dentro de una Ruta de aprendizaje. Parte REQUISITOS.
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[1]/div[3]/div[1]/div[5]/div")
    private WebElement editRequired;

    @FindBy(xpath = "//button[contains(text(),'Si, continuar')]")
    private WebElement confirmRequired;

    @FindBy(xpath = "//body/div[23]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]/*[1]")
    private WebElement addCourseRequiredPlus;

    @FindBy(xpath = "/html[1]/body[1]/div[23]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[2]")
    private WebElement addProjectRequiredPlus;

    @FindBy (xpath = "//p[contains(text(),'¡Los requisitos de la ruta fueron actualizados!')]")
    private WebElement messageUpdateRequired;
    @FindBy (xpath = "/html[1]/body[1]/div[25]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")
    private WebElement messageHistorial;

    @FindBy(xpath = "/html[1]/body[1]/div[23]/div[1]/div[1]/div[3]/button[2]")
    private WebElement saveAddProjectRequiredPlus;

    @FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/div[1]/button[1]/*[1]")
    private WebElement deleteCourseCrehana;

    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    private WebElement addCourseElevate;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/section[1]/div[1]/button[1]")
    private WebElement buttonSavePreview;

    //-----------------------Constructor-----------------------//
    public LearningPathPage(WebDriver driver) {
        super(driver);
    }
    //-----------------------Actions Methods-----------------------//

    public WebElement messageAddUserOk() {
        messageAddUserOk.getText();
        return messageAddUserOk;
    }
    public WebElement popupAddCourseOK() {
        titleCourseInCOurse.getText();
        return popupAddCourseOK;
    }
    public WebElement messageHistorial() {
        messageHistorial.getText();
        return messageHistorial;
    }
    public WebElement messageUpdateRequired() {
        messageUpdateRequired.getText();
        return messageUpdateRequired;
    }

    public WebElement popupConfirmDeleteCourse() {
        popupConfirmDeleteCourse.getText();
        return popupConfirmDeleteCourse;
    }
    public WebElement popupQuestionDeleteMessage() {
        popupQuestionDeleteMessage.getText();
        return popupQuestionDeleteMessage;
    }
    public WebElement popAlertNotDeleteCourse() {
        popAlertNotDeleteCourse.getText();
        return popAlertNotDeleteCourse  ;
    }
    public WebElement titleCourseInCOurse() {
        titleCourseInCOurse.getText();
        return titleCourseInCOurse;
    }
    public void deleteCourseRequired() {
        deleteCourseRequired.click();
    }

    public void buttonOK() {
        buttonOK.click();
    }

    public void buttonAddCourses() {
        buttonAddCourses.click();
    }

    public void inputAddCoursesC() {
        inputAddCoursesC.click();
    }

    public void inputAddCourses(String ia) {
        inputAddCourses.sendKeys(ia);
    }

    public void addCourseButton() {
        addCourseButton.click();
    }

    public void saveChangesAddCourses() {
        saveChangesAddCourses.click();
    }

    public void deleteCourseInformatica() {
        deleteCourseInformatica.click();
    }

    public void buttonDeleteCourse() {
        buttonDeleteCourse.click();
    }

    public void buttonDeleteConfirm() {
        buttonDeleteConfirm.click();
    }

    public void addUser() {
        addUser.click();
    }

    public void inputAddUserC() {
        inputAddUserC.click();
    }

    public void inputAddUserText(String user) {
        inputAddUserText.sendKeys(user);
    }

    public void buttonConfirmAddUser() {
        buttonConfirmAddUser.click();
    }

    public void inputAddUserEnter() {
        inputAddUserEnter.click();
    }

    public void editRequired() {
        editRequired.click();
    }

    public void confirmRequired() {
        confirmRequired.click();
    }

    public void addCourseRequiredPlus() {
        addCourseRequiredPlus.click();
    }

    public void addProjectRequiredPlus() {
        addProjectRequiredPlus.click();
    }

    public void saveAddProjectRequiredPlus() {
        saveAddProjectRequiredPlus.click();
    }

    public WebElement nameFirstUser() {
        nameFirstUser.getText();
        return nameFirstUser;
    }

    public void deleteCourseCrehana() {
        deleteCourseCrehana.click();
    }

    public void addCourseElevate() {
        addCourseElevate.click();
    }

    public void addCourseIfNotExists() {
        addCourseIfNotExists.click();
    }

    public WebElement validationCoursesTotal() {
        validationCoursesTotal.getText();
        return validationCoursesTotal;
    }

}