package testNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertExampleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void initDriver(){
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void googleTitleTest(){
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//print "Title is not matched" only if assertion failed.
		//Here assertion is failed so "Title is not matched" is printed
		//Assert.assertEquals(title, "Google123","Title is not matched");
		
		Assert.assertEquals(title, "Google","Title is not matched");
		
		
	}
	@AfterMethod
	public void close(){
		
		driver.close();
	}

}
