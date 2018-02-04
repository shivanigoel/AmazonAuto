package testscript;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pageclasses.*;

public class openamazon {
	
	WebDriver driver;
	@BeforeMethod
	public String prop() throws IOException{
		loadpropertiesfile op=new loadpropertiesfile();
		String UL=op.useprop().getProperty("URL");
		return UL;
	}
	@Test	
	public void openurl() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiva\\workspace\\amazonautto\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(prop());
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized"); 
		SerchMakeupProduct se=PageFactory.initElements(driver, SerchMakeupProduct.class);
		se.searchele("Mac Lipstick");
		AfterSearch af=PageFactory.initElements(driver, AfterSearch.class);
		String text=af.hashmap(2);
		driver.findElement(By.linkText(text)).click();
		af.movedwin();
		af.scroll(1);
		af.scroll(2);
		af.scrollind(5);
		
	}
}
