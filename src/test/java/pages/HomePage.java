package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/a[1]/div/picture/img")
    private WebElement orgLogo;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/section/div[2]/h1/p")
    private WebElement welcomeAssert;
    @FindBy(xpath = "//*[@id=\"main-footer\"]/div/div[1]/div[4]/div/a[1]")
    private WebElement googlePlayButton;

    //-----------------------Constructor-----------------------//
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //-----------------------Actions Methods-----------------------//
    public void orgLogo() {
        orgLogo.click();
    }

    public WebElement welcomeAssert() {
        welcomeAssert.getText();
        return welcomeAssert;
    }
    public WebElement googlePlayButton(){
        googlePlayButton.click();
        return null;
    }
}
