package WebViewSolutions.Hotelpro.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;



public class systemUtils  {
	 public static WebDriver driver=null;
	
	 
	public void FirefoxProfileChange(){
	          FirefoxProfile ffprofile	=new FirefoxProfile();
	          ffprofile.setPreference("www.hotel.co.in", "www.google.com");
	          driver=new FirefoxDriver(ffprofile);
	}
    
	public static  WebDriver fn_BrowserLaunch(String BrwoserName){
    	              if(BrwoserName.equals("FF")){
    		           driver=new FirefoxDriver();
    	                          }
    	                   else if(BrwoserName.equals("CH")){
    		               System.setProperty("Webdriver.chrome.driver","Drivers/ChromeDriver.exe");
    		               driver =new ChromeDriver();
    	                   }
    	                         else if(BrwoserName.equals("IE")){
    		                   System.setProperty("Webdriver.ie.driver","Drivers/IEDriverserver.exe");
    	                 }
    	return driver;
    }
   
	/*public static home_Page openApplication(String BrowserName,String url){
    	fn_BrowserLaunch(BrowserName);
    	driver.get(url);
        home_Page hpObj	=PageFactory.initElements(systemUtils.driver,home_Page.class);
        return hpObj ;
    }*/
    public  void dBConnect(){
    	
    }
    
	
	
	public void linkCount(){
		
	}
	
	public void stringToInt(){
		
	}
	
}
