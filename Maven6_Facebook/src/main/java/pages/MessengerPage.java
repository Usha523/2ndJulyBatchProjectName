package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MessengerPage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(xpath="//a[text()='Rooms']")
	private WebElement rooms;
	
	//Constructor-Initialization
		public MessengerPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Method-Actions of WebElement
		public void clickOnRoomsTab() throws InterruptedException
		{
			Thread.sleep(2000);
			rooms.click();
		}
	
	
	
	
	
	
	
	
//	
//	@FindBy(xpath= " //a[text()='Return to messenger.com'] ")
//	private WebElement reurnButton;
//	
//	@FindBy(xpath= " //a[text()='Return to messenger.com'] ")
//	private WebElement contactTohelpCenter;
//	
//	//constructor->public->WebElement->initialization
//	
//	public MessengerPage(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//		this.driver=driver;	
//		
//	}
//	
//	//Method->public Actions/uses   //ExplictWait
//	public void clickOnRuturnMessenger() throws InterruptedException
//	{
//		Thread.sleep(2000);
////		wait=new WebDriverWait(driver,500);
////		wait.until(ExpectedConditions.visibilityOf(reurnButton));
//		reurnButton.click();
//		
//	}
//	
//	public void gobackToHelpCenter() throws InterruptedException
//	{
//		Thread.sleep(2000);
////		wait=new WebDriverWait(driver,500);
////		wait.until(ExpectedConditions.visibilityOf(contactTohelpCenter));
//		contactTohelpCenter.click();
//	}
//	
//	

}
