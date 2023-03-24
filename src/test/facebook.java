package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) 
	{

	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--remote-allow-origins=*");
//	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("9533688843");
	  driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Shiva_143");
	  driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
//	  driver.close();

	
}
}
