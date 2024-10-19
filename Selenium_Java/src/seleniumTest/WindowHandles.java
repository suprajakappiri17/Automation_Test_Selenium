package seleniumTest;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		//TC 1 Launch the edge browser

				System.setProperty("webdriver.edge.driver", "E:\\July 2024\\msedgedriver.exe");
				WebDriver driver=new EdgeDriver();
				driver.get("https://www.facebook.com/");

				Thread.sleep(5000);

				//TC - 2 click on create new account and  page will be displayed
				driver.findElement(By.xpath("//a[text()='Create new account']")).click();
				Thread.sleep(5000);
				
				//manage the window to maximize
				driver.manage().window().maximize()	;
				
				Thread.sleep(5000);
				//Tc - 3 click on Learn more
				driver.findElement(By.linkText("Learn more")).click();
				Thread.sleep(5000);
				
				//Tc - 4 get the window handles
				ArrayList<String> tabs=new ArrayList(driver.getWindowHandles());
				System.out.println(tabs);
				
				//shifting from 0th tab to 1st tab
				driver.switchTo().window(tabs.get(1));
				
				Thread.sleep(5000);
				//click on using hyperlink
				driver.findElement(By.linkText("Using Facebook")).click();
				
				//in signup page i would like to enter last name as Krishna
				driver.switchTo().window(tabs.get(0));
				
				Thread.sleep(5000);
				
				//driver.findElement(By.name("lastname")).sendKeys("Krishna");
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Krishna");
				
				Thread.sleep(5000);
				
				
				//TC - 4 close the browser
				driver.quit();
				
				
	}

}
