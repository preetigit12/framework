package com.hrms.testscript;

import com.hrms.general;

public class Tc_001 {
	public static void main(String[] args) {
		
		general obj = new general();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
}
}