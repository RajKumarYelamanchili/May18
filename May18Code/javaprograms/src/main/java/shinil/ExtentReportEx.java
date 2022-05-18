package shinil;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportEx {
	            ExtentReports reports;
	            ExtentSparkReporter htmlReporter;
	            ExtentTest test;
	            WebDriver driver;
	            @BeforeTest
	            public void startTest() {
	                        reports = new ExtentReports();
	                        htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//test-output//Extentreport.html");
	                        reports.attachReporter(htmlReporter);
	                        reports.setSystemInfo("Facebook", "Login");
	                        reports.setSystemInfo("Env", "QA");
	                        reports.setSystemInfo("Build", "1.0.1");
	                        reports.setSystemInfo("Browser", "Chrome");
	            }
	            @BeforeMethod
	            public void openApplication() {
	                        System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\Chromedriver\\chromedriver.exe");
	                        driver = new ChromeDriver();
	                        driver.manage().window().maximize();
	                        driver.get("https://www.facebook.com");
	            }
	            @Test
	            public void TC_01_verifyTittleTest() {
	                        test = reports.createTest("verifyTittleTest");
	                        String expetedTitle = "Facebook – log in or sign up";
	                        String pageTitle = driver.getTitle();
	                        Assert.assertEquals(pageTitle, expetedTitle);
	            }
	            
	            @Test
	 		   public void TC_02_testcase(){
	 		      //boolean b =false;
	 			   int i = 5;
	 		      System.out.println("Test Case2 - Conditional Skip");
	 		      if(i< 7)
	 		      throw new SkipException("Skipping this exception");
	 		      System.out.println("Executed Successfully");
	 		   }
	            @Test
	            public void TC_03_verifyTittleTest() {
	                        
	                        Assert.assertTrue(false);
	            }
	            @Test
	            public void TC_04_verifyTittleTest() {
	            	 Assert.assertTrue(true);
	            }
	            @Test
	            public void TC_05_verifyTittleTest() {
	            	 Assert.assertTrue(false);
	            }
	            @AfterMethod
	            public void setTestResult(ITestResult result) throws IOException {
	                        //String screenShot = CaptureScreenShot.captureScreen(driver);
	                        if (result.getStatus() == ITestResult.FAILURE) {
	                                    test.log(Status.FAIL, result.getName());
	                                    test.log(Status.FAIL,result.getThrowable());
	                        //          test.fail("Screen Shot : " + test.addScreenCaptureFromPath(screenShot));
	                        } else if (result.getStatus() == ITestResult.SUCCESS) {
	                                    test.log(Status.PASS, result.getName());
	                                    //test.pass("Screen Shot : " + test.addScreenCaptureFromPath(screenShot));
	                        } else if (result.getStatus() == ITestResult.SKIP) {
	                                    test.skip("Test Case : " + result.getName() + " has been skipped");
	                        }
	                        reports.flush();
	                        driver.close();
	            }
	            @AfterTest
	            public void endTest() {
	                       
	                        reports.flush();
	            }
	}

