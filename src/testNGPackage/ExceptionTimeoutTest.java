package testNGPackage;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {

	//putting the limit on the test case as 1 second
	//here it is infinite loop
	@Test(priority = 1,invocationTimeOut=1)
	public void infiniteLoopTest(){
		
		int i=1;
		while(i==1){
			System.out.println(i);
		}
		
	}
	
	//To tell the compiler that ignore this exception i mentioned here and continue executing
	@Test(priority=0,expectedExceptions = NumberFormatException.class)
	
	public void infiniteLoopTest2(){
		
		
		System.out.println("I am from test2");
		String x= "100A";
		Integer.parseInt(x);
	}
	
	
}
