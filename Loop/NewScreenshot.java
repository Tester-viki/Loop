package Loop;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class NewScreenshot {

	
	
	@Test
	public  void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://adactinhotelapp.com/Register.php");Thread.sleep(150);
		driver.manage().window().maximize();
		
		 WebElement X = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		 X.sendKeys("VigneshRaj");
		 WebElement X1 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 X1.sendKeys("Raja@123");
		 WebElement X2 = driver.findElement(By.xpath("//*[@id=\"re_password\"]	"));
		 X2.sendKeys("Raja@123");
		 WebElement X3 = driver.findElement(By.xpath("//*[@id=\"full_name\"]"));
		 X3.sendKeys("Vignesh Raja");
		 WebElement X4 = driver.findElement(By.xpath("//*[@id=\"email_add\"]"));
		 X4.sendKeys("vickyrajaidp@gmail.com");
		 WebElement X5 = driver.findElement(By.xpath("//*[@id=\"captcha-form\"]"));
		 X5.sendKeys("skippery");
		 WebElement X6 = driver.findElement(By.xpath("//*[@id=\"tnc_box\"]"));
		 X6.click();
		 WebElement X7 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		 X7.click();

		 
		 File FirstSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File ("./Screenshot/img5.png");
		 FileHandler .copy(FirstSrc, dest);
		 driver.quit();
			
		
		
		
	}

}
