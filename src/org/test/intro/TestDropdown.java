package org.test.intro;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sasik\\amrit\\TestSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		
		Select s = new Select(element);
		s.selectByValue("Analytics");
		
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.xpath("//select[@id='yearbox']"));
		
		Select s2 = new Select(element2);
		s2.selectByVisibleText("1934");
		List<WebElement> li = s2.getOptions();
		
		for (int i = 0; i < li.size(); i++) {
			
			WebElement element3 = li.get(i);
			String text = element3.getText();
			System.out.println(text);
			
			
			
			
		}
		
			}

}
