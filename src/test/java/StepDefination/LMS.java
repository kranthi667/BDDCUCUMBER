/*package StepDefination;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LMS {
	
	WebDriver driver;
	
	@Given("Open LMS URL")
	public void open_LMS_URL() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kranthi\\workspace\\mavensat_QK_B2\\src\\test\\resources\\drivers\\chromedriver.exe");
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://lms.iciciprulife.com/SIT/home.htm?execution=e1s1");  
		
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[1]/a[1]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		 WebElement signin = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[1]/a[1]"))));		 
		 signin.click();
	    
	}

	@When("Enter username and password")
	public void enter_username_and_password(DataTable credentials) {
		for(Map<Object, Object> login : credentials.asMaps(String.class,String.class)) {
			driver.findElement(By.id("firstname")).sendKeys((CharSequence[]) login.get("Username"));
			driver.findElement(By.id("lastname")).sendKeys((CharSequence[]) login.get("Password"));
			
			driver.findElement(By.id("loginBtn")).click();
			
		}
	}

	@Then("click on contact page")
	public void click_on_contact_page() {
	    
	}

	@Then("create {int} contacts")
	public void create_contacts(Integer int1) {
	    
	}


}
*/