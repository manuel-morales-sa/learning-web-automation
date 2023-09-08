package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearningPathPage {

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[2]/div[1]/button[1]")
    private WebElement ButtonAddCourses;
    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement InputAddCoursesC;
    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement InputAddCourses;
    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")
    private WebElement AddCourseButton;
    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
    private WebElement SaveChangesAddCourses;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[6]/div[1]/div[1]/button[1]")
    private WebElement DeleteCourseInformatica;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[6]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    private WebElement ButtonDeleteCourse;
    @FindBy(xpath = "/html[1]/body[1]/div[8]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")
    private WebElement ButtonDeleteConfirm;

    @FindBy(xpath = "//tbody/tr[6]/td[6]/div[1]/div[1]/button[1]/*[1]")
    private WebElement DeleteCourseRequired;

    @FindBy(xpath = "/html[1]/body[1]/div[8]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    private WebElement ButtonOK;

    //-----------------------Constructor-----------------------//
    public LearningPathPage(WebDriver driver) {super();}

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
}

