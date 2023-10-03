package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginCrehanaPage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div/div[1]/div/svg[3]")
    private WebElement loginCrehanaLogo;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div/div[2]/div/div/form/div[1]/h3")
    private WebElement loginCrehanaLabel;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div/div[2]/div/div/form/div[2]/div/button[1]/svg")
    private WebElement loginFacebookButton;

    @FindBy(id = "customGoogleButton-1")
    private WebElement loginGoogleButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/section[1]/section[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/label[1]/div[1]/div[1]/input[1]")
    private WebElement loginEmailTextInput;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/section[1]/section[1]/div[2]/div[1]/div[1]/div[2]/form[1]/label[1]/div[1]/div[1]/input[1]")
    private WebElement loginPasswordTextInput;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div/div[2]/div/div/form/a[1]")
    private WebElement loginForgotPasswordButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div/div[2]/div/div/form/button")
    private WebElement loginStartSessionButton;

    @FindBy(id = "link-light link-level2")
    private WebElement loginSignUpButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div/div[2]/div/div/form/a[3]")
    private WebElement loginStartSessionOrgButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div/div[2]/div/div/form/div[4]/span")
    private WebElement loginAlertErrorMessage;

    //-----------------------Constructor-----------------------//
    public LoginCrehanaPage(WebDriver driver) {
        super(driver);
    }

    //-----------------------Actions Methods-----------------------//
    public void loginCrehanaLogo() {
        loginCrehanaLogo.getTagName();
    }

    public void loginCrehanaLabel() {
        loginCrehanaLabel.getText();
    }

    public void loginFacebookButton() {
        loginFacebookButton.click();
    }

    public void loginGoogleButton() {
        loginGoogleButton.click();
    }

    public void loginEmailTextInput(String emailText) {
        loginEmailTextInput.sendKeys(emailText);
    }

    public void loginPasswordTextInput(String passwordText) {
        loginPasswordTextInput.sendKeys(passwordText);
    }

    public void loginForgotPasswordButton() {
        loginForgotPasswordButton.click();
    }

    public void loginStartSessionButton() {
        loginStartSessionButton.click();
    }

    public void loginSignUpButton() {
        loginSignUpButton.click();
    }

    public void loginStartSessionOrgButton() {
        loginStartSessionOrgButton.click();
    }

}