package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	
	//Variable ->private->WebElement->deceleration
	
	@FindBy(xpath= "//input[@id='email']")
	private WebElement username;
	
	@FindBy(xpath= "//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath= "//a[text()='Messenger']")
	private WebElement messenger;
//	@FindBy(xpath= "//input[@id='email']")
//	private WebElement username;
//	
//	@FindBy(xpath= "//input[@id='pass']")
//	private WebElement password;
//	
//	@FindBy(xpath= "//a[text()='Messenger']")
//	private WebElement messenger;
//	
	//constructor->public->WebElement->initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	//method->public ->usees actions
	public void sendUserNme(String name)
	{
		username.sendKeys(name);
	}
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}

	public void clickonMessenger() {
		// TODO Auto-generated method stub
		messenger.click();
	}


	
	

}
