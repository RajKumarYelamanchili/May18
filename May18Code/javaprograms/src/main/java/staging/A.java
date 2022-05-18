package staging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/link.html";					
        System.setProperty("webdriver.chrome.driver","E:\\Browsers\\Chromedriver\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);					
       // driver.findElement(By.linkText("click here")).click();	
        driver.findElement(By.partialLinkText("click")).click();
        System.out.println("title of page is: " + driver.getTitle());							
        driver.quit();		

	}

}
