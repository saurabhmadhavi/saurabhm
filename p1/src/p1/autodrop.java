package p1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autodrop {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.110.88.201/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);
	   // List<WebElement> option =driver.findElement(By.cssSelector("li[class='ui-menu-item'] a"));
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option : options) {
			if (option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
				
			}
		}
	}

}
