package WebViewSolutions.Hotelpro.Utils;

import java.util.HashMap;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class genericUtils {
	
	public static WebDriver driver=null;
	
	
	
	
	public  void fn_click(WebElement we){
		  if(we.isDisplayed()==true){
			if(we.isEnabled()==true){
				we.click();
			}
		}else{
			System.out.println("WebElement is not Displayed");
		}
	 }
	
	public  void mouseHoverOnWebElementActions(WebElement we){
		Actions  actObj=new Actions(driver);
		actObj.moveToElement(we).build().perform();
	}
	
	public void dragAndDropActions(WebElement src,WebElement dest){
		Actions  actObj=new Actions(driver);
		actObj.dragAndDrop(src, dest).build().perform();
	}
	
	public void explicitwaitBy_Visibilty(WebElement we,int timeVal){
	    WebDriverWait wait	=new WebDriverWait(driver,timeVal);
	   wait.until(ExpectedConditions.visibilityOf(we));
	}
	public void explicitwaitBy_Clickable(WebElement we,int timeVal){
	    WebDriverWait wait	=new WebDriverWait(driver,timeVal);
	   wait.until(ExpectedConditions.elementToBeClickable(we));
	    
	  }

	public void fn_Input(WebElement we,String value){
		
		if(we.isDisplayed()==true){
			if(we.isEnabled()==true){
				we.sendKeys(value);
			}
		}else{
			System.out.println("WebElement is not Displayed");
		}
		
	}
	 public void Verify_TextValue(WebElement we,String validationName){
		
	}
	public void checkBoxClick(){
		
	}
	
	public void mouseHoverOnWebElementJavaScript(){}
	
	public void dragAndDropActionsJavaScript(){}
	
	public void stringToInt(){}
	
	public void pageRefresh(){
		driver.navigate().refresh();
		}
}
