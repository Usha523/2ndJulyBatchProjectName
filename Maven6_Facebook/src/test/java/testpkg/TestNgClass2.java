package testpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LOginPAge2;
import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomPage;

public class TestNgClass2 {
	private WebDriver driver;
	private LoginPage loginpage;
	private RoomPage roomPage;
	private MessengerPage messengerPage;
	
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium2July\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		loginpage=new LoginPage(driver);
//		loginpage.sendUserName();
//		loginpage.sendPassword();
		loginpage.clickonMessenger();
		messengerPage=new MessengerPage(driver);
		messengerPage.clickOnRoomsTab();
		roomPage=new RoomPage (driver);
		Thread.sleep(2000);
	}
	@Test
	public void test1() throws InterruptedException
	{	
		Thread.sleep(2000);
		roomPage.clickOnRuturnMessenger();
	}
	@Test
	public void test2() throws InterruptedException
	{
		Thread.sleep(2000);
		roomPage.gobackToHelpCenter();
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method run");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class run");
	}

}
