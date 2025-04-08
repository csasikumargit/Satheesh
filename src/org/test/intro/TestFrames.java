package org.test.intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFrames {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sasik\\amrit\\TestSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//frame[@name='login_page']"));
	
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("1234567");
		
		
			}

}
