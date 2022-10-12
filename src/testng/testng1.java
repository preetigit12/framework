package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng1 {
@BeforeMethod
			public void login(){
			System.out.println("login completed");
		}
		@AfterMethod
		public void logout(){
			System.out.println("logout completed");	
		}
		@Test(priority=2)
		public void addemp() {
		System.out.println("adding new emp");
}
@Test (priority=1)
public void delemp()
{
	System.out.println("delete new emp");
}
}