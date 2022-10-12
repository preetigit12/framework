package wd_testng_testsuite_log4j;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class TC002 {
	@Test
	public  void tc002() 
	{
	DOMConfigurator.configure("log4j.xml");	
	
	   general obj = new general();
	    obj.openApplication();
	    obj.login();
	    obj.enterFrame();
	    obj.addNewEmp();
	   obj.ExitFrame();
	    obj.logout();
	    obj.closeApplication();
	    
	    
	}

}
