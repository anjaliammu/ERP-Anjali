package Erpsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchapp {

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
	pwd.sendKeys("master");
	driver.findElement(By.id("btnsubmit")).click();
	driver.findElement(By.linkText("Logout")).click();
	driver.findElement(By.xpath("//*[@ class='ajs-button btn btn-primary']")).click();
	//driver.findElement(By.id("mi_logout")).click();
	/*driver.findElement(By.className("ajs-header")).click();
	driver.findElement(By.className("ajs-button btn btn-primary")).click();*/
	
	
	
	/*String actresult = driver.findElement(By.id("ewPageCaption")).getText();
	if(actresult.contains("board"))
	{
		System.out.println("login is success,testcase passed");
	}else
	{
		System.out.println("unable to login,testcase failed");
	}*/
	

	}

}
