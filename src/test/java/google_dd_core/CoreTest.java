package google_dd_core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Util.ExcelReader;
import Util.TestConfig;
import Util.monitoringMail;
import Util.testUtil;

public class CoreTest {

	public static Properties config = new Properties();
	public static Properties object = new Properties();
	public static ExcelReader excel = null;
	public static WebDriver driver = null;
	public static FileInputStream fis;
	// public static Logger app_logs=Logger.getLogger("devpinoyLogger");
	public static Logger app_logs = Logger.getLogger("devpinoyLogger");

@BeforeSuite
	
 public void init() throws IOException
 {
  if (driver==null){
   fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\google_dd_properties\\config.Properties");
   config.load(fis);
   
   app_logs.debug("Loading config property file");
   
   fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\google_dd_properties\\object.Properties");
   object.load(fis);
   app_logs.debug("Loading object property file");
   
   excel =new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\java\\google_dd_properties\\testData.xlsx");
   app_logs.debug("Loading Excel file");
   
   if(config.getProperty("browser").equals("chrome"))
   {
	  System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	  //System.setProperty("webdriver.chrome.silentOutput", "true");
	   
	//Creating an instance of chrome level class to disable browser level notifications.   
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    
    System.setProperty("webdriver.chrome.driver", "D:\\EduSol\\Selenium Jar Files\\Selenium Webdrivers\\Chrome_Dwoaload\\chromedriver.exe");
	driver=new ChromeDriver(options);
	  
	  
	 
    }
   else if (config.getProperty("browser").equals("firefox"))
   {
	   System.setProperty("webdriver.gecko.driver","D:\\EduSol\\Selenium Jar Files\\Selenium Webdrivers\\geckodriver.exe");
	    driver = new FirefoxDriver();
	
   }
   else if (config.getProperty("browser").equals("ie"))
   {
     System.setProperty("webdriver.ie.driver","C:\\Java standard files\\latest selenium jar\\ChromeWebDrivers\\IEDriver.exe");
     driver = new InternetExplorerDriver();
   }
   
      app_logs.debug("Launching browser");
       driver.get(config.getProperty("testsite"));
      // driver.get(config.getProperty("testsite2"));
  
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(120L, TimeUnit.SECONDS);
   
      }
 }
	
	
	
	

	//sending mail from another person
	@AfterSuite
	 public void QuitDriver() throws MessagingException {
	  
	 // if (driver!=null)
		app_logs.debug("Sending Mail");
		
		  testUtil.zip(System.getProperty("user.dir")+"\\screenshot");
		  monitoringMail mail = new monitoringMail();
		  try{
			  mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
				
			} catch(AddressException e){
				// TODO Auto-generated catch block
				 e.printStackTrace();
			 }
		  System.out.println("Sending Mail Successfully.......");
	      driver.close();
	}
	}