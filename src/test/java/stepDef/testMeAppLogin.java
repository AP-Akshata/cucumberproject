package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testMeAppLogin {
	WebDriver driver=null;
	@Given("^the login page is opened$")
	public void the_login_page_is_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	    
	}

	@When("^user enters lalitha as username$")
	public void user_enters_lalitha_as_username() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
	    
	}

	@When("^user enters password(\\d+) as password$")
	public void user_enters_password_as_password(int arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys("password123");
	    
	}

	@Then("^user will Finds a testmeapp homepage$")
	public void user_will_Finds_a_testmeapp_homepage() throws Throwable {
		driver.findElement(By.name("Login")).click();
		System.out.println("Title of the page is:"+driver.getTitle());
	}

}
