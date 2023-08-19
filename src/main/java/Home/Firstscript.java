package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Firstscript {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d1 = new ChromeDriver();
		
		d1.get("https://demoqa.com/automation-practice-form");
		
		d1.manage().window().maximize();
		
		WebElement fname= d1.findElement(By.xpath("//input[@id='firstName']"));
		fname.sendKeys("Pooja");
		fname.click();
		
		WebElement lname = d1.findElement(By.xpath("//input[@id='lastName']"));
		lname.sendKeys("sonwane");
		lname.click();
		
		WebElement email= d1.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("Abcd@gmail.com");
		email.click();
		
		d1.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		
		WebElement mobile = d1.findElement(By.xpath("//input[@id='userNumber']"));
		mobile.sendKeys("9089786680");
		mobile.click();

		d1.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		
		WebElement Dateofmonth = d1.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		
		Select s1 = new Select(Dateofmonth);
		s1.selectByVisibleText("August");
		
		WebElement Dateofyear = d1.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		
		Select s2 = new Select(Dateofyear);
		s2.selectByVisibleText("2023");
		
		WebElement Day = d1.findElement(By.xpath("//div[@class=\"react-datepicker__day react-datepicker__day--022\"]"));
		Day.click();
		
		WebElement Subject = d1.findElement(By.id("subjectsInput"));
		Subject.sendKeys("Computer Science");
		
		Subject.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		Subject.sendKeys("Math");
		Subject.sendKeys(Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) d1;
		js.executeScript("window.scrollBy(0,350)");
		
		WebElement hobbies = d1.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
		hobbies.click();

	}

}
