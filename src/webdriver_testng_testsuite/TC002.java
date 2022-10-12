package webdriver_testng_testsuite;

import org.testng.annotations.Test;

public class TC002 {
	   @Test
	   public void tc001()throws Exception{
	general obj = new general();
	 obj.openApplication();
	 obj.login();
	 obj.enterFrame();
	 obj.addNewEmp();
	 obj.exitFrame();
	 obj.Logout();
	 obj.CloseApplication();
	}
}
