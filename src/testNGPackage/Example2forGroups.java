package testNGPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example2forGroups {
	
	@Test(groups = "Login")
	public void loginTest(){
		
	System.out.println("1.Login test");
	//int i=9/0;
	}
	
	@Test( groups = "Login")
	public void loginCheck(){
		
		System.out.println("2.login check");
	}
	
	@Test(groups = "Signup")
	public void signupCheck(){
		
		System.out.println("1.signup check");
	}
	@Test( groups = "Signup")
	public void signupTest(){
		
		System.out.println("2.signup check");
	}
	
	
	@Test(groups="Signup")
	public void performAfterlogin(){
		
		System.out.println("3.signup check");
	}

}
