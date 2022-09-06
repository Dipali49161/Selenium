package abc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAGAR\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	driver.manage().window().maximize();
	//simple alert
	driver.findElement(By.id("alertBox")).click();
	Alert SimpleAlert  = driver.switchTo().alert();
	System.out.println(SimpleAlert.getText());
	Thread.sleep(1000);
	SimpleAlert.accept();
	System.out.println(driver.findElement(By.id("output")).getText());


	

}
}
