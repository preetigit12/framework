package webdriver_testng;

public class TC002 {
	public void tc002() {
	    //Test Steps
	 general obj = new general();
	 obj.openApplication();
	 obj.login();
	 obj.enterFrame();
	 obj.addNewEmp();
	 obj.exitFrame();
	 obj.logout();
	 obj.closeApplication();

}}
