package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) 
	{
	  WebDriverManager.chromedriver().setup();
	  
//	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedriver");
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--remote-allow-origins=*");
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
//	  driver.close();

	}

}
