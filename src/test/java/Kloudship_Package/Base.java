package Kloudship_Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Base {
	
	WebDriver driver;
	@BeforeTest
	void Navigate_Login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://ecspro-qa.kloudship.com/");
		driver.findElement(By.xpath("(//input[@placeholder=\"Email *\"])[1]"))
				.sendKeys("kloudship.qa.automation@mailinator.com");
		driver.findElement(By.xpath("(//input[@placeholder=\"Password *\"])[1]")).sendKeys("Password1");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}
	@AfterTest
	void logout_close() throws InterruptedException {
	
		driver.findElement(By.xpath("//mat-icon[normalize-space()='more_vert']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@role=\"menuitem\"])[9]")).click();
		driver.quit();
		
		
	}

}
