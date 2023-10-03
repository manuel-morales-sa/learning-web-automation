package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class LoginFunctions extends BasePage {

    @FindBy(id = "button_button_stack_1")
    private WebElement landingLoginButton;

    @FindBy(id = "email")
    private WebElement LoginEmailTextInput;

    @FindBy(id = "password")
    private WebElement LoginPasswordTextInput;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/section[1]/section[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[4]/button[1]")
    private WebElement LoginStartSessionButton;

    public LoginFunctions(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public void loginActions(String emailText, String passwordText) {
        //landingLoginButton.click();
        LoginEmailTextInput.sendKeys(emailText);
        LoginPasswordTextInput.sendKeys(passwordText);
        LoginStartSessionButton.click();
    }
}
