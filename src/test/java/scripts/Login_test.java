package scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Login_test {
	
	
	@Test
	public void navi() {
		String key="webdriver.chrome.driver";
		String value="./exefiles/chromedriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./screenshots/navi.jpg");
		
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
