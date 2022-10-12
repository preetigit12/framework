package webdriver_testng;

public class TC003 {
	public void tc003() {
	    //Test Steps
	 general obj = new general();
	 obj.openApplication();
	 obj.login();
	 obj.enterFrame();
	 obj.Editbtn();
	 obj.exitFrame();
	 obj.logout();
	 obj.closeApplication();
}}
