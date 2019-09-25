package POMWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageClass {
	WebDriver driver;
	@FindBy(how=How.LINK_TEXT,using="Log in")WebElement link;
	@FindBy(how=How.ID,using="Email")WebElement uname;
	@FindBy(how=How.NAME,using="Password")WebElement pwd;
	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")WebElement login;
	@FindBy(how=How.LINK_TEXT,using="Log out")WebElement logout;
	public PageClass(WebDriver driver){
		this.driver=driver;
	}
	public void loginMethod(String userName,String password) {
		link.click();
		uname.sendKeys(userName);
		pwd.sendKeys(password);
		login.click();
		logout.click();
	}


}
