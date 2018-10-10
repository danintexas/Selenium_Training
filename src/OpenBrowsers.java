// Simple script to open each of the popular browsers and verify they are at Google.com

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowsers {

	public static void main(String[] args) 
	{
		// CHROME
		
		// invoke chrome.exe file first
		System.setProperty("webdriver.chrome.driver", "c:\\Working\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		
		// Launch Chrome and go to google.com
		chromeDriver.get("http://google.com");	
		String title = chromeDriver.getTitle();
		System.out.println(chromeDriver.getTitle());
		System.out.println("Chrome Browser: " + title);		
		chromeDriver.quit();
		
		// FIREFOX
		
		// invoke Firefox geckodriver.exe
		System.setProperty("webdriver.gecko.driver","c:\\Working\\geckodriver.exe");
		WebDriver firefoxDriver = new FirefoxDriver();
		
		// Launch Firefox and go to google.com
		firefoxDriver.get("http://google.com");
		String titleFire = firefoxDriver.getTitle();
		System.out.println(firefoxDriver.getTitle());
		System.out.println("Firefox Browser: " + titleFire);
		firefoxDriver.quit();
		
		// EDGE
		
		//invoke Edge MicrosoftWebDriver.exe
		System.setProperty("webdriver.edge.driver", "c:\\Working\\MicrosoftWebDriver.exe");
		WebDriver edgeDriver = new EdgeDriver();
		
		// Launch Edge and go to google.com
		edgeDriver.get("http://google.com");
		String titleEdge = edgeDriver.getTitle();
		System.out.println(edgeDriver.getTitle());
		System.out.println("Edge Browser: " + titleEdge);
		edgeDriver.quit();
		
		// IE
		
		//invoke IE MicrosoftWebDriver.exe
		System.setProperty("webdriver.ie.driver", "c:\\Working\\MicrosoftWebDriver.exe");
		WebDriver ieDriver = new InternetExplorerDriver();
		
		// Launch IE and go to google.com
		ieDriver.get("http://google.com");
		String ieTitle = ieDriver.getTitle();
		System.out.println(ieDriver.getTitle());
		System.out.println("IE Browser: " + ieTitle);
		ieDriver.quit();
		
	}
}
