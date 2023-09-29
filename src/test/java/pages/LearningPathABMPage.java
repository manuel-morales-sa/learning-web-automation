package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearningPathABMPage extends BasePage {

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]")
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

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/p[1]")
    private WebElement validoPosicionCursoQA;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]")
    private WebElement contadorCoursesRequired;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[2]/div[1]/span[1]")
    private WebElement sectionPreview;


    //-----------------------Constructor-----------------------//
    public LearningPathABMPage(WebDriver driver) {
        super(driver);
    }

    //-----------------------Actions Methods-----------------------//

    public void inputLearningPathsC() {
        inputLearningPathsC.click();
    }

    public void inputLearningPaths(String Curso) {
        inputLearningPaths.sendKeys(Curso);
    }

    public void nameCourseQATrackConCursosRequeridos() {
        nameCourseQATrackConCursosRequeridos.click();
    }

    public void buttonCreatePath() {
        buttonCreatePath.click();
    }

    public void buttonCreateTrack() {
        buttonCreateTrack.click();
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