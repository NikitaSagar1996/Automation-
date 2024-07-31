package GenericUtils;

import java.sql.Driver;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClassBrowser {
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
    public void beforSuite() {
    	Reporter.log("AfterTest",true);	
    }
    @BeforeClass
    public void beforeClass() {
    	Reporter.log("BeforeClass", true);
    }
    
    @AfterClass
    public void afterClass() {
    	Reporter.log("AfterClass", true);
    }
    @BeforeMethod
    public void beforeMethod() {
    	Reporter.log("BeforeMethod", true);
    	
    }
    @AfterMethod
    public void afterMethod() {
    	Reporter.log("AfterMethod", true);
    }
}


