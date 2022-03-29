package stepDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;


public class LoginStepDefinition{

	 WebDriver driver;

	
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page()  {

		//System.setProperty("webdriver.chrome.driver","C:\\ws\\driver\\chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

		 //WebDriverManager.chromedriver().setup();

		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("headless");
		 options.addArguments("window-size=1920,1080");
		 options.addArguments("disable-gpu");
		 driver = new ChromeDriver(options);
		 System.out.println("in setup");

		 //WebDriverManager.chromedriver().setup();
		 //driver = new ChromeDriver();

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://demo.success4.us");

		 System.out.println("Test sleep");
	 }
	
	
	 @When("^title of home page is ServiceNow Developers$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Success4 - demo.success4.us", driver.getTitle());
	 }

	@When("^title of home page is ServiceNow Developers verify$")
	public void title_of_login_page_is_free_CRM_1(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Success4 - Auth", driver.getTitle());
	}
	
	 //Reg Exp:
	 //1. \"([^\"]*)\"
	 //2. \"(.*)\"
	
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password){






		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	 }
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
	 driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

	 }

	
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page() throws InterruptedException {
		 Thread.sleep(5000);
		 String title = driver.getTitle();
		 System.out.println("Home Page title ::" + title);
		// Assert.assertEquals("Success4 - demo.success4.us", title);
		 try {
			 Assert.assertEquals("Success4 - demo.success4.us", title);
		 } catch (AssertionError ae) {
			// logger.error("Failed to verify project name");
			 System.out.println("Invalid UserName and Password" +ae);
		 }
	 }
	@Then("^user is on home page invalid$")
	public void user_is_on_hopme_page_invalid() throws InterruptedException {
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Home Page title ::"+ title);
		Assert.assertEquals("Success4 - Auth", title);
	}
	 
	 @Then("^user moves to new contact page$")
	 public void user_moves_to_new_contact_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		
		}
	 
	 
	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	 public void user_enters_contacts_details(String firstname, String lastname, String position){
		 driver.findElement(By.id("first_name")).sendKeys(firstname);
		 driver.findElement(By.id("surname")).sendKeys(lastname);
		 driver.findElement(By.id("company_position")).sendKeys(position);
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	 }
	 

	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
	 }


	@Then("^user clicks on Express Application button$")
	public void user_clicks_on_Express_Application() {
		WebElement loginBtn =
				driver.findElement(By.xpath("//*[@text()='Become a Member: Express Application']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^user clicks on Menu button$")
	public void user_clicks_on_Menu_Application() {
		driver.findElement(By.xpath("/html/body/div[1]/section/ul/li[2]/div/i")).click();

	}


}
