package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateTrackPage extends BasePage {

    @FindBy(css = "#trackName")
    private WebElement nameNewTrack;

    @FindBy(css = "#trackName")
    private WebElement inputNameNewTrackSet;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
    private WebElement addRewards;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement addCoursesInTrack;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement addCoursesInTrackClear;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[2]/div[2]/div[2]/button[1]")
    private WebElement selectFirtsCourseInTrack;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]")
    private WebElement select2CourseInTrack;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[3]/div[2]/div[2]/button[1]")
    private WebElement select3CourseInTrack;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[4]/div[2]/div[2]/button[1]")
    private WebElement select4CourseInTrack;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/div[5]/div[2]/div[2]/button[1]")
    private WebElement select5CourseInTrack;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/button[1]")
    private WebElement buttonNext;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[2]/div[1]/button[1]")
    private WebElement buttonSubstraccionCourse;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[2]/div[1]/button[2]")
    private WebElement buttonPlusRewards;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/section[1]/div[3]/button[28]")
    private WebElement dateStart;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/section[1]/div[3]/button[29]")
    private WebElement dateFinish;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/label[1]/span[1]/*[1]")
    private WebElement selectFirstUser;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/section/div/div/button")
    private WebElement buttonConfirmTrack;

    @FindBy(xpath = "/html/body/div[16]/div[4]/div/div/div/div/div/div/div/div/button[2]")
    private WebElement buttonConfirmTrackFinal;

    @FindBy(xpath = "/html[1]/body[1]/div[15]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    private WebElement buttonClose;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/section[1]/div[1]/button[1]")
    private WebElement buttonSavePreview;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/button[1]")
    private WebElement buttonCancelPath;

    @FindBy(xpath = "/html/body/div[13]/div[4]/div/div/div/div/div/div/div/div/button[2]")
    private WebElement buttonSaveAndExit;
    @FindBy(xpath = "//p[contains(text(),'¡Genial! Estás a punto de dar un gran paso')]")
    private WebElement messageGenial;
    @FindBy(xpath = "//p[contains(text(),'Si estás seguro de los datos ingresados y los curs')]")
    private WebElement messageGenialConfirmar;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[6]/section[1]/p[1]")
    private WebElement resumeListUsers;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[7]/section[1]/p[1]")
    private WebElement resumeListUsersCourseWithRewars;
    @FindBy(xpath = "//p[contains(text(),'¡Tu track ha sido creado!')]")
    private WebElement messageTrackCreado;


    //-----------------------Constructor-----------------------//
    public CreateTrackPage(WebDriver driver) {
        super(driver);
    }

    //-----------------------Actions Methods-----------------------//
    public void nameNewTrack() {
        nameNewTrack.click();
    }

    public void inputNameNewTrackSet(String Name) {
        inputNameNewTrackSet.sendKeys(Name);
    }

    public void addRewards() {
        addRewards.click();
    }

    public void addCoursesInTrack(String ia) {
        addCoursesInTrack.sendKeys(ia);
    }

    public void addCoursesInTrackClear() {
        addCoursesInTrack.clear();
    }

    public void selectFirtsCourseInTrack() {
        selectFirtsCourseInTrack.click();
    }

    public void select2CourseInTrack() {
        select2CourseInTrack.click();
    }

    public void select3CourseInTrack() {
        select3CourseInTrack.click();
    }

    public void select4CourseInTrack() {
        select4CourseInTrack.click();
    }

    public void select5CourseInTrack() {
        select5CourseInTrack.click();
    }

    public void buttonNext() {
        buttonNext.click();
    }

    public void buttonSubstraccionCourse() {
        buttonSubstraccionCourse.click();
    }

    public void buttonPlusRewards() {
        buttonPlusRewards.click();
    }

    public void dateStart() {
        dateStart.click();
    }

    public void dateFinish() {
        dateFinish.click();
    }

    public void selectFirstUser() {
        selectFirstUser.click();
    }

    public void buttonConfirmTrack() {
        buttonConfirmTrack.click();
    }

    public void buttonConfirmTrackFinal() {
        buttonConfirmTrackFinal.click();
    }

    public void buttonClose() {
        buttonClose.click();
    }

    public void buttonSavePreview() {
        buttonSavePreview.click();
    }

    public void buttonCancelPath() {
        buttonCancelPath.click();
    }

    public void buttonSaveAndExit() {
        buttonSaveAndExit.click();
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
    public WebElement resumeListUsers() {
        resumeListUsers.getText();
        return resumeListUsers;
    }
    public WebElement resumeListUsersCourseWithRewars() {
        resumeListUsersCourseWithRewars.getText();
        return resumeListUsersCourseWithRewars;
    }

}