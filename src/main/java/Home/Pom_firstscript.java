package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_firstscript 
{

	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='id_username']")
	private WebElement emailid;
	
	@FindBy(name="password")
	private WebElement pass;
	
	
	@FindBy(name="login")
	private WebElement login;
	
	public Pom_firstscript(WebDriver driver)
	{
		this.driver= driver;
		
		PageFactory.initElements(driver,this);
	}
	
	public void enteremail(String email)
	{
		emailid.sendKeys(email);
	}
	
	public void enterpass(String passw)
	{
		pass.sendKeys(passw);
	}
	
	public void click_login()
	{
		login.click();
	}
}
