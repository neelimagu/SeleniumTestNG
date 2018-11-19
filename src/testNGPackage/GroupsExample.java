package testNGPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GroupsExample {
	
	@Test(priority = 0, groups = "Login")
	public void loginTest(){
		
	System.out.println("Login test");
	//int i=9/0;
	}
	
	@Test(priority = 1, groups = "Login")
	public void loginCheck(){
		
		System.out.println("login check");
	}
	
	@Test(priority = 3, groups = "Signup")
	public void signupCheck(){
		
		System.out.println("login check");
	}
	@Test(priority = 2, groups = "Signup")
	public void signupTest(){
		
		System.out.println("login check");
	}
	
	//@Optional
	//String id ="5";
	//String username="abc";
	@Test
	@Parameters({"id", "username"})
	public void takeParam(int id,String username){
		
		
		
		//System.out.println(id);
		//System.out.println(name);
		
	}

	@Test(dependsOnMethods="loginTest")
	public void performAfterlogin(){
		
		System.out.println("login check");
	}
}
