package com.hrms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class general extends global{

	//To provide all re-usable fun: related to whole application
	    
		public void openApplication() {
	//	System.setProperty("webdriver.gecko.driver", "‪D:\\gecko\\geckodriver.exe");
		  driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");

		}
		public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		}
		public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		}
		public void logout() {
		driver.findElement(By.linkText(link_Logout)).click();
		System.out.println("Logout completed");
		

	}

}
