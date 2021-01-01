import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe"); // Invokes the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		driver.get("http://localhost:28871/");
		//Create a new account Link
		
		driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
		System.out.println(driver.getTitle());
		
		// REGISTRATION FORM
		driver.findElement(By.id("Name")).sendKeys("Ruchika");
		driver.findElement(By.cssSelector("input#Email")).sendKeys("ruchikapatel1096@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Ruchi123@");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Ruchi123@");
		driver.findElement(By.cssSelector("select[id='UserType']")).click();
		driver.findElement(By.cssSelector("select[id='UserType'] option[value='0']")).click();
		driver.findElement(By.id("Line1")).sendKeys("20 Brookhaven drive");
		driver.findElement(By.xpath("//input[@name='Area']")).sendKeys("Scarborough");
		driver.findElement(By.xpath("//input[@id='Province']")).sendKeys("Ontraio");
		driver.findElement(By.id("Number")).sendKeys("6475674567");
		driver.findElement(By.id("PostalCode")).sendKeys("M1G3S5");
		//driver.findElement(By.cssSelector("input[type='Submit']")).click();
		driver.findElement(By.xpath("//a[text()='Back to List']")).click();
		

	}

}
