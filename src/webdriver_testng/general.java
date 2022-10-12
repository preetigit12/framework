package webdriver_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class general extends global
{

public void openApplication() 
{
//System.setProperty("webdriver.gecko.driver", "F:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
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
public void enterFrame() {
driver.switchTo().frame(frm_empinfo);
System.out.println("Entered into frame");
}
public void exitFrame() 
{
driver.switchTo().defaultContent();
System.out.println("exit from frame");
}
public void Editbtn()
{
driver.findElement(By.xpath("Edit_btn")).click();
}
public void addNewEmp() 
{
driver.findElement(By.xpath(btn_Add)).click();
driver.findElement(By.name(txt_EFN)).sendKeys(FN);
driver.findElement(By.name(txt_ELN)).sendKeys(LN);
driver.findElement(By.id(btn_Save)).click();
System.out.println("New Emp Added");
}

}
