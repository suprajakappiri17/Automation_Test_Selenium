package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		//TC 1 Launch the edge browser

				System.setProperty("webdriver.edge.driver", "E:\\July 2024\\msedgedriver.exe");
				WebDriver driver=new EdgeDriver();
				driver.get("https://www.facebook.com/");

				Thread.sleep(5000);

				//TC - 2 click on create new account and  page will be displayed
				driver.findElement(By.xpath("//a[text()='Create new account']")).click();
				
				Thread.sleep(5000);
				
				//Select Day drop down //SelectByValue() was there inside the selct class
				Select day = new Select(driver.findElement(By.id("day")));
				
				Thread.sleep(5000);
				
				day.selectByValue("15");
				
				
			//Select month drop down
				Select month =new Select(driver.findElement(By.id("month")));
				month.selectByIndex(10);
				
				Thread.sleep(5000);
				
			// select year drop down
				Select year=new Select(driver.findElement(By.id("year")));
				year.selectByVisibleText("2001");
				Thread.sleep(5000);
				
				driver.close();
				
				
				

	}

}
