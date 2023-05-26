package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class StarterTest {
	SoftAssert softassert=new SoftAssert();
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		
//		driver=new ChromeDriver();
		
	}
	
	@Test(testName="firefoxBrowser", timeOut=10000)
	@Parameters("browser")
	public void dynamicBrowser(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else {
			System.out.println("\u001B[31m"+"No browser value passed in the 'src/test/java/testng.xml' file!");//The "\u001B[31m" is an ANSI escape code for setting the message color red
		}
		Thread.sleep(15000);
	}
	
}
