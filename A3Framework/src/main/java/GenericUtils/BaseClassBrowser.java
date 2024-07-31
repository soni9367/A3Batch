package GenericUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

import elementRepository.BasePage;
import elementRepository.LoginPage;

public class BaseClassBrowser implements IAutoConstants, ITestListener{
	
	public static WebDriver driver;
	public FileLibrary flib;
	public BasePage bp;
	public LoginPage lp;
	
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Before Suite", true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test", true);
	}
	@AfterSuite
	public void afterSuit() {
		Reporter.log("After Suite", true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("After Test", true);
	}
    
	
	@BeforeClass
	public void launchingBrowser(@Optional("chrome")String browserName) {
		Reporter.log("Before class", true);
    if (browserName.equalsIgnoreCase("chrome"))
        driver= new ChromeDriver();
    else if (browserName.equalsIgnoreCase("edge"))
        driver  = new ChromeDriver();
    else if (browserName.equalsIgnoreCase("firefox"))
         driver = new ChromeDriver();
     lp=new LoginPage(driver);
     flib=new FileLibrary();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(imlicitTimeOut));

	}
	@AfterClass
	public void tearDownBrowser() {
		Reporter.log("After Class", true);
		driver.close();
		driver.quit();
	}
	@BeforeMethod() 
		public void navigateAndLoginToDWS() {
		Reporter.log("Before Method", true);
		driver.get(flib.fetchDataFromProperties(propertyFilePath,"url"));
		lp.getLoginLink().click();
		lp.getEmailTextBox().sendKeys(flib.fetchDataFromProperties(propertyFilePath, "email"));
		lp.getPaswordTextBox().sendKeys(flib.fetchDataFromProperties(propertyFilePath, "password"));
		lp.getLoginButton().click();
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("After method", true);
		lp.getLogoutButton().click();
	}
@Override
public void onTestStart(ITestResult result) {
	Reporter.log("[ TestCase--"+result.getName()+"-- is started");
	
}
@Override
public void onTestSuccess(ITestResult result) {
	Reporter.log("[ TestCase--"+result.getName()+"-- is passed");
	
}
@Override
public void onTestFailure(ITestResult result) {
	Reporter.log("[ TestCase--"+result.getName()+"-- is failed");
	LocalDateTime dt= LocalDateTime.now();
	String time = dt.toString().replace(":", "-");
	TakesScreenshot ts =(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File desc =new File(screenshotpath+"screenshot"+time+".png");
	try {
		FileHandler.copy(src, desc);
	} catch (Exception e) {
	
		e.printStackTrace();
	}
}
@Override
public void onTestSkipped(ITestResult result) {
	Reporter.log("[ TestCase--"+result.getName()+"-- is skipped");
	
}
@Override
public void onStart(ITestContext context) {
	Reporter.log("[ <Test>--"+context.getName()+"-- is skipped");
	
}
@Override
public void onFinish(ITestContext context) {
	Reporter.log("[ <Test>--"+context.getName()+"-- is skipped");
	
}
}

	
