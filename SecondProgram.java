package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProgram {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAGAR\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		System.out.println("page title is:" + driver.getTitle());
		String str =driver.getCurrentUrl();
		System.out.println("current URL is:"+ str);
		driver.close();
	}

}
