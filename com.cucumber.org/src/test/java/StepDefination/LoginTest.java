package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	
	WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page()  {
		
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		
		 driver = new FirefoxDriver();
		
		driver.get("http://sbu/V67_AJM/login");
		
		driver.manage().window().maximize();
	  
	}

	@When("^Enter username and password$")
	public void enter_username_and_password()  {
		driver.findElement(By.name("Username")).sendKeys("ajitm@sankalpcs.com");
		driver.findElement(By.name("password")).sendKeys("123456");
	
	}

	@When("^Click on login button$")
	public void click_on_login_button()  {
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	}

	@Then("^login should be done successful$")
	public void login_should_be_done_successful() throws InterruptedException {
		Thread.sleep(3000);
		String str=driver.findElement(By.id("Administartor")).getText();
		Assert.assertEquals("Administration",str);
	}

	@Given("^user is on Home page$")
	public void user_is_on_Home_page()  {
		
		driver.findElement(By.id("Administartor")).click();;
	}

	@When("^click on sign up link$")
	public void click_on_sign_up_link()  {
	  
		driver.findElement(By.id("Administartor")).click();;
	}

	@Then("^display registration page$")
	public void display_registration_page()  {
		driver.findElement(By.id("Administartor")).click();;
	}




	


}
