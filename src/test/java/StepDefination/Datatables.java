/*package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datatables {
	WebDriver driver;	

	@Given("user is already on login page")
	public void user_is_already_on_login_page() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kranthi\\workspace\\mavensat_QK_B2\\src\\test\\resources\\drivers\\chromedriver.exe");
	 
		driver = new ChromeDriver();

		driver.get("https://mypayroll.paysquare.com/");    
	}
	@When("title of Login page is free crm")
	public void title_of_Login_page_is_free_crm() {
		driver.manage().window().maximize();
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);   
	}

	@Then("user enter username and password")
	public void user_enter_username_and_password(DataTable credentails) {
		List<List<String>> data = credentails.cells();
		
		driver.findElement(By.id("ctl03_txtuser")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("ctl03_txtpassword")).sendKeys(data.get(0).get(0));
		
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("ctl03_btnLogin")).click();
	   
	}

}
*/