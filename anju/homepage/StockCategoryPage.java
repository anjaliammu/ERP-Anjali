package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Basemethods.Bsemethod;

public class StockCategoryPage {

	public static void main(String[] args) {
		Bsemethod.openbrowser();
		Bsemethod.launchERP();
		Bsemethod.adminlogin();
		WebElement stockitems = Bsemethod.driver.findElement(By.id("mi_a_stock_items"));
		Actions acti = new Actions(Bsemethod.driver);
		acti.moveToElement(stockitems).build().perform();
		WebElement stockcat = Bsemethod.driver.findElement(By.id("mi_a_stock_categories"));
        acti.moveToElement(stockcat).build().perform();
        stockcat.click();
	    String res = Bsemethod.driver.findElement(By.id("ewPageCaption")).getText();
        if(res.equals("Stock Categories"))
        {
        	System.out.println("Stock Categories page displayed,Tc Passed");
        }else
        {
        	System.out.println("Stock Categories page not displayed,Tc Failed");
        }
	}

}
