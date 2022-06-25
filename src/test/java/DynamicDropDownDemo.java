import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownDemo {
	ChromeDriver driver;
	 @Before
	  public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	   driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//1.Launch URL
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
	 }
	 @After
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void selectdeparture() throws InterruptedException {
		//click on departure
		 driver.findElement( By.xpath("//label[@for='departure']/parent::div")).click();
		    System.out.println("done");
		    Thread.sleep(3000);
		    driver.findElement( By.xpath("//div[@class='DayPicker-Day' and "
		    		+ "contains(@aria-label,'Jun 13 2022')]")).click();
		    System.out.println("done");
		    
	  }

}
