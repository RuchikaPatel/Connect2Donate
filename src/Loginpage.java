import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe"); // Invokes the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		driver.get("http://localhost:28871/");
		
		//Login Page
		
		driver.findElement(By.id("txtEmail")).sendKeys("jay12@gmail.com");
		driver.findElement(By.id("txtPasssword")).sendKeys("jay123@");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
	}

}
