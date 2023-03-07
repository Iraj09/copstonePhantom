package tak.capstone.project.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tak.capstone.project.base.BaseSetup;



public class RetailSignInPage extends BaseSetup {

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id ="signinLink")
	public WebElement signInOption;
	
	@FindBy(id ="email")
	public WebElement emailField;
	
	@FindBy(css = "#password")
	public WebElement passwordField;
	
	@FindBy(xpath ="//button[text()='Login']")
	public WebElement loginButton;
	
	@FindBy(id ="newAccountBtn")
	public WebElement createNewAccountButton;
	
	@FindBy(css ="#nameInput")
	public WebElement ceateNewAccountFildName;
	
	@FindBy(id ="emailInput")
	public WebElement creatNewAccountEmailField;
	
	@FindBy(xpath = "//input[@id='passwordInput']")
	public WebElement ceatNewAccountPassword;
	
	@FindBy (id ="confirmPasswordInput")
	public WebElement ConfPassField;
	
	@FindBy(xpath = "//button[text() ='Sign Up']")
	public WebElement signUpButton;	
	
}
