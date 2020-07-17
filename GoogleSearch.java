
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;
public class GoogleSearch {
	@Test
	public void GoogleSearch() throws InterruptedException {
		//for launching browser - create an instance of ChromeDriver class
		//Ctrl + Shift + O
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		//before launching the chromebrowser - we need to point to the
		//path of chromdriver executables
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		WebDriver driver;
		driver = new FirefoxDriver(options); //launching browser
		driver.get("http://www.google.com"); //navigating to app url
		Thread.sleep(3000); //pause for 3 sec
		WebElement GoogleSearch = driver.findElement(By.name("q"));
		GoogleSearch.sendKeys("Selenium");
		GoogleSearch.submit();
	}
}
