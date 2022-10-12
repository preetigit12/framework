package wd_testng_testsuite_log4j;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class TC001 
{
    @Test
    public void tc001() 
  {
        DOMConfigurator.configure("log4j.xml");	
	general obj = new general();
	obj.openApplication();
obj.closeApplication();
}}