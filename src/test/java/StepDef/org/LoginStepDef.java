package StepDef.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import login.page.org.LoginPage;

public class LoginStepDef {

	public WebDriver driver;
	public LoginPage lPage;
		
	@Given("User launch url of Facebook Application")
	public void user_launch_url_of_Facebook_Application() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		lPage=new LoginPage(driver);	
		lPage.launchUrl();
	}

	@When("user enters the credetional of facebook application")
	public void user_enters_the_credetional_of_facebook_application() {
	    lPage.loginHomePage();
	}

	@Then("user validate the Homepage")
	public void user_validate_the_Homepage() {
	   lPage.validationHomePage();
	}
}
