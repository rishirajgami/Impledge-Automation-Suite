package Kloudship_Package;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Case_01_Add_Package extends Base {


	@Test(priority = 1)
	void Navigate_Package() {
		driver.findElement(By.xpath("//span[@class=\"text-count-card wordwrap-none\"]")).click();

	}

	@Test(priority = 2)
	void Package_Creation() {
		driver.findElement(By.xpath(
				"(//mat-icon[@role=\"img\"][@class=\"mat-icon notranslate mat-tooltip-trigger material-icons mat-ligature-font mat-icon-no-color\"])[2]"))
				.click();
		driver.findElement(By.xpath("//input[@id=\"mat-input-2\"]")).sendKeys("Rishi_Raj");
		driver.findElement(By.xpath("//input[@formcontrolname=\"length\"]")).clear();//
		driver.findElement(By.xpath("//input[@formcontrolname=\"length\"]")).sendKeys("2");

		driver.findElement(By.xpath("//input[@formcontrolname=\"length\"]")).clear();//
		driver.findElement(By.xpath("//input[@formcontrolname=\"length\"]")).sendKeys("3");

		driver.findElement(By.xpath("//input[@formcontrolname=\"height\"]")).clear();//
		driver.findElement(By.xpath("//input[@formcontrolname=\"height\"]")).sendKeys("4");
		
		driver.findElement(By.xpath("//mat-icon[@class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color'][normalize-space()='check']")).click();
	}
	
	

}
