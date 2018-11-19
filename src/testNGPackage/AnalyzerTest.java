package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnalyzerTest {
	
	//here retry analyzer will go and check for the specified class in the
	//specified package 
	//We are failing this test case on purpose
	//Running the failed test cases again by using iRetryAnalyzer
	
	/*@Test(retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void test(){
		
		Assert.assertEquals(false, true);
	}*/
	
	@Test
	public void test(){
		
		Assert.assertEquals(false, true);
	}
	

}
