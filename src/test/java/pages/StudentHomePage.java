package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentHomePage extends BasePage {
    @FindBy (xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/button[1]")
    private WebElement contentButtonStudent;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/button[1]")
    private WebElement learnPathButton;
    @FindBy(xpath = "//p[contains(text(),'QA Track Con Rewards')]")
    private WebElement namePathGetStudent;

    //-----------------------Constructor-----------------------//
    public StudentHomePage(WebDriver driver) {
        super(driver);
    }

    //-----------------------Actions Methods-----------------------//
    public void contentButtonStudent() {
        contentButtonStudent.click();
    }
    public void learnPathButton() {
        learnPathButton.click();
    }
    public WebElement namePathGetStudent() {
        namePathGetStudent.getText();
        return namePathGetStudent;
    }
    public boolean isElementPresent() {
        try {
            WebElement elemento = namePathGetStudent();
            return elemento != null && elemento.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
