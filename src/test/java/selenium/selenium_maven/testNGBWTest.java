package selenium.selenium_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNGBWTest {
	@Test
	public void testNGBrowserTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.0.0-beta3");
	}
	
}
