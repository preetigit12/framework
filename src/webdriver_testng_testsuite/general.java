package webdriver_testng_testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class general extends global1{
		public void openApplication() {
			 driver = new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened");
}
public void CloseApplication() {
	driver.close();
	System.out.println("application is closed");
}
public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("login completed");
	}
public void Logout()
{
	driver.findElement(By.linkText(link_Logout)).click();
	System.out.println("Logout completed");
	}
public void enterFrame() {
driver.switchTo().frame(frm_empinfo);
System.out.println("Entered into frame");
}
public void exitFrame() {
driver.switchTo().defaultContent();
System.out.println("exit from frame");
}
public void addNewEmp() {
	driver.findElement(By.xpath(btn_Add)).click();
	driver.findElement(By.name(txt_EFN)).sendKeys(FN);
	driver.findElement(By.name(txt_ELN)).sendKeys(LN);
	driver.findElement(By.id(btn_Save)).click();
	System.out.println("New Emp Added");
	}
	}
