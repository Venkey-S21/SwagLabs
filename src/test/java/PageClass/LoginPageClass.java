package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageClass {
	WebDriver driver;
	
	By username_txt = By.id("user-name");
	By password_txt = By.id("password");
	By login_btn = By.id("login-button");
	By title_txt = By.xpath("//span[text()='Products']");
	
	public LoginPageClass(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterusernamepassword(String username, String password) {
		
		WebElement usernametxt = driver.findElement(username_txt);
		usernametxt.sendKeys(username);
		
		WebElement passwordtxt = driver.findElement(password_txt);
		passwordtxt.sendKeys(password);
	}
	
	public void clickonloginbtn() {
		
		WebElement loginbtn = driver.findElement(login_btn);
		loginbtn.click();
	}
	
	public void verifytitletxt() {
		
		WebElement titletxt = driver.findElement(title_txt);
		titletxt.isEnabled();
	}



}
