package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchGoogle {
	@Test
	public void launchgoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}

}
