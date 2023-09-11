package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PanelPage extends BasePage{

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/button[3]/div[1]/div[1]/p[1]")
    private WebElement ButtonContent;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/button[1]")
    private WebElement ButtonLearningPaths;



    //-----------------------Constructor-----------------------//
    public PanelPage(WebDriver driver) {
        super(driver);
    }

    //-----------------------Actions Methods-----------------------//

    public void ButtonContent() {
        ButtonContent.click();
    }
    public void ButtonLearningPaths() {
        ButtonLearningPaths.click();
    }




}
