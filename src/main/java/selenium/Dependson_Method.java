package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Dependson_Method {
	WebDriver d;

	@Test (dependsOnMethods = { "OpenBrowser" })
	public void SignIn() {
		System.out.println("This will execute second (SignIn)");
		//d.findElement(By.id("a-autoid-0-announce")).click();
	}
	@Test (dependsOnMethods = { "launchurl" })
	public void SignInpage() {
		System.out.println("This will execute second (SignIn)");
		d.findElement(By.id("a-autoid-0-announce")).click();
		d.close();
	}
	
	//----------------------------
	@Test
	public void OpenBrowser() {
		System.out.println("This will execute first (Open Browser)");
		System.setProperty("webdriver.gecko.driver", "C:/Users/Nisum/Desktop/jahangir/Softwares/geckodriver.exe");
		d = new FirefoxDriver();
	}
	  @Test	
	    public void launchurl() {				
	        d.get("https://www.amazon.in");						
	    }

	@Test (dependsOnMethods = { "SignIn" })
	public void LogOut() {
		System.out.println("This will execute third (Log Out)");
	}

}
