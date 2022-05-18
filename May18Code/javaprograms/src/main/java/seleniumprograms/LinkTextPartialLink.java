package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPartialLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/link.html");
		Thread.sleep(2000);
	//	driver.findElement(By.linkText("click here")).click();
		driver.findElement(By.partialLinkText("here")).click();
		Thread.sleep(2000);

	}

}
