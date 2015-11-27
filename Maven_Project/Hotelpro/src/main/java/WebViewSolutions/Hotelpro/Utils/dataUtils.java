package WebViewSolutions.Hotelpro.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class dataUtils {
	public static HashMap hmap=new HashMap<String,String>();
	public static WebDriver driver=null;
   public String propertiesFileReading(String VariableName) throws IOException{
	   FileInputStream fis	 = new FileInputStream("");
	   Properties prop=new Properties();
	   prop.load(fis);
	   String val=prop.getProperty(VariableName);
	   return val;
	}
	
	public void excelReading(String sheetName,int rowNum) throws Exception, Exception, Exception{
		FileInputStream fis	 = new FileInputStream("");
		Workbook wBook=WorkbookFactory.create(fis);
		Sheet sheet=wBook.getSheet(sheetName);
		int lastCellNum=sheet.getRow(0).getLastCellNum();
		int lastRownum=0;
		lastRownum=rowNum+1;
		if(lastRownum>rowNum){
			
	
			for(int i=0;i<=lastCellNum-1;i++){
			String KeyVal	=sheet.getRow(0).getCell(i).getStringCellValue();
			String Value	=sheet.getRow(rowNum).getCell(i).getStringCellValue();
			
			hmap.put(KeyVal, Value);
			}
		}
		
		
	}
	
	public void excelWriting(){
		
	}
	
	public void fileUploadUsingAutoIt(){
		
	}
	
	public void takeScreenShots(){
		TakesScreenshot tss=(TakesScreenshot)driver;
		 //= tss.getScreenshotAs(OutputType.FILE);
	}
}