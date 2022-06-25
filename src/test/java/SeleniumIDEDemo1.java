
// Generated by Selenium IDE

import org.junit.Test;

import org.junit.Before;

import org.junit.After;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Alert;

import org.openqa.selenium.Keys;

import java.util.*;

import java.net.MalformedURLException;

public class SeleniumIDEDemo1 {
	 private WebDriver driver;
	 
	 private Map<String, Object> vars;
	  
	JavascriptExecutor js;
	 
	 @Before
	  public void setUp() {
	   
	 driver = new ChromeDriver();
	   
	 js = (JavascriptExecutor) driver;
	   
	 vars = new HashMap<String, Object>();
	 
	 }

	  @After
	  public void tearDown() {
	 
	   driver.quit();
	 
	 }
	  @Test
	  public void sELLECTDATE() {
	 
	   driver.get("https://www.makemytrip.com/flights/");
	   
	 driver.manage().window().maximize();
	   
	 driver.findElement(By.cssSelector(".fsw_inputBox:nth-child(4) .lbl_input")).click();
	  
	  driver.findElement(By.cssSelector(".DayPicker-Day--start > .dateInnerCell")).click();
	    
	driver.findElement(By.cssSelector(".flightTravllers .lbl_input")).click();
	   
	 driver.findElement(By.cssSelector(".appendBottom20 > .gbCounter > .selected")).click();
	  
	  driver.findElement(By.cssSelector(".childCounter .selected")).click();
	  
	  driver.findElement(By.cssSelector(".pushRight .selected")).click();
	   
	 driver.findElement(By.cssSelector(".btnApply")).click();
	  
	  driver.findElement(By.cssSelector(".primaryBtn")).click();
	  
	}


}