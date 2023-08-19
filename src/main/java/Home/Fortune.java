package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fortune 
{
	WebDriver driver;
	
	@FindBy(xpath = "//a[@class='js-animation-link d-none d-lg-inline-block btn btn-primary']")
	private WebElement studlogin;
	
	
	
	public  Fortune(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public Pom_firstscript  clickstudlogin()
	{
		studlogin.click();
		
		return new Pom_firstscript(driver);
	}

}
