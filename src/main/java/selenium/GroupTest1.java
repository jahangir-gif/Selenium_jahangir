package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;


public class GroupTest1 {
	WebDriver d;

	@Test(groups="G1")
	public void meth1()
	{
		System.out.println("Meth1 in GT1");
		System.setProperty("webdriver.gecko.driver", "C:/Users/Nisum/Desktop/jahangir/Softwares/geckodriver.exe");
		d = new FirefoxDriver();	
	}
	@Test(groups="G2")
	public void meth2()
	{
		System.out.println("Meth2 in GT2");
	}
	@Test(groups="G1")
	public void meth3()
	{
		System.out.println("Meth3 in GT3");
	}
	@Test(groups="G2")
	public void meth4()
	{
		System.out.println("Meth4 in GT4");
	}

}
