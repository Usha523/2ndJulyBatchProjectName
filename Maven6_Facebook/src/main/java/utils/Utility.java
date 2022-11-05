package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void captureScreen(int testID,WebDriver driver) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date dateRef= new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("DD-MM-YYYY  hh-mm-ss");
		String timestamp=sdf.format(dateRef);
		
		File dest= new File("D:\\ScreenshotFolderInUtilsFiles\\Test\\"+testID+sdf.format(dateRef)+".jpeg");
		FileHandler.copy(src, dest);
	}
	
	//Excel Code
	 public static String getDataFromExcelSheet(String sheet,int row,int cell ) throws EncryptedDocumentException, IOException
	  {
		File file=new File("C:\\Users\\hp\\Desktop\\Book2.xlsx");
		Cell expectedCell=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell);
		
		
		String data="";
		try
		{
			data=expectedCell.getStringCellValue();
		}
		catch(IllegalStateException ise)
		{
			double numCellValue=expectedCell.getNumericCellValue();
			data=Double.toString(numCellValue);
		}
		catch(NullPointerException npe)
		{
			npe.printStackTrace();
			npe.getMessage();
		}
		
		return data;		
	  }
}
