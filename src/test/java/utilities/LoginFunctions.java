package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class LoginFunctions extends BasePage {

    @FindBy(id = "button_button_stack_1")
    private WebElement landingLoginButton;


    @FindBy(xpath = "/html/body/div[1]/div/div/section/section/div[2]/div/div/div[2]/form/div[1]/label/div/div/input")
    private WebElement loginEmailTextInput;

    @FindBy(id = "password")
    private WebElement loginPasswordTextInput;

    @FindBy(xpath = "/html/body/div[1]/div/div/section/section/div[2]/div/div/div[2]/form/div[2]/button")
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