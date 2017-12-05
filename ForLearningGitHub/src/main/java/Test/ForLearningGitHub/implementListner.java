package Test.ForLearningGitHub;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class implementListner {
	
	@Test
	public void test1() throws IOException{
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		op.addArguments("--start-maximized");
		System.setProperty("driver.chrome.driver", "h:\\chromedriver.exe");
		Logger log4j=Logger.getLogger("devpinoyLogger");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://yatra.com/");
		log4j.debug("errorrrrrrrrrrrrrrrrrrrrrrr");
		WebElement element=driver.findElement(By.xpath("//*[@id='BE_flight_flsearch_btn']"));
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  
		  //Used selenium getSize() method to get height and width of element.
		  //Retrieve width of element.
		  int ImageWidth = element.getSize().getWidth();
		  //Retrieve height of element.
		  int ImageHeight = element.getSize().getHeight();  
		  
		  //Used selenium Point class to get x y coordinates of Image element.
		  //get location(x y coordinates) of the element.
		  Point point = element.getLocation();
		  int xcord = point.getX();
		  int ycord = point.getY();
		  
		  //Reading full image screenshot.
		  BufferedImage img = ImageIO.read(screen);
		  
		  //cut Image using height, width and x y coordinates parameters.
		  BufferedImage dest = img.getSubimage(xcord, ycord, ImageWidth, ImageHeight);
		  ImageIO.write(dest, "png", screen);
		  
		  //Used FileUtils class of apache.commons.io.
		  //save Image screenshot In D: drive.
		  FileUtils.copyFile(screen, new File("F:\\screenshot.png"));
		}

}
