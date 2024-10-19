package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class NewTabWindow {

	public static void main(String[] args) throws InterruptedException {

		//TC 1 Launch the edge browser

		System.setProperty("webdriver.edge.driver", "E:\\July 2024\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();

		//TC- 2 go to the URL
		driver.get("https://www.selenium.dev/");
		
		//manage the window to maximize
		driver.manage().window().maximize();

		//TC - 3 wait for 5 sec
		Thread.sleep(5000);
		
		//TC - 4 create a new TAB
		driver.switchTo().newWindow(WindowType.TAB);
		
		Thread.sleep(5000);
		
		//TC - 5 create a new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Thread.sleep(5000);
		
		//TC- 6 close the browser
		driver.quit();

	}

}
