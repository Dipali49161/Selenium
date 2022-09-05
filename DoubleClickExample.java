package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample
{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAGAR\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().window().maximize();
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));	

		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']/parent::body/div"))).perform();
}
}
