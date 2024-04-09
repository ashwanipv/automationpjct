package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https://www.marinersforex.com/Flights-Booking");
	}
	@Test
	/*public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"headerticket\"]/div/div[4]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mui-1\"]")).sendKeys("anu123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"mui-2\"]")).sendKeys("anu9876");*/
	public void sighnup()
	{
		driver.findElement(By.xpath("//*[@id=\"headerticket\"]/div/div[4]/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[2]/div/div[2]/div/button[2]/span[1]").click();
		driver.findElement(By.xpath("//*[@id=\"mui-67\"]")).sendKeys("abhi");
		driver.findElement(By.xpath("//*[@id=\"mui-68\"]")).sendKeys("v");
		driver.findElement(By.xpath("//*[@id=\"mui-69\"]")).sendKeys("876546753");
		driver.findElement(By.xpath("//*[@id=\"mui-70\"]")).sendKeys("xyz");
		driver.findElement(By.xpath("//*[@id=\"mui-71\"]")).sendKeys("abhi123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"mui-72\"]")).sendKeys("9876568754");
		driver.findElement(By.xpath("//*[@id=\"mui-73\"]")).sendKeys("abhi987");
		driver.findElement(By.xpath("//*[@id=\"mui-74\"]")).sendKeys("abhi987");
	}

}
