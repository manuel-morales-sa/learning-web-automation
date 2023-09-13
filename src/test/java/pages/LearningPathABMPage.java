package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearningPathABMPage extends BasePage{

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]")
    private WebElement TittleLearningPaths;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement InputLearningPathsC;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement InputLearningPaths;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/p[1]/span[1]")
    private WebElement NameCourseQATrackConCursosRequeridos;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")
    private WebElement ButtonCreatePath;
    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]")
    private WebElement ButtonCreateTrack;


    //-----------------------Constructor-----------------------//
    public LearningPathABMPage(WebDriver driver) {
        super(driver);
    }

    //-----------------------Actions Methods-----------------------//

    public void InputLearningPathsC() {
        InputLearningPathsC.click();
    }
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


}
