package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hotelbooking {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
	driver=new ChromeDriver();
	driver.get("https://www.marinersforex.com/hotellist");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"country-select-demo\"]")).sendKeys("delhi");
		driver.findElement(By.xpath("*[@id=\"root\"]/div/div[2]/div/form/div/div[2]/div/div[1]/div/input"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div/div[2]/div/div[2]/div/input"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div/div[3]/div/ul/li/a/span"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/div[2]/form/div/div[4]/input"));
		
	}

}
