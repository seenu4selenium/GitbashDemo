package uneza_Assignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AssignmentAlertHandler02 {
	WebDriver driver;
	  @Test
	  public void f() throws Exception {
		  driver.get("https://quillbot.com/spell-checker");
		  Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='mce-content-body mce-edit-focus']")).sendKeys("Hi, my name is Uneza Shaikh");
		 Thread.sleep(2000);
			
		 //find the alert button
		 driver.findElement(By.xpath("(//div[@class='MuiBox-root css-0'])[3]")).click();
		 Thread.sleep(1000);
		 
		 //get the alert window
		 String Alerttext = driver.switchTo().alert().getText();
		  System.out.println("Alert text is :" +Alerttext);
		  Thread.sleep(3000);
		  
		//Alert will display, click ok button
		  driver.switchTo().alert().dismiss();
		  Thread.sleep(2000);
	  }
	  @BeforeClass
	  public void beforeClass() {
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
	  }

	  @AfterClass
	  public void afterClass() {
	  driver.quit();
  }

}
