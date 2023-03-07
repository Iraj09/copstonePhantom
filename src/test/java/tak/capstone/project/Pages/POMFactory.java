package tak.capstone.project.Pages;

import tak.capstone.project.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	private RetalAccountPage accountPage;
	
	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.signInPage = new RetailSignInPage();
		this.accountPage = new RetalAccountPage();
		
	}
	public RetailHomePage homePage() {
		return this.homePage;
	}
	public RetailSignInPage signInPage() {
		return this.signInPage;
	}
	public RetalAccountPage accountPage() {
		return this.accountPage;
	}
	
}
