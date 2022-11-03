package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOginPAge2 {
	
	@FindBy(xpath= "//input[@id='email']")
	private WebElement username;
	
	@FindBy(xpath= "//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath ="//a[text()='Create New Account']")
	private WebElement createaccount;
	
	
	public LOginPAge2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void senduserName()
	{
		username.click();
		
	}
	public void sendpassword()
	{
		password.click();
		
	}
	public void clickoncreateaccount()
	{
		createaccount.click();
		
	}
	

}
