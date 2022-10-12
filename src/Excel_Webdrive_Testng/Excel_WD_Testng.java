package Excel_Webdrive_Testng;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import jxl.Workbook;

public class Excel_WD_Testng {
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
	    //Read
	FileInputStream file = new FileInputStream("‪C:\\Users\\Satya\\Desktop\\excel file.xls");
	Workbook  wb = Workbook.getWorkbook(file);
	Sheet    st = wb.getSheet(0);
	String un = st.getCell(0,1).getContents();
	String pw = st.getCell(1,1).getContents();
	Reporter.log(un);
	Reporter.log(pw);

	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Application Opened"); //console
	Reporter.log("Application opened"); //html Report
	driver.findElement(By.name("txtUserName")).sendKeys(un);
	driver.findElement(By.name("txtPassword")).sendKeys(pw);
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");
	Thread.sleep(3000);
	Reporter.log("Login completed");
	Reporter.log(driver.getTitle());
	driver.findElement(By.linkText("Logout")).click();
	Reporter.log("Logout completed");
	}
	}

