package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class URL {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		  WebDriver driver=new ChromeDriver(options);
		  driver.manage().window().maximize();
		  driver.get("https://www.bing.com/");		
	   	  List<WebElement>links=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed());
			{
				String name=links.get(i).getText();
				links.get(i).click();
				String url=driver.getCurrentUrl();
				System.out.println(name+"  "+url);
				driver.navigate().back();
				links=driver.findElements(By.tagName("a"));				
				
			}
			
		}
		driver.close();

	}

}
