/*package StepDefination;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;




public class Tags {
	static WebDriver driver;	


@Given("Open URL and click on sign in")
public void Open_URL_and_click_on_sign_in() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kranthi\\workspace\\mavensat_QK_B2\\src\\test\\resources\\drivers\\chromedriver.exe");
	 
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://lms.iciciprulife.com/SIT/home.htm?execution=e1s1");  
	
	try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[1]/a[1]")).click();
	
	//WebDriverWait wait = new WebDriverWait(driver, 60);
	
	 WebElement signin = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[1]/a[1]"))));		 
	 signin.click();
   
}

@Given("Enter username and password")
public void Enter_username_and_password() {
	
	try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.id("firstname")).sendKeys("569730");
	driver.findElement(By.id("lastname")).sendKeys("Ipru@123");
	
	driver.findElement(By.id("loginBtn")).click();
	
}



@Given("click on contact tab")
public void click_on_contact_tab() {
    
}

@When("create new contact")
public void create_new_contact() {
  
}

@Given("click on investment details")
public void click_on_investment_details() {
    
}

@Given("click on term pasa")
public void click_on_term_pasa() {
    
}

@Given("mark attendance")
public void mark_attendance() {
   
}

@Given("click appointment tab")
public void click_appointment_tab() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



}
*/