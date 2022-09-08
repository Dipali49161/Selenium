package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAGAR\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("//span[text()='SAMSUNG Galaxy A03s Cell Phone, Factory Unlocked Android Smartphone, 32GB, Triple Lens Camera, Infinity Display Screen, Long Battery Life, Expandable Storage, US Version, Blue']"
)).click();
	driver.findElement(By.id("add-to-cart-button")).click();

   }
}
