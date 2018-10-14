// Locator learning and practice
// Over commented for learning sake

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Practice 
{
	public static void main(String[] args)
	{
		// Set chromedriver
		System.setProperty("webdriver.chrome.driver",  "c://working//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open browser to URL to test
		driver.get("http://www.danintexas.com"); 
		
		// Find elements and fill out the form
		driver.findElement(By.id("name")).sendKeys("Daniel Gail");
		// driver.findElement(By.id("email")).sendKeys("daniel.gail@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("daniel.gail@gmail.com");;
		driver.findElement(By.id("phone")).sendKeys("832-612-1753");
		driver.findElement(By.id("message")).sendKeys("Yeah this works! I am loving learning this stuff! Just too much fun!");
		
		// Click on the Send key for the form
		// Can not use multiple classes with this
		driver.findElement(By.className("btn")).click();
		
		// Shutdown chromedriver
		driver.quit();
	}
}
