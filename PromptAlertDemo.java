package abc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAGAR\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	driver.manage().window().maximize();
	//Prompt Alert
		driver.findElement(By.id("promptBox")).click();
		Alert PromptAlert  = driver.switchTo().alert();
		System.out.println(PromptAlert.getText());
		PromptAlert.sendKeys("DipSagar");
		Thread.sleep(1000);
		PromptAlert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());


}
}
