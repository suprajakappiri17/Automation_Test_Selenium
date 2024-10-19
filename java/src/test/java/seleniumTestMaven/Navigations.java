package seleniumTestMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Navigations {
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

	@Test
	public void test3() throws InterruptedException {
		//TC - 3 navigate to Facebook URL
		driver.navigate().to("https://www.facebook.com/login.php");

		//wait for 5 sec
		Thread.sleep(5000);  
	}

	@Test
	public void test4() throws InterruptedException {
		//TC - 4 navigate back
		driver.navigate().back();

		//wait for 5 sec
		Thread.sleep(5000); 
	}
	@Test
	public void test5() throws InterruptedException {
		//TC - 5 refresh the browser window
		driver.navigate().refresh();

		//wait for 5 sec
		Thread.sleep(5000); 
	}

	@Test
	public void test6() throws InterruptedException {
		//TC - 6 navigate forward
		driver.navigate().forward();

		//wait for 5 sec
		Thread.sleep(5000); 
	}
	@Test
	public void test7() {

		//TC - 7 close the browser
		driver.close();
	}


}

