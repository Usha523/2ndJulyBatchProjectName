package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Variable ->private->WebElement->deceleration
	
	@FindBy(xpath= "//input[@id='email']")
	private WebElement username;
	
	@FindBy(xpath= "//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath= "//a[text()='Messenger']")
	private WebElement messenger;
	
	//constructor->public->WebElement->initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//method->public ->usees actions
	
	public void sendUserName()
	{
		username.sendKeys("ushakalpande");
	}
	
	public void sendPassword()
	{
		password.sendKeys("usha@123");
	}
	
	public void clickonMessenger()
	{
		messenger.click();
		
	}
	
////	public void clickonRoomTab()
////	{
////		rooms.click();
////		
//	}
//	
	
	
	

}
