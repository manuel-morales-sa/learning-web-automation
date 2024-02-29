package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAdministratorPage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[1]/button[2]/div")
    private WebElement buttonAdministration;



    //-----------------------Constructor-----------------------//


    public UserAdministratorPage(WebDriver driver) {
        super(driver);
    }

    //-----------------------Actions Methods-----------------------//
    public void buttonAdministration() {
        buttonAdministration.click();
    }




}

