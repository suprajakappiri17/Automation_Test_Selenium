package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {

		//TC 1 Launch the edge browser

		System.setProperty("webdriver.edge.driver", "E:\\July 2024\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();

		//TC- 2 go to the URL
		driver.get("https://www.selenium.dev/");

		//TC - 3 wait for 5 sec
		Thread.sleep(5000);

		//TC - 4 navigate to Facebook URL
		driver.navigate().to("https://www.facebook.com/login.php");

		//wait for 5 sec
		Thread.sleep(5000);  

		//TC - 5 navigate back
		driver.navigate().back();

		//wait for 5 sec
		Thread.sleep(5000); 

		//TC - 6 refresh the browser window
		driver.navigate().refresh();

		//wait for 5 sec
		Thread.sleep(5000); 

		//TC - 7 navigate forward
		driver.navigate().forward();

		//wait for 5 sec
		Thread.sleep(5000); 

		//TC - 8 close the browser
		driver.close();


	}

}
