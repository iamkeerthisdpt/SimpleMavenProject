import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ListenersDemo.class)
public class MyClassTest {
	
@Test
	public void myMethod()
	{
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/");
		driver.close();*/

		WebDriverManager.chromedriver().setup();

		
		// Set path to Chromedriver binary
       		 System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

       		 // Set path to Chrome binary
		ChromeOptions options = new ChromeOptions();
        	//options.setBinary("/usr/bin/google-chrome");
        	options.addArguments("--headless"); // Run Chrome in headless mode
		ChromeDriver driver = new ChromeDriver(options);	
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/");
		driver.close();
	}
}
