package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Depends_on_classs {
	WebDriver d;

	
	 @Test(dependsOnGroups = { "Depends_on_classs.G1" })
	    public void dependsclass() throws InterruptedException {
	        System.out.println("Group Test method one");
	        System.out.println("Meth2 in GT2");
			d.get("https://www.flipkart.com");
			Thread.sleep(3000);
			d.close();
	    }
	 @Test(groups="G1")
		public void meth1()
		{
			System.out.println("Meth1 in GT1");
			System.setProperty("webdriver.gecko.driver", "C:/Users/Nisum/Desktop/jahangir/Softwares/geckodriver.exe");
			d = new FirefoxDriver();	
		}

}
