package org.test.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sasik\\amrit\\TestSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Your Wish List')]")).click();
	

	}
}
