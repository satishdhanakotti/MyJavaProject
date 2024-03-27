package Browser.Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOpen {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserOpen o = new BrowserOpen();
		o.openBrowser("FIrefox","https://www.google.com");

	}

	public void openBrowser(String browserName, String url) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("The Browser Name is not matching");
		}
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.close();

	}

}
