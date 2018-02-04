package Pageclasses;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SerchMakeupProduct {
	WebDriver driver;
	@FindBy (xpath="//*[@id='twotabsearchtextbox']") WebElement SearchBox;
	@FindBy (name="mac lipstick matte shades long lasting") WebElement texttoclick;
	//@FindBy (xpath="//*[@id='nav-search']/form/div[3]/div[1]/input") WebElement SearchBoxMove;

	public SerchMakeupProduct(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void searchele(String searchtext) throws Exception{
		
		SearchBox.sendKeys(searchtext);
		SearchBox.sendKeys(Keys.ENTER);
		/*Thread.sleep(30000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.name(contain)));
		driver.findElement(By.name(contain)).click();
		*/
				
			
}
}