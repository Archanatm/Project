package first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Final 
{
	WebDriver dr;
	@BeforeTest
	
	public void login()
	{
		 dr=new FirefoxDriver();
		dr.get("https://paytm.com/");
		dr.manage().window().maximize();
	}
@Test(priority=1)

public void title()
{
	String act= dr.getTitle();
	String exp = "Paytm.com – Digital & Utility Payment, Entertainment, Travel, Payment Gateway & more Online !";
	if(exp.equals(act))
	{
		System.out.println("Passed");
	}
	else
	{
		System.out.println("Failed");
	}
}

@Test(priority=2)

public void test1()
{
	dr.findElement(By.xpath("//i[@data-reactid='11']")).click();
	dr.findElement(By.xpath("//a[text()='Electronics']")).click();
	
}

@Test(priority=3)
public void test2() throws InterruptedException
{
	dr.findElement(By.xpath("//input[@type='search']")).sendKeys("Laptops");
	dr.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	dr.findElement(By.xpath("//span[@class='check']")).click();
	
}


	
	@AfterTest
	
	public void logout()
	{
		dr.quit();
	}
	
}


