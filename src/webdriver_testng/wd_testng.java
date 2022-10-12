package webdriver_testng;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class wd_testng {
	WebDriver driver;
	@BeforeClass
	public void startUp() {
	//System.setProperty("webdriver.gecko.driver", "F:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
	 driver = new FirefoxDriver();
	}
	@AfterClass
	public void tearDown() {
	driver.close();    
	}
	@Test
	public void tc001() throws Exception{
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Application Opened"); //console
	Reporter.log("Application opened"); //html Report
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");
	Thread.sleep(3000);
	Reporter.log("Login completed");
	Reporter.log(driver.getTitle());
	driver.findElement(By.linkText("Logout")).click();
	Reporter.log("Logout completed");
	}
}
