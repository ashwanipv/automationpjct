package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class busbooking {
ChromeDriver driver;
@BeforeTest
public void set()
{
	driver=new ChromeDriver();
	driver.get("https://www.marinersforex.com/");
}
@Test
public void test()
{
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/div/div/div/div[3]/span"));
	driver.findElement(By.xpath("//*[@id=\"country-select-demo\"]"));
	driver.findElement(By.xpath("//*[@id=\"country-select-demo\"]"));
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/div[2]/form/div/div[3]/div/div/input"));
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/div[2]/form/div/div[4]/div"));
	}
}
