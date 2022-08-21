package abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAGAR\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
	List<WebElement>checkboxList = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(int i = 0;i<checkboxList.size();i++)
	{
		String attributeValue =checkboxList.get(i).getAttribute("checked");
		System.out.println(attributeValue);
	   if(attributeValue==null & i==0)
	   {
		   checkboxList.get(i).click();
	   }
	   else if(attributeValue.equals("true"))
	   {
		   checkboxList.get(i).click();
	   }
		
	}
	}
}
