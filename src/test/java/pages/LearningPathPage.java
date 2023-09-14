package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearningPathPage extends BasePage{

    //Estos elementos pertenecen a Objetos dentro de una Ruta de aprendizaje. Parte CURSOS.
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[2]/div[1]/button[1]")
    private WebElement ButtonAddCourses;
    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement InputAddCoursesC;
    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement InputAddCourses;
    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    private WebElement AddCourseButton;
    @FindBy(xpath = "//button[contains(text(),'Guardar cambios')]")
    private WebElement SaveChangesAddCourses;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[6]/div[1]/div[1]/button[1]")
    private WebElement DeleteCourseInformatica;
    @FindBy(xpath = "//span[contains(text(),'Eliminar de la ruta')]")
    private WebElement ButtonDeleteCourse;
    @FindBy(xpath = "//button[contains(text(),'Si, eliminar')]")
    private WebElement ButtonDeleteConfirm;
    @FindBy(xpath = "//tbody/tr[5]/td[6]/div[1]/div[1]/button[1]")
    private WebElement DeleteCourseRequired;
    @FindBy(xpath = "/html[1]/body[1]/div[8]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    private WebElement ButtonOK;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[3]/p[1]/button[1]")
    private WebElement AddCourseIfNotExists;


    //Estos elementos pertenecen a Objetos dentro de una Ruta de aprendizaje. Parte USUARIOS.
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[3]/p[1]")
    private WebElement AddUser;
    @FindBy(xpath = "/html[1]/body[1]/div[10]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement InputAddUserC;
    @FindBy(xpath = "/html[1]/body[1]/div[10]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement InputAddUserText;
    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[2]/div/div/div[1]/div/div[2]")
    private WebElement InputAddUserEnter;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]")
    private WebElement ButtonConfirmAddUser;
    @FindBy(xpath = "//p[contains(text(),'Robot 1')]")
    private WebElement NameFirstUser;

    //Estos elementos pertenecen a Objetos dentro de una Ruta de aprendizaje. Parte REQUISITOS.
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[1]/div[3]/div[1]/div[5]/div")
    private WebElement EditRequired;
    @FindBy(xpath = "/html[1]/body[1]/div[19]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/button[1]")
    private WebElement ConfirmRequired;
    @FindBy(xpath = "/html[1]/body[1]/div[23]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]")
    private WebElement AddCourseRequiredPlus;
    @FindBy(xpath = "/html[1]/body[1]/div[23]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[2]")
    private WebElement AddProjectRequiredPlus;
    @FindBy(xpath = "/html[1]/body[1]/div[23]/div[1]/div[1]/div[3]/button[2]")
    private WebElement SaveAddProjectRequiredPlus;

    @FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/div[1]/button[1]/*[1]")
    private WebElement DeleteCourseCrehana;

    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    private WebElement AddCourseElevate;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/p[1]")
    private WebElement ValidoPosicionCursoQA;


    //-----------------------Constructor-----------------------//
    public LearningPathPage(WebDriver driver) {
        super(driver);
    }
    //-----------------------Actions Methods-----------------------//


    public void DeleteCourseRequired() {DeleteCourseRequired.click();}
    public void ButtonOK() {ButtonOK.click();}
    public void ButtonAddCourses() {
        ButtonAddCourses.click();
    }
    public void InputAddCoursesC() {
        InputAddCoursesC.click();
    }
    public void InputAddCourses(String ia) {InputAddCourses.sendKeys(ia);}
    public void AddCourseButton() {AddCourseButton.click();}
    public void SaveChangesAddCourses () {SaveChangesAddCourses.click();}
    public void DeleteCourseInformatica () {DeleteCourseInformatica.click();}
    public void ButtonDeleteCourse() {ButtonDeleteCourse.click();}
    public void ButtonDeleteConfirm() {ButtonDeleteConfirm.click();}
    public void AddUser() {AddUser.click();}
    public void InputAddUserC() {InputAddUserC.click();}
    public void InputAddUserText(String user) {InputAddUserText.sendKeys(user);}
    public void ButtonConfirmAddUser() {ButtonConfirmAddUser.click();}
    public void InputAddUserEnter() {InputAddUserEnter.click();}
    public void EditRequired() {EditRequired.click();}
    public void ConfirmRequired() {ConfirmRequired.click();}
    public void AddCourseRequiredPlus() {AddCourseRequiredPlus.click();}
    public void AddProjectRequiredPlus() {AddProjectRequiredPlus.click();}
    public void SaveAddProjectRequiredPlus() {SaveAddProjectRequiredPlus.click();}
    public WebElement NameFirstUser() {
        NameFirstUser.getText();
        return NameFirstUser;
    }
    public void DeleteCourseCrehana() {DeleteCourseCrehana.click();}
    public void AddCourseElevate() {AddCourseElevate.click();}
    public WebElement ValidoPosicionCursoQA() {
        ValidoPosicionCursoQA.getText();
        return ValidoPosicionCursoQA;
    }
    public void AddCourseIfNotExists() {AddCourseIfNotExists.click();}
}

