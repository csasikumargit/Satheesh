package org.test.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestXpath {

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

		//		Xpath Syntax
		//		WebElement element = driver.findElement(By.xpath("//input[@id='email']"));
		//		element.sendKeys("csasikumar@gmail.com");

		//		if the tag name is not known, if you know the attribute name and value
		//		WebElement element = driver.findElement(By.xpath("//*[@id='email']"));
		//		element.sendKeys("csasikumar@gmail.com");

		//text
		//		WebElement element = driver.findElement(By.xpath("//button[text()='Log in']"));
		//		element.click();

		//contains text
		//		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Log')]"));
		//		element.click();


//		//contains text
//		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
//		String text = element.getText();
//		System.out.println(text);
		
		
		// start with text
//		WebElement element2 = driver.findElement(By.xpath("//a[starts-with(text(),'Create new')]"));
//		element2.click();
//		
		// index postion
//		WebElement element = driver.findElement(By.xpath("(//a[starts-with(text(),'Create ')])[2]"));
//		element.click();
		
		// multiple attribute
		WebElement element = driver.findElement(By.xpath("//a[starts-with(text(),'Create ') and @class='_8esh']"));
		element.click();

	}
}
