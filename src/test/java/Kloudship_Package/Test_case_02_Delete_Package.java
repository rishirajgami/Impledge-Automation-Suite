package Kloudship_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_case_02_Delete_Package extends Base{
	
	
	
	@Test(priority = 1)
	void Navigate_Package() {
		driver.findElement(By.xpath("//span[@class=\"text-count-card wordwrap-none\"]")).click();

	}
	@Test(priority = 2)
	void delete_new_package() {
		Actions a = new Actions (driver);
		WebElement new_package=driver.findElement(By.xpath("//div[@class=\"padding list-text\"]"));
		a.moveToElement(new_package).perform();
		driver.findElement(By.xpath("//mat-card[1]//div[2]//mat-icon[1]")).click();
		driver.findElement(By.xpath("(//span[@class=\"mat-button-wrapper\"])[13]")).click();
	}
	

}
