package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsTest1 {

	public static void main(String[] args) throws InterruptedException {
		//TC 1 Launch the edge browser

		System.setProperty("webdriver.edge.driver", "E:\\July 2024\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(5000);

		//TC - 2 click on create new account and  page will be displayed
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		//TC - 3 enter first name and surname
		//id = u_8_8_KD
		//name = firstname
		//class = inputtext _58mg _5dba _2ph-
		Thread.sleep(5000);

		driver.findElement(By.name("firstname")).sendKeys("Siri");
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).clear();
		Thread.sleep(5000);

		driver.findElement(By.name("lastname")).sendKeys("Krishna");

		Thread.sleep(5000);

		driver.findElement(By.name("reg_email__")).sendKeys("test@123");		

		//TC -4 close the browser
		driver.quit();

	}

}

/*Tc1 -launch the edge browser and naviagte to face book URL
TC - 2 - click on create new account and signup page will be displayed
TC - 3 enter first name and last name
TC -4 close the browser*/