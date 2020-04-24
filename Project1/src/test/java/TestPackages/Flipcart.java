package TestPackages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Flipcart {
	
	public void flipkartNew()
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver",".\\DRIVERS\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("mobiles");
		List<WebElement> options=driver.findElements(By.xpath("//div[contains(@class,'row')]"));
		for(int i=0;i<options.size();i++)
		{
			WebElement row=options.get(i);
			String l=row.getText();
			System.out.println("**************************"+l);
		}driver.quit();
		
		
		
	}

}
