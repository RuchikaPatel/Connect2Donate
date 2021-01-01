import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe"); // Invokes the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		driver.get("http://localhost:28871/");
		System.out.println(driver.getTitle());  //Grabs the title of the page
		
		//Counts the total links present on the Webpage
		System.out.println("Total Links onthe Webpage: " +driver.findElements(By.tagName("a")).size());
		
		//count the link presnt on nav bar
		//Limiting the scope
		WebElement navdriver = driver.findElement(By.cssSelector(".nav.navbar-nav"));
		System.out.println("Links present in Nav bar:" +navdriver.findElements(By.tagName("a")).size());

		for(int i=1;i<navdriver.findElements(By.tagName("a")).size();i++)
		{
			navdriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		}
		
		//Opening each tab in different window and grabbing the title
		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	

		

	}

}
