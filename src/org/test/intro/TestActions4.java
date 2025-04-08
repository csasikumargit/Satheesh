package org.test.intro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActions4 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sasik\\amrit\\TestSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement s = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement d = driver.findElement(By.xpath("//ol[@id='bank']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(s, d).perform();
		

		
	}
}
