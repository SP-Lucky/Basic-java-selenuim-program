package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loggin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedriver");
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		  WebDriver driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
//		  driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("shiva god");
//		  
//		  driver.close();


	}

}
