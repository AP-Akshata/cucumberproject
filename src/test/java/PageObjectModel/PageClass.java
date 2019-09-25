package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {
	WebDriver driver;
	By link=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By login=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By logout=By.linkText("Log out");
	public PageClass(WebDriver driver){
		this.driver=driver;
	}
	public void clickLink()
	{
		driver.findElement(link).click();
	}
	public void typeUname(String userName) {
		driver.findElement(uname).sendKeys("akshata@gmail.com");
	}
	public void typePwd(String password) {
		driver.findElement(pwd).sendKeys("123456");
	}
	public void login() {
		driver.findElement(login).click();
	}
	public void logout() {
		driver.findElement(logout).click();
	}

}
