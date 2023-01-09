package stepDefinitionFiles;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageClass.LoginPageClass;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleLogin {
	WebDriver driver;
	LoginPageClass obj;
	
	@Given("^Launch the web browser$")
	public void launchthewebbrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();


	}

	@When("^Navigate to swaglabs home page$")
	public void navigatetoswaglabshomepage() {
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


	}

	@And("^Enter valid (.*) and (.*)$")
	public void entervalidusernameandpassword(String username, String password) {
		
		obj = new LoginPageClass(driver);
		obj.enterusernamepassword(username, password);


	}

	@Then("^Click login button$")
	public void clickloginbutton() {
		
		obj.clickonloginbtn();


	}

	@And("^I will verify user is navigated to swaglabs home page$")
	public void verifyuserisnavigatedtoswaglabshomepage() {
		
		obj.verifytitletxt();


	}

	@And("^Close the web browser$")
	public void closethewebbrowser() {
		
		driver.close();


	}

}
