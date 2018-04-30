


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleHomePage {
	public WebDriver driver;

	
   @Parameters({"browser"})
   @BeforeMethod(alwaysRun=true)
	public void invokeChromeBrowser(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashishsharma05\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		}	
	}
	
	@Test(groups="grp1")
	public void search1() throws InterruptedException {
		System.out.println("Thread ID : "+Thread.currentThread().getId());
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
		
		
		
	}
	@Test(groups="grp1")
	public void search2() throws InterruptedException {
		System.out.println("Thread ID : "+Thread.currentThread().getId());
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
		
	}
	@Test(groups="grp1")
	public void search3() {System.out.println("Thread ID : "+Thread.currentThread().getId());
	driver.get("http://www.google.com");
	driver.findElement(By.name("q")).click();
	driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
	
	}@Test(groups="grp1")
	public void search4() {System.out.println("Thread ID : "+Thread.currentThread().getId());
	driver.get("http://www.google.com");
	driver.findElement(By.name("q")).click();
	driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
	
		
	}@Test(groups="grp1")
	public void search5() {System.out.println("Thread ID : "+Thread.currentThread().getId());
	driver.get("http://www.google.com");
	driver.findElement(By.name("q")).click();
	driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
	Actions action=new Actions(driver);
	action.sendKeys(Keys.ENTER).perform();
		
	}@Test(groups="grp2")
	public void search6() {System.out.println("Thread ID : "+Thread.currentThread().getId());
	driver.get("http://www.google.com");
	driver.findElement(By.name("q")).click();
	driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
	
		
	}@Test(groups="grp2")
	public void search7() {System.out.println("Thread ID : "+Thread.currentThread().getId());
	driver.get("http://www.google.com");
	driver.findElement(By.name("q")).click();
	driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
	Actions action=new Actions(driver);
	action.sendKeys(Keys.ENTER).perform();
		
	}@Test(groups="grp2")
	public void search8() {System.out.println("Thread ID : "+Thread.currentThread().getId());
	driver.get("http://www.google.com");
	driver.findElement(By.name("q")).click();
	driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
	
		
	}@Test(groups="grp2")
	public void search9() {System.out.println("Thread ID : "+Thread.currentThread().getId());
	driver.get("http://www.google.com");
	driver.findElement(By.name("q")).click();
	driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
	
		
	}
	@Test(groups="grp2")
	public void search10() {System.out.println("Thread ID : "+Thread.currentThread().getId());
	driver.get("http://www.google.com");
	driver.findElement(By.name("q")).click();
	driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
	
		
	}
	@AfterMethod(alwaysRun=true)
	public void closeChromeBrowser() {
		System.out.println("Test Completed: "+Thread.currentThread().getName());
		
	}

}
