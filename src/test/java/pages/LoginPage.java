package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import com.aventstack.extentreports.ExtentTest;

import base.BaseClass;
//import libraries.SeleniumWrapper;

public class LoginPage extends MenuPage{
	
	private By usernameTxt=By.id("username");
	private By passwordTxt=By.id("password");
	private By loginBtn=By.id("Login");
	private By remembermeChBox=By.xpath("//label[text()='Remember me']");
	private By forgotLink=By.id("forgot_password_link");
	private By loginFailureMsg = By.cssSelector("#error");
	//private WebDriver driver;
	//private SeleniumWrapper oWrap;
	
	//public LoginPage(WebDriver driver,ExtentTest node) {
		//super(driver,node);
		//this.driver = driver;
		//this.node = node;
		//oWrap = new SeleniumWrapper(driver,node);
	//}
	
public boolean verifyLoginElements() {
		
	if (driver.findElement(usernameTxt).isDisplayed() &&
			driver.findElement(passwordTxt).isDisplayed()&&
			driver.findElement(loginBtn).isDisplayed()){
			return true;
		}else {
			return false;
		}
	}
	
	public LoginPage enterUserName(String userName) {
		driver.findElement(usernameTxt).sendKeys(userName);;
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElement(passwordTxt).sendKeys(password);;
		return this;
	}
	
	public HomePage clickOnLogin() {
		driver.findElement(loginBtn).click();
		return new HomePage();
	}
	
	public LoginPage clickOnLoginWithInvalidCredential() {
		driver.findElement(loginBtn).click();
		return this;
	}
	
	public boolean validateErrorMsg() {
		if(driver.findElement(loginFailureMsg).isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}

}