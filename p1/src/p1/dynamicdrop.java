package p1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class dynamicdrop {
public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://3.110.88.201/dropdownsPractise/");
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
driver.findElement(By.xpath("//a[@value='BLR']")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();// using index
driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

}



}

