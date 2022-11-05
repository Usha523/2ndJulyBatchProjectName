package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignpopUP {
	private WebDriver driver;
	private Select se;
	
	@FindBy(xpath= "//select[@id='day']")
	private WebElement day;
	
	@FindBy(xpath= "//select[@id='month']")
	private WebElement month;
	
	@FindBy(xpath= "//select[@id='year']")
	private WebElement year;
	
	@FindBy(xpath= "(//input[@type='radio'])[1]")
	private WebElement female;
	
	
	public SignpopUP(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		se=new Select(day);	
	}
	
//	public void clickoncreateaccount()
//	{
//		createaccount.click();
//	}
	
	public void clickonselectday()
	{
		se.selectByIndex(3);
		day.click();
	}
	
	public void clickonselectmonth()
	{
		se.selectByIndex(2);
		month.click();
	}
	
	public void clickonselectyear()
	{
		se.selectByIndex(2);
		year.click();
	}
	
	public boolean selectchecbox() {
		female.click();
		boolean result=female.isSelected();
		//female.click();
		return result;
	}
	
	
	
	
}
