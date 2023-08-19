package Home;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class LmsLoginPage 
{
	protected WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		
		driver.get("https://fortunecloudindia.com/");
		
		driver.manage().window().maximize();
		
		ArrayList<String> browsertabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(browsertabs.get(1));
		
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
