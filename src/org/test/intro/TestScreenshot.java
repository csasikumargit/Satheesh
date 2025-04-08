package org.test.intro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScreenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sasik\\amrit\\TestSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'Prompt Alert')]")).click();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		al.sendKeys("Sasikumar");
		al.accept();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\sasik\\OneDrive\\Pictures\\Screenshots\\123.png");
		
		FileUtils.copyFile(s, d);
		
			}

}
