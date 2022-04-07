package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class practicecheckboc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://3.110.88.201/dropdownsPractise/");
//	//	WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//	//	Select dropdown = new Select(StaticDropdown);
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.110.88.201/dropdownsPractise/");
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		  /*int i=1;
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}*/
		//   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}
