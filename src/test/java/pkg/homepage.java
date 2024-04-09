package pkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class homepage {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https://www.marinersforex.com/Flights-Booking");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"headerticket\"]/div/div/span")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/div/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/div/div/div/div[2]/span"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/div/div/div/div[3]/span"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[1]/div/div/label[1]/span[1]/span[1]/input"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[1]/div/div/label[2]/span[1]/span[1]/input"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[1]/div/div/label[2]/span[1]/span[1]/input"));
		driver.findElement(By.xpath("//*[@id=\"country-select-demo\"]"));
		driver.findElement(By.xpath("//*[@id=\"date\"]"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/div"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[4]/input"));
	}
}
