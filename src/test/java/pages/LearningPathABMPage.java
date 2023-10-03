package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import javax.xml.xpath.XPath;

public class LearningPathABMPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"AdminDashboardBody\"]/div[1]/div/div/div/div/div[2]/div/h3")
    private WebElement tittleLearningPaths;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement inputLearningPathsC;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement inputLearningPaths;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/p[1]/span[1]")
    private WebElement nameCourseQATrackConCursosRequeridos;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/p[1]/span[1]")
    private WebElement nameCourseQATrackConCursosRequeridosGet;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")
    private WebElement buttonCreatePath;

    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]")
    private WebElement buttonCreateTrack;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[3]/p[1]")
    private WebElement validoPosicionCursoQA;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]")
    private WebElement contadorCoursesRequired;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[2]/div[1]/span[1]")
    private WebElement sectionPreview;
    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/*[1]")
    private WebElement menuWithOptions;
    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/div[4]/button[1]")
    private WebElement optionDeletePath;
    @FindBy(xpath = "//p[contains(text(),'¿Deseas eliminar la ruta')]")
    private WebElement messageDeletePath;
    @FindBy(xpath = "/html[1]/body[1]/div[15]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/p[2]/span[1]")
    private WebElement nameCoursePopupConfirm;
    @FindBy (xpath = "/html/body/div[6]/p")
    private WebElement textPopUpAlert;
    @FindBy (xpath = "//button[contains(text(),'Sí, eliminar')]")
    private WebElement buttonConfirmDeletePath;
    @FindBy(xpath = "/html[1]/body[1]/div[6]/p[1]")
    private  WebElement toastConfirmDeletePath;
    @FindBy(xpath = "/html/body/div[4]/p")
    private WebElement messageSavePreview;
    @FindBy(xpath = "//p[contains(text(),'¡Genial! Estás a punto de dar un gran paso')]")
    private WebElement messageGenial;
    @FindBy(xpath = "//p[contains(text(),'Si estás seguro de los datos ingresados y los curs')]")
    private WebElement messageGenialConfirmar;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[6]/section[1]/p[1]")
    private WebElement resumeListUsers;
    @FindBy(xpath = "//p[contains(text(),'¡Tu track ha sido creado!')]")
    private WebElement messageTrackCreado;

    //-----------------------Constructor-----------------------//
    public LearningPathABMPage(WebDriver driver) {
        super(driver);
    }

    //-----------------------Actions Methods-----------------------//
    public WebElement tittleLearningPaths() {
        tittleLearningPaths.getText();
        return tittleLearningPaths;
    }
    public WebElement messageTrackCreado() {
        messageTrackCreado.getText();
        return messageTrackCreado;
    }
    public WebElement messageGenial() {
        messageGenial.getText();
        return messageGenial;
    }
    public WebElement messageGenialConfirmar() {
        messageGenialConfirmar.getText();
        return messageGenialConfirmar;
    }
    public WebElement messageSavePreview() {
        messageSavePreview.getText();
        return messageSavePreview;
    }
    public WebElement resumeListUsers() {
        resumeListUsers.getText();
        return resumeListUsers;
    }

    public void InputLearningPathsC() {

        inputLearningPathsC.click();
    }
    public void InputLearningPaths(String Curso) {

        inputLearningPaths.sendKeys(Curso);
    }
    public void ButtonCreatePath() {

        buttonCreatePath.click();
    }
    public void ButtonCreateTrack() {

        buttonCreateTrack.click();
    }
    public void inputLearningPathsC() {

        inputLearningPathsC.click();
    }

    public void inputLearningPaths(String Curso) {

        inputLearningPaths.sendKeys(Curso);
    }

    public void nameCourseQATrackConCursosRequeridos() {

        nameCourseQATrackConCursosRequeridos.click();
    }

    public void SectionPreview() {

        sectionPreview.click();
    }

    public void buttonCreatePath() {

        buttonCreatePath.click();
    }

    public void buttonCreateTrack() {

        buttonCreateTrack.click();
    }
    public void MenuWithOptions() {

        menuWithOptions.click();
    }
    public void OptionDeletePath() {

        optionDeletePath.click();
    }
    public WebElement MessageDeletePath() {
        messageDeletePath.getText();
        return messageDeletePath;
    }
    public WebElement NameCoursePopupConfirm() {
        nameCoursePopupConfirm.getText();
        return nameCoursePopupConfirm;
    }
    public WebElement TextPopUpAlert() {
        textPopUpAlert.getText();
        return textPopUpAlert;
    }
    public void ButtonConfirmDeletePath() {
        buttonConfirmDeletePath.click();
    }
    public WebElement toastConfirmDeletePath() {
        toastConfirmDeletePath.getText();
        return toastConfirmDeletePath;
    }

    public WebElement nameCourseQATrackConCursosRequeridosGet() {
        nameCourseQATrackConCursosRequeridosGet.getText();
        return nameCourseQATrackConCursosRequeridosGet;
    }
    public WebElement validoPosicionCursoQA() {
        validoPosicionCursoQA.getText();
        return validoPosicionCursoQA;
    }

    public void sectionPreview() {

        sectionPreview.click();
    }

    public WebElement contadorCoursesRequired() {
        contadorCoursesRequired.getText();
        return contadorCoursesRequired;
    }

}
