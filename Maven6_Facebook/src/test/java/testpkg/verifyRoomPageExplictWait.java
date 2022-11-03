package testpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.MessengerPage;

public class verifyRoomPageExplictWait {
	public static void main(String[]args) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium2July\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.messenger.com/rooms");
	driver.manage().window().maximize();
	
	
	
	
	//Explict Wait ==>Messanger Page
//			MessengerPage messengerPage=new MessengerPage(driver);
//			messengerPage.clickOnRuturnMessenger();
//			messengerPage.gobackToHelpCenter();
	
	
	}
	


}
