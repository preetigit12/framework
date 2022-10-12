package wd_testng_testsuite_log4j;
import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class general extends global
{
	public void openApplication() 
	{
	 driver = new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened");//console
	Reporter.log("Application opened"); //htmlReport
    Log.info("Application opened");
    
	}
	public void closeApplication() 
	{
		driver.close();
		System.out.println("Application closed");
		Log.info("Application closed");
		
	}
	public void login()
	{
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login completed");
	Log .info("login completed");
	}
	public void logout() 
	{
		driver.findElement(By.linkText(link_Logout)).click();
		System.out.println("Logout completed");
		Log.info("Logout completed");
	}
	public void enterFrame() 
	{
		driver.switchTo().frame(frm_empinfo);
		System.out.println("Entered into frame");
		Log.info("entered frame");
		}
	public void ExitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from from");
		Log.info("Exit frame");
		}
	
	public void addNewEmp() 
	{
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(FN);
		driver.findElement(By.name(txt_ELN)).sendKeys(LN);
		driver.findElement(By.id(btn_Save)).click();
		System.out.println("New Emp Added");
		Log.info("add emp");
		}
}
	