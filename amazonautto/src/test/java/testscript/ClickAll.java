package testscript;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pageclasses.loadpropertiesfile;

public class ClickAll {
	
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
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.navigate().to(prop());
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized"); 
		driver.findElement(By.xpath("//*[@id='searchDropdownBox']")).click();
		List<WebElement> li=driver.findElements(By.xpath("//*[@id='searchDropdownBox']"));
		
		
		
		for (int i=0;i<li.size();i++){
			
			System.out.println(li.get(i).getText());
		}
	}

}
