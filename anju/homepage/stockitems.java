package homepage;

import org.openqa.selenium.By;

import Basemethods.Bsemethod;

public class stockitems {

	public static void main(String[] args)
	{
	Bsemethod.openbrowser();
	Bsemethod.launchERP();
	Bsemethod.adminlogin();
	Bsemethod.driver.findElement(By.id("mi_a_stock_items")).click();
	String actResult = Bsemethod.driver.findElement(By.id("ewPageCaption")).getText();
	if(actResult.equals("Stock Items"))
	{
		System.out.println("Stockitems page is displayed,Testcase Passed");
	}else
	{
		System.out.println("Stockitems page is not displayed,Testcase Failed");
	}

	}

}
