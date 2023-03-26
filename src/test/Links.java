package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Links {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
//		int count=0;
		System.out.println("links="+""+links.size());
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
//				count++;
				System.out.println(links.get(i).getText());
			}
			
		}
//		System.out.println("links="+links.size());
//		System.out.println("visible links="+count);
		driver.close();
	}

}
