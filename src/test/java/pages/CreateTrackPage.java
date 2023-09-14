package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateTrackPage extends BasePage{

    //1° paso de creacion de Track
    @FindBy(css = "#trackName")
    private WebElement NameNewTrack;
    @FindBy(css = "#trackName")
    private WebElement InputNameNewTrackSet;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
    private WebElement AddRewards;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement AddCoursesInTrack;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement AddCoursesInTrackClear;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[2]/div[2]/div[2]/button[1]")
    private WebElement SelectFirtsCourseInTrack;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]")
    private WebElement Select2CourseInTrack;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[3]/div[2]/div[2]/button[1]")
    private WebElement Select3CourseInTrack;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[4]/div[2]/div[2]/button[1]")
    private WebElement Select4CourseInTrack;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[5]/div[2]/div[2]/button[1]")
    private WebElement Select5CourseInTrack;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/button[1]")
    private WebElement ButtonNext;
    //2° paso de creacion de Track
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[2]/div[1]/button[1]")
    private WebElement ButtonSubstraccionCourse;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[2]/div[1]/button[2]")
    private WebElement ButtonPlusRewards;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/section[1]/div[3]/button[25]")
    private WebElement DateStart;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/section[1]/div[3]/button[30]")
    private WebElement DateFinish;
    //3° paso de creacion de Track
    @FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/label[1]/span[1]/*[1]")
    private WebElement SelectFirstUser;

    //4° paso de creacion de Track
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/button[1]")
    private WebElement ButtonConfirmTrack;

    @FindBy(xpath = "/html/body/div[13]/div[4]/div/div/div/div/div/div/div/div/button[2]")
    private WebElement ButtonConfirmTrackFinal;

    @FindBy(xpath = "/html[1]/body[1]/div[15]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    private WebElement ButtonClose;

    //-----------------------Constructor-----------------------//
    public CreateTrackPage(WebDriver driver) {
        super(driver);
    }

    //-----------------------Actions Methods-----------------------//
    public void NameNewTrack() {
        NameNewTrack.click();
    }
    public void InputNameNewTrackSet(String Name) {InputNameNewTrackSet.sendKeys(Name);}
    public void AddRewards(){AddRewards.click();}
    public void AddCoursesInTrack(String ia) {AddCoursesInTrack.sendKeys(ia);}
    public void AddCoursesInTrackClear() {AddCoursesInTrack.clear();}
    public void SelectFirtsCourseInTrack(){SelectFirtsCourseInTrack.click();}
    public void Select2CourseInTrack(){Select2CourseInTrack.click();}
    public void Select3CourseInTrack(){Select3CourseInTrack.click();}
    public void Select4CourseInTrack(){Select4CourseInTrack.click();}
    public void Select5CourseInTrack(){Select5CourseInTrack.click();}
    public void ButtonNext(){ButtonNext.click();}
    public void ButtonSubstraccionCourse(){ButtonSubstraccionCourse.click();}
    public void ButtonPlusRewards(){ButtonPlusRewards.click();}
    public void DateStart(){DateStart.click();}
    public void DateFinish(){DateFinish.click();}
    public void SelectFirstUser(){SelectFirstUser.click();}
    public void ButtonConfirmTrack(){ButtonConfirmTrack.click();}
    public void ButtonConfirmTrackFinal(){ButtonConfirmTrackFinal.click();}
    public void ButtonClose(){ButtonClose.click();}
}
