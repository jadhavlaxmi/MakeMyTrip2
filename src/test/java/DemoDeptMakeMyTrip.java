

public class DemoDeptMakeMyTrip {

 public static void main(String[] args) throws InterruptedException {
  // TODO Auto-generated method stub
  
  System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  
  driver.get("https://www.makemytrip.com/");
  
  driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
  Thread.sleep(5000);
  
  String flag = "False";
 

  while(flag=="False") {
   
   if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2022')]")).size()>0) {
    
   driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2022')]")).click(); 
   flag="True";
   Thread.sleep(5000);
   }
   
   else {
    Thread.sleep(5000);
    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
   }
      
  }
  
  
  System.out.println("Test case is passed");
  
  driver.findElement(By.xpath("//span[contains(text(),'RETURN')]")).click();
  Thread.sleep(5000);
  
  String flag1 = "False";
 

  while(flag1=="False") {
   
   if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Jan 11 2023')]")).size()>0) {
    
   driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Jan 11 2023')]")).click(); 
   flag1="True";
   Thread.sleep(5000);
   }
   
   else {
    Thread.sleep(5000);
    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
   }
      
  }
  
  
  System.out.println("Test case is passed");
  driver.close();
  
    
 }

}

