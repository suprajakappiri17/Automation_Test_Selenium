package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void test1() throws InterruptedException {


		System.setProperty("webdriver.edge.driver", "E:\\July 2024\\msedgedriver.exe");
		 driver=new EdgeDriver();
	}
	@Test
	public void test2() throws InterruptedException {

		//TC- 2 go to the URL
		driver.get("https://www.selenium.dev/");

		// wait for 5 sec
		Thread.sleep(5000);
	
  }
}
