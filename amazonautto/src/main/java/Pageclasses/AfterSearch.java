package Pageclasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;



public class AfterSearch {
	WebDriver driver;
	@FindBy (partialLinkText="MAC Giambattista Valli Lipstick Real Doll") WebElement product;
	@FindBy (xpath="//*[@id='dp-customer-review-header']") WebElement CustomerR;
	@FindBy (xpath="//*[@id='nav-link-shopall']/span[2]") WebElement ShopByC;
	@FindBy (xpath="//*[@id='nav-flyout-shopAll']/div[3]/div[5]/div[1]/div/a[5]/span") WebElement PowerBank;
	public AfterSearch(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		}

	public String hashmap(int key){
		
		List<WebElement> ls=driver.findElements(By.xpath("//*/a[contains(@title,'M')]"));
		Map<Integer,String> map=new HashMap<Integer, String>();
		for (int i=0;i<ls.size();i++){
			String text=ls.get(i).getText();
			//System.out.println(text);
			map.put(i, text);
			
			
		}
		System.out.println(map);
		System.out.println(map.get(key));
		return map.get(key);
	}
	
	public void movedwin(){
		String currntwin=driver.getWindowHandle();
		Set<String> st=driver.getWindowHandles();
		Iterator<String> itr=st.iterator();
		while(itr.hasNext()){
			
			String child=itr.next();
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
		}
		
		
	}
	
	public void scroll(int key){
		
		Map<Integer,WebElement> mp=new HashMap<Integer,WebElement>();
		mp.put(1, CustomerR);
		mp.put(2, ShopByC);
		JavascriptExecutor je=((JavascriptExecutor)driver);
		je.executeScript("arguments[0].scrollIntoView();", mp.get(key));
		System.out.println(CustomerR.getText());
		Actions Act=new Actions(driver);
		Act.moveToElement(ShopByC).build().perform();
			}
	
	public void scrollind(int key1){
	
		List<WebElement> ls=driver.findElements(By.xpath("//*[@class='nav-template nav-flyout-content nav-tpl-itemList']/span/span"));
		Map<Integer,WebElement> mp1=new HashMap<Integer,WebElement>();
		for(int j=0;j<ls.size();j++){
			
			mp1.put(j,ls.get(j));
		}

JavascriptExecutor je1=((JavascriptExecutor)driver);
je1.executeScript("arguments[0].scrollIntoView();", mp1.get(key1));
System.out.println(mp1.get(key1).getText());
mp1.get(key1).click();
PowerBank.click();
	}
}
