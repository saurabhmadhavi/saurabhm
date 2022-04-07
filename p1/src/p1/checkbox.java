package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.110.88.201/dropdownsPractise/");
		System.out.println();driver.findElement(By.cssSelector("input[id='SeniorCitizenDiscount']")).isSelected();
		driver.findElement(By.cssSelector("input[id='SeniorCitizenDiscount']")).click();
		System.out.println();driver.findElement(By.cssSelector("input[id='SeniorCitizenDiscount']")).isSelected();
		// count number of checkbox available on that page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
				driver.findElement (By.id ("divpaxinfo" )) .click() ;
				Thread.sleep(2000L) ;
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i=1;i<5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	}

}
