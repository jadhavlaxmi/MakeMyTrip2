

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;

public class MakemyTripDemo {

WebDriver driver=new ChromeDriver();
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//1.Launch URL
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	}
	@After
	public void tearDown() {
		driver.quit();
		
	}
	
	@Test
	public void setDeparture() throws InterruptedException  {
		WebElement departure=driver.findElement(By.xpath("//*[text()='DEPARTURE']"));
		Thread.sleep(3000);
		 WebDriverWait wait = new WebDriverWait(driver, 10);       
	       wait.until(ExpectedConditions.visibilityOf(departure));
//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].click();", departure);
//		 System.out.println("done");
		
	}
}
