package tak.capstone.project.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tak.capstone.project.base.BaseSetup;

public class RetalAccountPage extends BaseSetup {
	public RetalAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath = "//img[@alt = 'profile pic']")
	public WebElement accountProfilePic;
	
	
	

}
