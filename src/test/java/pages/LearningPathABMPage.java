package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class LearningPathABMPage extends BasePage{

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]")
    private WebElement TittleLearningPaths;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement InputLearningPathsC;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement InputLearningPaths;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/p[1]/span[1]")
    private WebElement NameCourseQATrackConCursosRequeridos;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/p[1]/span[1]")
    private WebElement NameCourseQATrackConCursosRequeridosGet;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")
    private WebElement ButtonCreatePath;
    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]")
    private WebElement ButtonCreateTrack;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/p[1]")
    private WebElement ValidoPosicionCursoQA;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]")
    private WebElement ContadorCoursesRequired;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[2]/div[1]/span[1]")
    private WebElement SectionPreview;
    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/*[1]")
    private WebElement MenuWithOptions;
    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/div[4]/button[1]")
    private WebElement OptionDeletePath;
    @FindBy(xpath = "//p[contains(text(),'¿Deseas eliminar la ruta')]")
    private WebElement MessageDeletePath;
    @FindBy(xpath = "/html[1]/body[1]/div[15]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/p[2]/span[1]")
    private WebElement NameCoursePopupConfirm;
    @FindBy (xpath = "/html[1]/body[1]/div[15]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]")
    private WebElement TextPopUpAlert;
    @FindBy (xpath = "//button[contains(text(),'Sí, eliminar')]")
    private WebElement ButtonConfirmDeletePath;
    @FindBy(xpath = "/html[1]/body[1]/div[6]/p[1]")
    private  WebElement ToastConfirmDeletePath;
    //-----------------------Constructor-----------------------//
    public LearningPathABMPage(WebDriver driver) {
        super(driver);
    }

    //-----------------------Actions Methods-----------------------//

    public void InputLearningPathsC() {InputLearningPathsC.click();}
    public void InputLearningPaths(String Curso) {InputLearningPaths.sendKeys(Curso);}
    public void NameCourseQATrackConCursosRequeridos() {
        NameCourseQATrackConCursosRequeridos.click();
    }
    public void ButtonCreatePath() {
        ButtonCreatePath.click();
    }
    public void ButtonCreateTrack() {
        ButtonCreateTrack.click();
    }

    public WebElement NameCourseQATrackConCursosRequeridosGet() {
        NameCourseQATrackConCursosRequeridosGet.getText();
        return NameCourseQATrackConCursosRequeridosGet;
    }
    public WebElement ValidoPosicionCursoQA() {
        ValidoPosicionCursoQA.getText();
        return ValidoPosicionCursoQA;
    }
    public void SectionPreview() {SectionPreview.click();
    }
    public WebElement ContadorCoursesRequired() {
        ContadorCoursesRequired.getText();
        return ContadorCoursesRequired;
    }
    public void MenuWithOptions() {MenuWithOptions.click();}
    public void OptionDeletePath() {OptionDeletePath.click();}
    public WebElement MessageDeletePath() {
        MessageDeletePath.getText();
        return MessageDeletePath;
    }
    public WebElement NameCoursePopupConfirm() {
        NameCoursePopupConfirm.getText();
        return NameCoursePopupConfirm;
    }
    public WebElement TextPopUpAlert() {
        TextPopUpAlert.getText();
        return TextPopUpAlert;
    }
    public void ButtonConfirmDeletePath() {ButtonConfirmDeletePath.click();}
    public WebElement ToastConfirmDeletePath() {
        ToastConfirmDeletePath.getText();
        return ToastConfirmDeletePath;
    }
}
