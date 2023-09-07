package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class LoginFunctions extends BasePage {

    @FindBy(id = "button_button_stack_1")
    private WebElement landingLoginButton;

    @FindBy(id = "username")
    private WebElement LoginEmailTextInput;

    @FindBy(id = "password")
    private WebElement LoginPasswordTextInput;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div/div[2]/div/div/form/button")
    private WebElement LoginStartSessionButton;

    public LoginFunctions(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public void loginActions(String emailText, String passwordText) {
        landingLoginButton.click();
        LoginEmailTextInput.sendKeys(emailText);
        LoginPasswordTextInput.sendKeys(passwordText);
        LoginStartSessionButton.click();
    }
}
