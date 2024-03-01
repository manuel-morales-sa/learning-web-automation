package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAdministratorGamification extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[1]/button[4]/div")
    private WebElement buttonGamificacion;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[1]/div[5]/div/ul/li[1]/button")
    private WebElement buttonProgressGamificacion;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div/div/div/div[2]/div/h3")
    private WebElement TitleGamificacion;

    @FindBy(xpath = /html/body/div[1]/div/div[2]/div[1]/div[2]/div[1]/button)
    private WebElement TitleGamificacion;





    //-----------------------Constructor-----------------------//

    public UserAdministratorGamification(WebDriver driver) {
        super(driver);
    }

    //-----------------------Actions Methods-----------------------//
    public void buttonGamificacion() {
        buttonGamificacion.click();
    }
    public void buttonProgressGamificacion() {
        buttonProgressGamificacion.click();
    }

    public WebElement TitleGamificacion() {
        TitleGamificacion.getText();
        return TitleGamificacion;
    }


}
