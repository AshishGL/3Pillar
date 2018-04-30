import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Configuration {
	WebDriver driver;
	
	@Test(priority=0)
	public void initiateDriver() {
		
		//WebDriver driver;
		System.out.println("Check-1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashishsharma05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Check-2");
		driver=new ChromeDriver();
		System.out.println("Check-2");
		
		driver.get("http://www.google.com");	
	}
	@Test
	public void Test()
	{
		System.out.println("Working Fine");
	}

}
