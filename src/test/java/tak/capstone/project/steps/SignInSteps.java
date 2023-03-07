package tak.capstone.project.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tak.capstone.project.Pages.POMFactory;
import tak.capstone.project.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	
		@When("User click on sign in option")
			public void serClickOnSignInOption() {
			click (factory.homePage().signInOption);
			logger.info("user clicked on sign on option");
			
		}
		@And("User enter email {string} and password {string}") 
		public void userEnerEmailAndPassword(String emailValue, String passValue) {	
			sendText (factory.signInPage().emailField, emailValue);
			sendText (factory.signInPage().passwordField, passValue);
			logger.info("user enter email and password");
			}
		
		@And ("User click on login button")
		public void userClikOnLoginButton () {	
			click(factory.signInPage().loginButton);
			logger.info("user clicked on login button");
		}
		@Then ("User should be logged in into Account")
		public void userShouldbeLoggedInIntoAccount() {
		    Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		    logger.info("user is logged into account page");
		}
		
		@When("User click on create new account button")
		public void userClickOnCreateNewAccountButton() {
		   click(factory.signInPage().createNewAccountButton);
		   logger.info("user clicked on Create New Accoun button");
		}
		@When("User fill the Sighup information with below data")
		public void userFillTheSighupInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {
		  List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		  sendText(factory.signInPage().ceateNewAccountFildName,data.get(0).get("name"));
		  sendText(factory.signInPage().creatNewAccountEmailField,data.get(0).get("email"));
		  sendText(factory.signInPage().ceatNewAccountPassword,data.get(0).get("password"));
		  sendText(factory.signInPage().ConfPassField,data.get(0).get("confirmPassword"));
		  logger.info("user filled the signUp information");

		}
		@When("User click on signup button")
		public void userClickOnSignupButton() {
		click(factory.signInPage().signUpButton);
		logger.info("user clicked on signup button");
		
		}
		@Then("User should be logged into account page")
		public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().accountProfilePic));
		logger.info("user is logged into account page");
	
		}
	}	
	
