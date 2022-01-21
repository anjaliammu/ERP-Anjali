package Basemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bsemethod 
{
	 public static WebDriver driver;

	public static void openbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver = new ChromeDriver();
	}
	public static void launchERP()
	{
		
		driver.get("http://projects.qedgetech.com/webapp/login.php");
	}
	public static void adminlogin()
	{
		WebElement uid = driver.findElement(By.id("username"));
		uid.clear();
		uid.sendKeys("admin");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		//cahnges from eclipse
		//changes from GIT
	}
	
	
	
	
}
