package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class para_demo {
	WebDriver driver=null;
	@Given("^User opens the apllication$")
	public void user_opens_the_apllication() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		
	   
	}

	@When("^User click on signin link$")
	public void user_click_on_signin_link() throws Throwable {
		driver.findElement(By.linkText("SignIn")).click();
	   
	}

	@When("^User enters  \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
	    
	}

	@Then("^Message displayed Login Succesfully$")
	public void message_displayed_Login_Succesfully() throws Throwable {
		driver.close();
		System.out.println("Login succesfully");
	   
	}

}
