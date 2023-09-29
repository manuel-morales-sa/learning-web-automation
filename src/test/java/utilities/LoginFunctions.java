package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class LoginFunctions extends BasePage {

    @FindBy(id = "button_button_stack_1")
    private WebElement landingLoginButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/section[1]/section[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/label[1]/div[1]/div[1]/input[1]")
    private WebElement loginEmailTextInput;

    @FindBy(id = "password")
    private WebElement loginPasswordTextInput;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/section[1]/section[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[4]/button[1]")
    private WebElement loginStartSessionButton;

    public LoginFunctions(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public void loginActions(String emailText, String passwordText) {
        //landingLoginButton.click();
        loginEmailTextInput.sendKeys(emailText);
        loginPasswordTextInput.sendKeys(passwordText);
        loginStartSessionButton.click();
    }

}