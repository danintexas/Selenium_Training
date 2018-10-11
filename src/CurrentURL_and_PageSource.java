import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentURL_and_PageSource 
{
	public static void main(String[] args)
	{
		//Opening multiple browser windows and check URL and Title
		
		
		System.setProperty("webdriver.chrome.driver", "c:\\Working\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // Open first Chrome instance
		WebDriver driverTwo=new ChromeDriver(); // Open second Chrome instance
		
		// Navigate to Google.com and return URL and Title
		driver.get("http://google.com"); 
		PrintPage(driver);
		
		// Navigate to danintexas.com and return URL and Title in second browser
		driverTwo.navigate().to("http://www.danintexas.com");
		PrintPage(driverTwo);
		
		// Navigate to bing.com and return URL and Title
		driver.get("http://bing.com");
		PrintPage(driver);
		
		// Navigate to Google.com and return URL and Title
		driver.navigate().back(); // Hit back on the browser window
		PrintPage(driver);
		
		// Navigate to bing.com and return URL and Title
		driver.navigate().forward(); // Hit forward on the browser window
		PrintPage(driver);
		
		// System.out.println(driver.getPageSource()); // Grabs all the pages source
		
		// driver.close(); // Closes current browser - Doesn't stop the process
		driver.quit(); // Closes all browsers opened by Selenium script		
		driverTwo.quit(); // Close second browser
	}
	
	static void PrintPage(WebDriver driver) // Returns results to console
		{
			System.out.println(driver.getTitle()); // Validate if your page title is correct		
			System.out.println(driver.getCurrentUrl() ); // Validate if you are landed on correct URL
		}
}
