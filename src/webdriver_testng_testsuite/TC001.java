package webdriver_testng_testsuite;

import org.testng.annotations.Test;

public class TC001 {
    @Test
    public void tc001()throws Exception{
    //Test Steps
    general obj = new general();
    obj.openApplication();
    obj.login();
    obj.Logout();
    obj.CloseApplication();
}
}

