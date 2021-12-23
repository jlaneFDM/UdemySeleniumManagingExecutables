import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver firefox = new FirefoxDriver();
		
		firefox.get("http://www.google.com");
		firefox.close();
		
	}

}
