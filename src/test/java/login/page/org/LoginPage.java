package login.page.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	WebDriver rDriver;
	
	public LoginPage(WebDriver ldriver) {
		
		rDriver=ldriver;
		
		PageFactory.initElements(ldriver, this);
		
	}
	
	@FindBy(xpath="//input[@name='email']")
	WebElement user;
	@FindBy(xpath="//input[@name='pass']")
	WebElement pass;
	@FindBy(xpath="//button[@name='login']")
	WebElement button;
	
	
	public void launchUrl() throws Exception{

		rDriver.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	
	public void loginHomePage(){
		
		user.sendKeys("riteshkmr");
		pass.sendKeys("12345677");
		button.click();
		
	}
	
	public void validationHomePage() {
		
		String title=rDriver.getTitle();
		System.out.println(title);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
