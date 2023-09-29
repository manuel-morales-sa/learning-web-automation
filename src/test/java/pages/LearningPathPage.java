package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearningPathPage extends BasePage {

    //Estos elementos pertenecen a Objetos dentro de una Ruta de aprendizaje. Parte CURSOS.
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[2]/div[1]/button[1]")
    private WebElement buttonAddCourses;

    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement inputAddCoursesC;

    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement inputAddCourses;

    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    private WebElement addCourseButton;

    @FindBy(xpath = "//button[contains(text(),'Guardar cambios')]")
    private WebElement saveChangesAddCourses;

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

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[3]/p[1]/button[1]")
    private WebElement addCourseIfNotExists;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]")
    private WebElement validationCoursesTotal;

    //Estos elementos pertenecen a Objetos dentro de una Ruta de aprendizaje. Parte USUARIOS.
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div[2]/div[4]/div[3]/p/button")
    private WebElement addUser;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement inputAddUserC;

    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div[2]")
    private WebElement inputAddUserText;

    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[2]/div/div/div[1]/div/div[2]")
    private WebElement inputAddUserEnter;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]")
    private WebElement buttonConfirmAddUser;

    @FindBy(xpath = "//p[contains(text(),'Robot 1')]")
    private WebElement nameFirstUser;

    //Estos elementos pertenecen a Objetos dentro de una Ruta de aprendizaje. Parte REQUISITOS.
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[1]/div[3]/div[1]/div[5]/div")
    private WebElement editRequired;

    @FindBy(xpath = "//button[contains(text(),'Si, continuar')]")
    private WebElement confirmRequired;

    @FindBy(xpath = "/html[1]/body[1]/div[23]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]")
    private WebElement addCourseRequiredPlus;

    @FindBy(xpath = "/html[1]/body[1]/div[23]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[2]")
    private WebElement addProjectRequiredPlus;

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