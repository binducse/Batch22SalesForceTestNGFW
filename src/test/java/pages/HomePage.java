package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

//import libraries.SeleniumWrapper;

public class HomePage extends MenuPage{ 
	
public HomePage verifyHomeElement() {
			if(driver.findElement(applauncherIcon).isDisplayed() && 
				driver.findElement(userImg).isDisplayed())
			{
					System.out.println("User landed to the home page");
				return this;
			}else {
				System.out.println("User not landed to the home page");
				return this;
			}
		}
		
		
	
}