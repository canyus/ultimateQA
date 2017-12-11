package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.Driver;

public class Hook {
	WebDriver driver = Driver.getInstance();
	
	@Before
	public void setUp() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//	driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
