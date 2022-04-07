package p1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class locatorselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")) .sendKeys("saurabh");
        driver.findElement(By.name("inputPassword")).sendKeys("saurabh");
        driver.findElement(By.className("signInBtn")).click();
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("saurabh");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("saurabh.m@gmail.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
       driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("m.saurabh@gmail.com");
//       driver.findElement(By.cssSelector("//form/input[3]")).sendKeys("1234567890");
       driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890");
       driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
       System.out.println(driver.findElement(By.cssSelector("form p")).getText());
       driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
     Thread.sleep(1000);
       driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
       driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
       driver.findElement(By.id("chkboxOne")).click();
       driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}

}
