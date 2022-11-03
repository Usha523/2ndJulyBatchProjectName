package testpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.MessengerPage;

public class VerifyLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium2July\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		LoginPage loginpage = new LoginPage(driver);
		loginpage.sendUserName();
		Thread.sleep(2000);
		loginpage.sendPassword();
		Thread.sleep(2000);
		loginpage.clickonMessenger();
		Thread.sleep(2000);
		//loginpage.clickonRoomTab();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		//Explict Wait ==>Messanger Page
		
		
//		MessengerPage messengerPage=new MessengerPage(driver);
//		messengerPage.clickOnRuturnMessenger();
//		Thread.sleep(2000);
//		messengerPage.gobackToHelpCenter();
	}

}
