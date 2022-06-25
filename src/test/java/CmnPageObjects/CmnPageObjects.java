package CmnPageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class CmnPageObjects {
	final Logger logger = LogManager.getLogger(CmnPageObjects.class);
	WebDriver driver;
	
	private By departure= By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span");
	private By deptDate= By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[6]");
	private By selectClass= By.linkText("TRAVELLERS & CLASS");
	private By adult=By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/li[2]");
	private By child= By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/div/div[1]/ul/li[2]");
	private By infant= By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/div/div[2]/ul/li[2]");
	private By selectApply= By.linkText("APPLY");
	private By clickSubmit= By.linkText("SUBMIT");
	
	Scenario scn;

	public CmnPageObjects(WebDriver driver) {
		this.driver = driver;


	}
	public void validatePageTitleMatch(String expected) {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		String url1=driver.getCurrentUrl();
		System.out.println("page url : "+url1);
		Assert.assertEquals(expected, url1);
		logger.info("Page url matched: " + expected );
	
	}
	public void validateUrl(String url) {
		String url1=driver.getCurrentUrl();
		System.out.println("page url : "+url1);
		Assert.assertEquals(url, url1);
		logger.info("Page url matched: " + url );
	}

	
	public void clickDeparture() {
		WebElement element = driver.findElement(departure);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", departure);
		//driver.findElement(departure).click();
		
	}
	public void clickDate() {
		driver.findElement(deptDate).click();
	}
	public void clickClass() {
		driver.findElement(selectClass).click();
	}
	public void selectAdult() {
		driver.findElement(adult).click();
	}
	public void selectChild() {
		driver.findElement(child).click();
	}
	public void selectInfant() {
		driver.findElement(infant).click();
	}
	
	public void clickApply() {
		driver.findElement(selectApply).click();
	}
	public void clickSubmit() {
		driver.findElement(clickSubmit).click();
	}
}
