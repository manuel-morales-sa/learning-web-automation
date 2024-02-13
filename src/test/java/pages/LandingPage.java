package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    //---------------------------Find selectors----------------------------//

    //-----------------------Header selectors-----------------------//
    @FindBy(id = "hs-link-header_logo_logo_widget")
    private WebElement landingCrehanaLogo;

    @FindBy(id = "ac-trigger-0")
    private WebElement landingSolutionsList;

    @FindBy(id = "ac-trigger-1")
    private WebElement landingCoursesList;

    @FindBy(id = "ac-trigger-2")
    private WebElement landingResourceList;

    @FindBy(xpath = "//*[@id='main-nav-list']/li[4]/a/span")
    private WebElement landingOurButton;

    @FindBy(id = "button_button_stack_1")
    private WebElement landingLoginButton;

    @FindBy(id = "button_button_stack_2")
    private WebElement landingScheduleDemoButton;

    //-----------------------Body selectors-----------------------//
    @FindBy(id = "button_widget_1685642635405")
    private WebElement landingBodyScheduleDemoButton;

    @FindBy(xpath = "//*[@id=\"hs_cos_wrapper_widget_1685642396496_\"]/div/a")
    private WebElement landingWhatIsCrehanaButton;

    //-----------------------Footer selectors-----------------------//
    @FindBy(id = "hs_cos_wrapper_module_16854750136253_")
    private WebElement landingFacebookIcon;

    @FindBy(id = "hs_cos_wrapper_module_16854750136253__2")
    private WebElement landingLinkedinIcon;

    @FindBy(id = "hs_cos_wrapper_module_16854750136253__3")
    private WebElement landingTwitterIcon;

    @FindBy(id = "hs_cos_wrapper_module_16854750136253__4")
    private WebElement landingInstagramIcon;

    @FindBy(id = "hs_cos_wrapper_module_16854750136253__5")
    private WebElement landingYouTubeIcon;

    //-----------------------Constructor-----------------------//
    public LandingPage(WebDriver driver) {
        super(driver);
    }

    //-------------------- Actions Methods-----------------------//
    //----------------------- Header -----------------------//
    public void landingCrehanaLogo() {
        landingCrehanaLogo.click();
    }

    public void landingSolutionsList() {
        landingSolutionsList.click();
    }

    public void landingCoursesList() {
        landingCoursesList.click();
    }

    public void landingResourceList() {
        landingResourceList.click();
    }

    public void landingOurButton() {
        landingOurButton.click();
    }

    public void landingLoginButton() {
        landingLoginButton.click();
    }

    public void landingScheduleDemoButton() {
        landingScheduleDemoButton.click();
    }

    //----------------------- Body -----------------------//
    public void landingBodyScheduleDemoButton() {
        landingBodyScheduleDemoButton.click();
    }

    public void landingWhatIsCrehanaButton() {
        landingWhatIsCrehanaButton.click();
    }

    //----------------------- Footer -----------------------//
    public void landingFacebookIcon() {
        landingFacebookIcon.click();
    }

    public void landingLinkedinIcon() {
        landingLinkedinIcon.click();
    }

    public void landingTwitterIcon() {
        landingTwitterIcon.click();
    }

    public void landingInstagramIcon() {
        landingInstagramIcon.click();
    }

    public void landingYouTubeIcon() {
        landingYouTubeIcon.click();
    }

}