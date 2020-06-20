package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks {

	static WebDriver driver;
	
@Before

public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kranthi\\workspace\\mavensat_QK_B2\\src\\test\\resources\\drivers\\chromedriver.exe");
	 
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}

/*@After
public void closeBrowse() {
	driver.close();
}*/
	

@Given("open URL")
public void open_URL() {
	driver.get("https://www.youtube.com/user/naveenanimation20");  
   
}

@When("search naveen automation labbs")
public void search_naveen_automation_labbs() {
   System.out.println("Its naveen page ");
}

@Then("Go to N Labs")
public void go_to_N_Labs() {
	driver.findElement(By.id("button")).click();
    
}

@Given("open URL some")
public void open_URL_some() {
	driver.get("https://www.youtube.com/user/pavanoltraining");
   
}

@When("search SDET")
public void search_SDET() {
	System.out.println("Its SDET page ");
	
}

@Then("Go to SDET")
public void go_to_SDET() {
	driver.findElement(By.id("button")).click();
}

@Given("open URL thing")
public void open_URL_thing() {
   
	driver.get("https://www.youtube.com/user/MrBantu50");
}

@When("search Mukesh owtwani")
public void search_Mukesh_owtwani() {
	System.out.println("Its mukesh page");
    
}

@Then("Go to Mukesh")
public void go_to_Mukesh() {
   
	driver.findElement(By.id("button")).click();
}
	
	
}
