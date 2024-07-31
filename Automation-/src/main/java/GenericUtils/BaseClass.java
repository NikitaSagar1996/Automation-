package GenericUtils;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ElementRepository.BasePage;
import ElementRepository.LoginPage;

public class BaseClass implements IAutoConstant, ITestListener {
	
	public static WebDriver driver;
	public FileLibrary flib;
	public BasePage bp;
	public LoginPage lp;
	
	// FileLibrary flib =new FileLibrary();
	// {
	//	System.out.println(driver); 
	// }
	 //LoginPage lp = new LoginPage(driver);
	 
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("BeforeSuite",true);
}
    @BeforeTest
    public void beforeTest() {
    	Reporter.log("BeforeTest",true);
    }
    @AfterSuite
    public void afterSuite() {
    	Reporter.log("AfterSuite",true);
}
    @AfterTest
    public void afterTest() {
    	Reporter.log("AfterTest",true);	
    }
    
    @Parameters("bname")
    @BeforeClass
    public void launchingBrowser(@Optional("chrome") String browserName) {
    	//WebDriver driver = null;
    	Reporter.log("BeforeClass", true);
    	
    	if(browserName.equalsIgnoreCase("chrome"))
    		driver = new ChromeDriver();
    	
    	else if(browserName.equalsIgnoreCase("edge"))
    	   driver = new EdgeDriver();
    	
    	else if(browserName.equalsIgnoreCase("firefox"))
    		driver = new FirefoxDriver();
    	
    	bp = new BasePage(driver);
    	lp = new LoginPage(driver);	
    	flib = new FileLibrary();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitTimeout));
    	
    }
    
    @AfterClass
    public void tearDownBrowser() {
    	Reporter.log("AfterClass", true);
    	driver.close();
    	driver.quit();
    }
    
    @BeforeMethod
    public void navigateAndLoginToDWS() {
    	Reporter.log("BeforeMethod", true);
    	driver.get(flib.fetchDataFromPropertis(propertyFilePath, "url"));
    	lp.getLoginLink().click();
    	lp.getEmailTexBox().sendKeys(flib.fetchDataFromPropertis(propertyFilePath, "username"));
    	lp.getPasswordTextBox().sendKeys(flib.fetchDataFromPropertis(propertyFilePath, "password"));
    	lp.getLoginButton().click();
    }
    
    @AfterMethod
    public void afterMethod() {
    	Reporter.log("AfterMethod", true);
    }
    
    	@Override
    	public void onTestStart(ITestResult result) {
    	Reporter.log("[Testcase --"+result.getName()+"--is started");	
    }
    	@Override
    	public void onTestSuccess(ITestResult result) {
    		Reporter.log("[Testcase --"+result.getName()+"--is passed");
    		
    	}
    	@Override
    	public void onTestFailure(ITestResult result) {
    		Reporter.log("[ Testcase --"+result.getName()+"--is failed");
    		 LocalDateTime idt = LocalDateTime.now();
			String time = idt.toString().replace(":","-");
    		TakesScreenshot ts = (TakesScreenshot) driver;
    		File src = ts.getScreenshotAs(OutputType.FILE);
    		File dest = new File(screenshotpath+"screenshot.png");
    		try {
    		FileHandler.copy(src, dest);
    		} catch (Exception e) {
				
			}
    		
    	}
    	@Override
    	public void onTestSkipped(ITestResult result) {
    		Reporter.log("[ Testcase --"+result.getName()+"--is skipped");	
    }
		@Override
		public void onStart(ITestContext context) {
			Reporter.log("[ <test> --"+context.getName()+"--is started");
		}
		@Override
		public void onFinish(ITestContext context) {
			Reporter.log("[ <test> --"+context.getName()+"--is finished");
		}
    	
 }
    



