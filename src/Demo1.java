import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 
{
@Test
public void gmail_login()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
	WebDriver myD=new ChromeDriver();
	myD.get("https://www.google.co.in");
	System.out.println(myD.getTitle());
	
}
}
