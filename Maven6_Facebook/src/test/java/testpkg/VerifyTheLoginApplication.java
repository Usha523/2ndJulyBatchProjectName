package testpkg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomPage;
import setup.Base;
import utils.Utility;

public class VerifyTheLoginApplication extends Base {
	private WebDriver driver;
	private LoginPage loginPage;
	private MessengerPage messengerPage;
	private RoomPage roomPage;
	private SoftAssert soft;
	private int testID;
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			driver=openChromeBrowser();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		
	}
	
	@BeforeClass
	public void createpomClassObjects() throws EncryptedDocumentException, IOException
	{
		System.out.println("before classs");
		loginPage = new LoginPage(driver);
		
		String data=Utility.getDataFromExcelSheet("Sheet3", 1, 0);
		loginPage.sendUserNme(data);
		
		data=Utility.getDataFromExcelSheet("Sheet3", 1, 1);
		loginPage.sendPassword(data);
		
		messengerPage = new MessengerPage(driver);
		roomPage = new RoomPage(driver);
		
	}
	
	@BeforeMethod
	public void roomPageOpen() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		
		loginPage.clickonMessenger();
		messengerPage.clickOnRoomsTab();
		soft=new SoftAssert();
		
	}

	
	@Test
	public void verifyReturnTomessgengerPage() throws InterruptedException
	{
		testID=2345;
		System.out.println("test1");
		roomPage.clickOnRuturnMessenger();
		// Actual Result
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		//AssertMethods
		
		soft.assertEquals(url, "https://www.messenger.com/");
		soft.assertEquals(title, "Messenger");
		soft.assertAll();
		
	}
	@Test
	public void verifycontactToHelpCenter() throws InterruptedException
	{
		testID=2929;
		System.out.println("test2");
		roomPage.gobackToHelpCenter();

		//if else cha jagi aplyla assertion vaprav lagte
		//Actual Result
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		
		
		soft.assertEquals(url, "https://www.messenger.com/help");
		soft.assertEquals(title, "Messenger Help Centre");
		soft.assertAll();
	}
	@AfterMethod
	public void logoutFromApplication(ITestResult result) throws IOException
	{
		System.out.println("After Method");
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreen(testID, driver);
		}
		
		
	}
	@AfterClass
	public void clearObject()
	{
		loginPage = null;
		messengerPage =null;
		roomPage = null;
	}
//	@AfterTest
//	public void closeBrowser()
//	{
//		driver.close();	
//		driver=null;
//		//To remove delete all object without referance 
//		System.gc();     //grabage collector
//	}
	
}
