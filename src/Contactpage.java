import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe"); // Invokes the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Grab the address present on the Page
		driver.get("http://localhost:28871/Home/Contact");
		System.out.println(driver.findElement(By.xpath("//address")).getText());
		
	}

}
