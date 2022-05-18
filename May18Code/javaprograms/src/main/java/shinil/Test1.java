package shinil;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// sir said will see to it
public class Test1 
{

	public static void main(String[] args) throws InterruptedException
	{
				System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\chromedriver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://jqueryui.com/selectable/");
				WebElement frame1=driver.findElement(By.xpath("//iframe[@src='/resources/demos/selectable/default.html']"));
				driver.switchTo().frame(frame1);
			WebElement item =driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][1]"));
				item.click();
				 item.sendKeys(Keys.CONTROL);
				driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][2]")).click();
			
			}
	}


