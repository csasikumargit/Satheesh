package org.test.intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sasik\\amrit\\TestSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'Prompt Alert')]")).click();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		al.sendKeys("Sasikumar");
		al.accept();
		
		
			}

}
