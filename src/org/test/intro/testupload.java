package org.test.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testupload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sasik\\amrit\\TestSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[contains(text(),\"I'm experienced\")]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("C:\\Users\\sasik\\Downloads\\Sasikumar_Chinnasamy.pdf");


	}

}
