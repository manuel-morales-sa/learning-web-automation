package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginCrehanaPage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div/div[1]/div/svg[3]")
    private WebElement LoginCrehanaLogo;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div/div[2]/div/div/form/div[1]/h3")
    private WebElement LoginCrehanaLabel;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div/div[2]/div/div/form/div[2]/div/button[1]/svg")
    private WebElement LoginFacebookButton;
    @FindBy(id = "customGoogleButton-1")
    private WebElement LoginGoogleButton;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/section[1]/section[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/label[1]/div[1]/div[1]/input[1]")
    private WebElement LoginEmailTextInput;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/section[1]/section[1]/div[2]/div[1]/div[1]/div[2]/form[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement LoginPasswordTextInput;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div/div[2]/div/div/form/a[1]")
    private WebElement LoginForgotPasswordButton;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div/div[2]/div/div/form/button")
    private WebElement LoginStartSessionButton;
    @FindBy(id = "link-light link-level2")
    private WebElement LoginSignUpButton;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div/div[2]/div/div/form/a[3]")
    private WebElement LoginStartSessionOrgButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div/div[2]/div/div/form/div[4]/span")
    private WebElement LoginAlertErrorMessage;

    //-----------------------Constructor-----------------------//
    public LoginCrehanaPage(WebDriver driver) {
        super(driver);
    }

    //-----------------------Actions Methods-----------------------//
    public void LoginCrehanaLogo() {
        LoginCrehanaLogo.getTagName();
    }

    public void LoginCrehanaLabel() {
        LoginCrehanaLabel.getText();
    }

    public void LoginFacebookButton() {
        LoginFacebookButton.click();
    }

    public void LoginGoogleButton() {
        LoginGoogleButton.click();
    }

    public void LoginEmailTextInput(String emailText) {
        LoginEmailTextInput.sendKeys(emailText);
    }

    public void LoginPasswordTextInput(String passwordText) {
        LoginPasswordTextInput.sendKeys(passwordText);
    }

    public void LoginForgotPasswordButton() {
        LoginForgotPasswordButton.click();
    }

    public void LoginStartSessionButton() {
        LoginStartSessionButton.click();
    }

    public void LoginSignUpButton() {
        LoginSignUpButton.click();
    }

    public void LoginStartSessionOrgButton() {
        LoginStartSessionOrgButton.click();
    }
}
