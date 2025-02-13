package seleniumTestMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {
	@Test
	

	public static void main(String[] args) throws InterruptedException {
		//TC 1 Launch the edge browser

		System.setProperty("webdriver.edge.driver", "E:\\July 2024\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(5000);

		//TC - 2 click on create new account and  page will be displayed
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);

		int a=10;
		System.out.println(a);

		WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));

		Actions actions=new Actions(driver);
		actions.click(password).build().perform();
		

		Thread.sleep(5000);

		actions.contextClick(password).build().perform();
		Thread.sleep(5000);
		
		actions.doubleClick(password).build().perform();
		Thread.sleep(5000);
		
		//Move to first name text box
		WebElement firstnameTB=driver.findElement(By.xpath("//input[@name='firstname']"));
		actions.moveToElement(firstnameTB).build().perform();
		Thread.sleep(5000);
		
		WebElement sorce=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		WebElement destination=driver.findElement(By.xpath("//input[@name='firstname']"));
		actions.dragAndDrop(sorce, destination).build().perform();
	
		
		
		driver.close();



	}

}
