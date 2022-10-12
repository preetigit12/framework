package webdriver_testng;

import org.testng.annotations.Test;

public class TC001 
{
		@Test
		public void tc001() 
		{
			general obj = new general();
			obj.openApplication();
			obj.login();
			obj.logout();
			obj.closeApplication();
		}
		
	}

