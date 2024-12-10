package Loop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Forloop {
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		String title = driver.getTitle();
		Boolean TitleisCorrect = title.contains("Yahoo");
		String Pagestatus = TitleisCorrect ? "Passed" : "Failed" ;
		
		System.out.println("PageStatus ="+ Pagestatus);	
		driver.quit();

		
		
	}

}
