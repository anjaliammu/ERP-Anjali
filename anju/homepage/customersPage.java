package homepage;

import org.openqa.selenium.By;

import Basemethods.Bsemethod;

public class customersPage {

	public static void main(String[] args) {
		
		Bsemethod.openbrowser();
		Bsemethod.launchERP();
		Bsemethod.adminlogin();
		Bsemethod.driver.findElement(By.id("mi_a_customers")).click();
		String res = Bsemethod.driver.findElement(By.id("ewPageCaption")).getText();
		if(res.equals("Customers"))
		{
			System.out.println("Customers page is Displayed,tc passed");
		}else
		{
			System.out.println("Customers page is not Displayed,tc Failed");
		}

	}

}
