package org.test.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLOcator {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sasik\\amrit\\TestSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("sasikumar@gmail.com");
		WebElement element2 = driver.findElement(By.name("pass"));
		element2.sendKeys("123456");
		Thread.sleep(3000);
		WebElement element3 = driver.findElement(By.name("login"));
		element3.click();
	}

}
