package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExecuteTest 
{
	
	public static void main(String args[])
	{
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://lms.fortunecloudindia.com/");
		
		driver.manage().window().maximize();
		
		Pom_firstscript p = new Pom_firstscript(driver);
		
		
		p.enteremail("poojasonwane00@gmail.com");
		
		p.enterpass("7W0XPDS");
		
		p.click_login();
		
	
	}

}
