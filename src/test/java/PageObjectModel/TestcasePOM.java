package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcasePOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		PageClass PObject=new PageClass(driver);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		PObject.clickLink();
		String username=null;
		PObject.typeUname(username);
		String pass=null;
		PObject.typePwd(pass);
		PObject.login();
		PObject.logout();
		System.out.println("Title of the Page is :"+driver.getTitle());
	}

}
