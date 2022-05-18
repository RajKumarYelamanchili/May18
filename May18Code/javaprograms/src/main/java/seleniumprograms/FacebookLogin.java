package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	Dimension n = new Dimension(360, 592);  
	driver.manage().window().setSize(n);
	/*driver.get("http://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("viratkohli");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("password@123");
	
	Thread.sleep(2000);*/
	

	
	
	
	
	
	
	
	
	
	
	
	}

}
