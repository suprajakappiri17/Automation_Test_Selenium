package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		//TC 1 Launch the edge browser

		System.setProperty("webdriver.edge.driver", "E:\\July 2024\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(5000);

		//TC - 2 click on create new account and  page will be displayed
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		
		
		//TC - 3 click on Male radio button
		//driver.findElement(By.id("sex")).click();
		
		By maleRB=RelativeLocator.with(By.tagName("input")).below(By.id("month"));
		driver.findElement(maleRB).click();
		
		
		//tc 4 close the browser
		driver.close();
	}

}
