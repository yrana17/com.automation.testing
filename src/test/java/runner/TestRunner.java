package runner;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestRunner {
	
	//Testing Purpose
	@SuppressWarnings("deprecation")
	@Test
	public void test()
	{
		System.out.println("Testing the Selenium Application");
		
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.setHeadless(true);
		driver = new ChromeDriver(options);
		System.out.println("Start Testing");
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println("Ending Testing");
		driver.close();
	}
	

}
