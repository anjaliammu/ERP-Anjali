package Erpsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class invaliddata {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://projects.qedgetech.com/webapp/login.php");
		WebElement uid = driver.findElement(By.id("username"));
		uid.clear();
		uid.sendKeys("admin");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("admin");
		driver.findElement(By.id("btnsubmit")).click();
		String err = driver.findElement(By.xpath("//*[@ class='alert alert-danger ewError']")).getText();
		
		System.out.println(err);
		
		/*String errmsg = driver.getWindowHandle();
		System.out.println(errmsg);*/
	


		if(err.contains("Incorrect"))
		{
			System.out.println("Invalid credentials,testcase passed");
		}else
		{
			System.out.println("valid credentials,testcase passed");
		}
		

	}

}
