package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class buttontext {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void buttontextverify()
	{
		driver.get("https://www.marinersforex.com/Flights-Booking");
		WebElement button=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[4]/input"));
		String buttontext=button.getAttribute("value");
		if(buttontext.equals("search>>"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
		
	

