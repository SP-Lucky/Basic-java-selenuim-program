package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Button {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
	       List<WebElement>radios= driver.findElements(By.xpath("//input[@type='radio']"));
	       System.out.println("no of total radios"+""+radios.size());
	       for(int i= 0;i<radios.size();i++)
	       {
	    	   System.out.println(radios.get(i).getAttribute("name"));
	       }
//	       driver.close();

	}

}
