package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	  @Test
	  public void test1() throws InterruptedException {


			System.setProperty("webdriver.edge.driver", "E:\\July 2024\\msedgedriver.exe");
			 driver=new EdgeDriver();
		}
	  
		
}