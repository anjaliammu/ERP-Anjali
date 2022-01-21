package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Basemethods.Bsemethod;

public class UnitOfMeasurementpage {

	public static void main(String[] args) {
		
		Bsemethod.openbrowser();
		Bsemethod.launchERP();
		Bsemethod.adminlogin();
		WebElement stockit = Bsemethod.driver.findElement(By.id("mi_a_stock_items"));
		Actions act = new Actions(Bsemethod.driver);
		act.moveToElement(stockit).build().perform();
		WebElement UFM = Bsemethod.driver.findElement(By.id("mi_a_unit_of_measurement"));
		act.moveToElement(UFM).build().perform();
		UFM.click();
		String actres = Bsemethod.driver.findElement(By.id("ewPageCaption")).getText();
		if(actres.equals("Unit of Measurement"))
		{
			System.out.println("Unit of Measurement page Displayed,Tc Passed");
		}else
		{
			System.out.println("Unit of Measurement page not Displayed,Tc Failed");
		}

	}

}
