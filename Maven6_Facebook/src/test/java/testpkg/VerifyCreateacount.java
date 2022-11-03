package testpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module.SignpopUP;
import pages.LOginPAge2;

public class VerifyCreateacount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium2July\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		LOginPAge2 lOginPAge2=new LOginPAge2(driver);
		lOginPAge2.senduserName();
		lOginPAge2.sendpassword();
		lOginPAge2.clickoncreateaccount();
		
		SignpopUP signpopUP=new SignpopUP(driver);
		Thread.sleep(2000);
		signpopUP.clickonselectday();
		Thread.sleep(2000);
		signpopUP.clickonselectmonth();
		Thread.sleep(2000);
		
		signpopUP.clickonselectyear();
		Thread.sleep(2000);

		boolean result=signpopUP.selectchecbox();
		
		System.out.println(result);
		
		
		
		
		

	}

}
