package stepdefs;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import CmnPageObjects.CmnPageObjects;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webdriverfactory.WebDriverFactory;

public class StepDefs {
	private static final org.apache.logging.log4j.Logger logger =  LogManager.getLogger(StepDefs.class);

	WebDriver driver;
	String base_url = "https://www.makemytrip.com/flights/";
	int implicit_wait_timeout_in_sec = 20;
	Scenario scn; 

	CmnPageObjects cmnPageObjects;

	@Before
	public void setUp(Scenario scn) throws Exception{

		this.scn = scn; //Assign this to class variable, so that it can be used in all the step def methods

		//Get the browser name by default it is chrome
		String browserName = WebDriverFactory.getBrowserName();
		driver = WebDriverFactory.getWebDriverForBrowser(browserName);
		logger.info("Browser invoked.");

		//Init Page Object Model Objects
		cmnPageObjects = new CmnPageObjects(driver);

	}


	@After(order=1)
	public void cleanUp(){
		WebDriverFactory.quitDriver();
		scn.log("Browser Closed");
	}

	@After(order=2) // this will execute first, higher the number, sooner it executes
	public void takeScreenShot(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot scrnShot = (TakesScreenshot)driver;
			byte[] data = scrnShot.getScreenshotAs(OutputType.BYTES);
			scn.attach(data, "image/png","Failed Step Name: " + s.getName());
		}else{
			scn.log("Test case is passed, no screen shot captured");
		}
	}

	@Given("User opened browser")
	public void user_opened_browser() {
		WebDriverFactory.navigateToTheUrl(base_url);
		scn.log("Browser navigated to URL: " + base_url);

		String expected = "https://www.makemytrip.com/flights/";
		cmnPageObjects.validateUrl(expected);
	}


	@Given("User navigated to the home application url")
	public void user_navigated_to_the_home_application_url() {
		WebDriverFactory.navigateToTheUrl(base_url);
		scn.log("Browser navigated to URL: " + base_url);

		String expected = "https://www.makemytrip.com/flights/";
				
		cmnPageObjects.validateUrl(expected);
	}

	@When("user navigated to url {string}")
	public void user_navigated_to_url(String string) {
		WebDriverFactory.navigateToTheUrl(base_url);
		scn.log("Browser navigated to URL: " + base_url);

		String expected = "https://www.makemytrip.com/flights/";
				
		cmnPageObjects.validateUrl(expected);
	    
	}


	@Then("user can select the departure date")
	public void user_can_select_the_departure_date() {
		cmnPageObjects.clickDeparture();
		cmnPageObjects.clickDate();
	    
	}


	@Then("user can select the ADULTS {int}, CHILDREN  {int}, INFANTS {int}")
	public void user_can_select_the_adults_children_infants(Integer int1, Integer int2, Integer int3) {
		cmnPageObjects.clickClass();
		cmnPageObjects.selectAdult();
		cmnPageObjects.selectChild();
		cmnPageObjects.selectInfant();
		cmnPageObjects.clickApply();
	}
	

	@Then("click on search button")
	public void click_on_search_button() {
	    cmnPageObjects.clickSubmit();
	}

	
	@Then("result should be TRIP TYPE is {string}, FROM is {string}, TO {string}, DEPART at {string} & PASSENGERS & CLASS is {string}")
	public void result_should_be_trip_type_is_from_is_to_depart_at_passengers_class_is(String string, String string2, String string3, String string4, String string5) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	

}
