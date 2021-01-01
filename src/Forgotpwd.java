import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgotpwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe"); // Invokes the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		driver.get("http://localhost:28871/");
		
			driver.get("http://localhost:28871/Home/Contact");
			System.out.println(driver.findElement(By.xpath("//address")).getText());
		
		//driver.findElement(By.xpath("//a[contains(text(),'Forget')]")).click();
		//System.out.println(driver.getTitle());
		//driver.findElement(By.id("Email")).sendKeys("jay12@gmail.com");
		
		//driver.findElement(By.xpath("//input[@value='Save']")).click();
	}
	

}
