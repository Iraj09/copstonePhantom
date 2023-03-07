package tak.capstone.project.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tak.capstone.project.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
	 
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(linkText = "TEKSCHOOL") 
	public WebElement tekschoolLogo;
	
	@FindBy(id = "searchInput")
	public WebElement searchBarInput;
	
	@FindBy(id = "searchBtn")
	public WebElement searchButton;
	
	@FindBy(xpath ="//img[contains (@alt,'Pokemon')]")
	public WebElement pokemonImage;
	
	@FindBy(id ="signinLink")
	public WebElement signInOption;
	
	@FindBy (xpath ="//a [text() ='Account']")
	public WebElement accountOption;
	
}
