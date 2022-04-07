package p1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seltestpract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver Driver = new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\gekodriver\\gekodriver.exe");

	//	WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
