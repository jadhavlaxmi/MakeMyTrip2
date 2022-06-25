import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;

public class MakeMyTrip {

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
	
	@Test
	public void setDeparture()  {
//		
//	WebElement deper=driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10' and text()='DEPARTURE']"));
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(deper));
//		deper.click();
		//2ND METHOD
//		try {
//			driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10' and text()='DEPARTURE']")).click();
//		  } catch (Exception e) {
//		     JavascriptExecutor executor = (JavascriptExecutor) driver;
//		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10' and text()='DEPARTURE']")));
//		  }
		WebElement scanEle =new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable
				(By.xpath("//span[@class='lbl_input latoBold appendBottom10' and text()='DEPARTURE']")));
		Actions action =new Actions(driver);
		action.moveToElement(scanEle).click().build().perform();
		
		System.out.println("DONE");
		
//		driver.findElement(By.cssSelector(".loginModal")).click();
//		 driver.findElement(By.cssSelector(".fsw_inputBox:nth-child(4) .lbl_input")).click();
//		 driver.findElement(By.cssSelector(".DayPicker-Month:nth-child(2) .DayPicker-Week:nth-child(1) > .DayPicker-Day:nth-child(7) p:nth-child(1)")).click();
//		 driver.findElement(By.cssSelector(".DayPicker-Day--selected:nth-child(4) p:nth-child(1)")).click();
//		 driver.findElement(By.cssSelector(".flightTravllers .lbl_input")).click();
//		 driver.findElement(By.cssSelector(".appendBottom20 > .gbCounter > .selected")).click();
//		 driver.findElement(By.cssSelector(".childCounter .selected")).click();
//		 driver.findElement(By.cssSelector(".pushRight .selected")).click();
//		 driver.findElement(By.cssSelector(".btnApply")).click();
//		 driver.findElement(By.cssSelector(".primaryBtn")).click();
		
	}

	@After
	public void tearDown() {
		driver.quit();
		
	}

}


