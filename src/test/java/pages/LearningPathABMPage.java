package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.xml.XmlPackage;

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
    private WebElement nameCourseGet;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")
    private WebElement buttonCreatePath;

    @FindBy(xpath = "//h4[contains(text(),'Crear un track')]")
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
    @FindBy(xpath = "//span[contains(text(),'Eliminar ruta')]")
    private WebElement optionDeletePathDraft;
    @FindBy(xpath = "//p[contains(text(),'¿Deseas eliminar la ruta')]")
    private WebElement messageDeletePath;
    @FindBy(xpath = "//p[contains(text(),'¿Deseas eliminar el borrador')]")
    private WebElement messageDeletePathDraft;
    @FindBy(xpath = "/html[1]/body[1]/div[15]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/p[2]/span[1]")
    private WebElement nameCoursePopupConfirm;
    @FindBy (xpath = "//p[contains(text(),'Se ha eliminado el borrador')]")
    private WebElement textPopUpAlert;
    @FindBy (xpath = "//button[contains(text(),'Sí, eliminar')]")
    private WebElement buttonConfirmDeletePath;
    @FindBy(xpath = "/html[1]/body[1]/div[6]/p[1]")
    private  WebElement toastConfirmDeletePath;
    @FindBy(xpath = "/html/body/div[4]/p")
    private WebElement messageSavePreview;
    @FindBy (xpath = "//span[contains(text(),'Desactivar/ocultar ruta')]")
    private WebElement buttonDeactivatePath;
    @FindBy(xpath = "//p[contains(text(),'¿Deseas desactivar la ruta?')]")
    private WebElement messageQuestionDeactivate;
    @FindBy (xpath = "//p[contains(text(),'¿Deseas reactivar la ruta?')]")
    private WebElement messageQuestionActivate;
    @FindBy (xpath = "//button[contains(text(),'Sí, desactivar')]")
    private WebElement buttonConfirmDeactivate;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/span[1]/span[2]")
    private WebElement stateDeactivatePath;
    @FindBy(xpath = "//span[contains(text(),'Reactivar ruta')]")
    private WebElement buttonActivatePath;
    @FindBy(xpath = "//button[contains(text(),'Sí, reactivar')]")
    private WebElement buttonReactivateConfirm;
    @FindBy(xpath = "//p[contains(text(),'Una ves eliminado, no podrás recuperar el borrador')]")
    private WebElement messageDownAlertDelete;


    //-----------------------Constructor-----------------------//
    public LearningPathABMPage(WebDriver driver) {
        super(driver);
    }

    //-----------------------Actions Methods-----------------------//
    public WebElement tittleLearningPaths() {
        tittleLearningPaths.getText();
        return tittleLearningPaths;
    }
    public WebElement messageQuestionDeactivate() {
        messageQuestionDeactivate.getText();
        return messageQuestionDeactivate;
    }
    public WebElement messageQuestionActivate() {
        messageQuestionActivate.getText();
        return messageQuestionActivate;
    }
    public WebElement messageDownAlertDelete() {
        messageDownAlertDelete.getText();
        return messageDownAlertDelete;
    }
    public WebElement stateDeactivatePath() {
        stateDeactivatePath.getText();
        return stateDeactivatePath;
    }
    public void buttonActivatePath() {
        buttonActivatePath.click();
    }
    public void buttonDeactivatePath() {
        buttonDeactivatePath.click();
    }
    public void buttonConfirmDeactivate() {
        buttonConfirmDeactivate.click();
    }
    public void buttonReactivateConfirm() {
        buttonReactivateConfirm.click();
    }
    public void optionDeletePathDraft() {
        optionDeletePathDraft.click();
    }
    public void inputLearningPaths(String Curso) {
        inputLearningPaths.sendKeys(Curso);
    }
    public void buttonCreatePath() {
        buttonCreatePath.click();
    }
    public void buttonCreateTrack() {
        buttonCreateTrack.click();
    }
    public void inputLearningPathsC() {
        inputLearningPathsC.click();
    }

    public void nameCourseQATrackConCursosRequeridos() {
        nameCourseQATrackConCursosRequeridos.click();
    }

    public void sectionPreview() {
        sectionPreview.click();
    }
    public void menuWithOptions() {
        menuWithOptions.click();
    }
    public void optionDeletePath() {
        optionDeletePath.click();
    }
    public WebElement messageDeletePath() {
        messageDeletePath.getText();
        return messageDeletePath;
    }
    public WebElement messageDeletePathDraft() {
        messageDeletePathDraft.getText();
        return messageDeletePathDraft;
    }
    public WebElement nameCoursePopupConfirm() {
        nameCoursePopupConfirm.getText();
        return nameCoursePopupConfirm;
    }
    public WebElement textPopUpAlert() {
        textPopUpAlert.getText();
        return textPopUpAlert;
    }
    public void buttonConfirmDeletePath() {
        buttonConfirmDeletePath.click();
    }
    public WebElement toastConfirmDeletePath() {
        toastConfirmDeletePath.getText();
        return toastConfirmDeletePath;
    }

    public WebElement nameCourseGet() {
        nameCourseGet.getText();
        return nameCourseGet;
    }
    public WebElement validoPosicionCursoQA() {
        validoPosicionCursoQA.getText();
        return validoPosicionCursoQA;
    }

    public WebElement contadorCoursesRequired() {
        contadorCoursesRequired.getText();
        return contadorCoursesRequired;
    }

    public boolean isElementPresent() {
            try {
                WebElement elemento = stateDeactivatePath();
                return elemento != null && elemento.isDisplayed();
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
    }
}
