package tak.capstone.project.steps;


import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tak.capstone.project.Pages.POMFactory;
import tak.capstone.project.utilities.CommonUtility;

public class RetailSteps extends CommonUtility {
		POMFactory factory = new POMFactory();
		
		@Given ("User is on reatil website")
		public void userIsOnRetailWebsite() {
			String actualTitle = getTitle();
			String expectedTitle = "React App";
			Assert.assertEquals(actualTitle, expectedTitle);
			Assert.assertTrue(isElementDisplayed(factory.homePage().tekschoolLogo));
			logger.info("User is on retail website");
		}	
		
		@When ("User search for {string} item") 
		public void UserSearchForItem(String value) {
			sendText(factory.homePage().searchBarInput, value);
			click(factory.homePage().searchButton);
			logger.info("User searched for " + value + "Item");
			
		}
		@Then ("Product should be displayed")
			public void productShouldBeDisplay() {
			Assert.assertTrue(isElementDisplayed(factory.homePage().pokemonImage));
			logger.info("Product is displayed");	
		}
		
		}
