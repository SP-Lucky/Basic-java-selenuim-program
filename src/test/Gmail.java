package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gmail {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
//		driver.get("");
		driver.get("https://mail.google.com/mail/?tab=rm&authuser=0&ogbl\"");
		driver.findElement(By.xpath("//input[@id=\"identifierId\"]")).sendKeys("splucky.456@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[3]")).click();
//		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
//		List<WebElement>links=driver.findElements(By.tagName("a"));
//		driver.close();
		
		
	}

}
