package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	//Browser Related Code
	
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromeusha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
		
	}
	public static WebDriver openFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver OpenEdgeBrowser()
	{
		System.setProperty("webdriver.edge.driver", "D:\\Selenium2July\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		return driver;
	}

	
	

}
