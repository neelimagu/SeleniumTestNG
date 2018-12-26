package FoxPractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckTitleAndLogo {

	WebDriver driver = new ChromeDriver();
	
	
	@BeforeMethod
	public void init(){
		
		driver.get("https://fox.com");	
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void titleTest(){
		driver.getTitle();
		
	 Assert.assertEquals(driver.getTitle(),"FOX Broadcasting Company | Full Episodes, Shows, Schedule");	
		
	}
	
	@Test
	public void logoTest(){
	
	WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div/div/div[1]/div[1]/div/a/img"));
	
			boolean b = element.isDisplayed();
			if(b==true){
				
				System.out.println("Element is present");
			}
			else
				System.out.println("Element is not visible");
	}
	
	@Test
	public void clickFooter(){
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]"));
		
		List<WebElement> e1 = element.findElements(By.tagName("div"));
		System.out.println("The number of links in footer are: "+e1.size());
		
		for(int i=0;i<e1.size();i++){
			
			System.out.println(e1.get(i).getText());
		}
			
	}
	@Test
	public void executeJavascript(){
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//jse.executeScript(scroll(0,1000));
	
	}
	
}
