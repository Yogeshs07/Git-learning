package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {
	
	ChromeDriver driver;
	
	//open browser
	
	public void open() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yoges\\OneDrive\\Desktop\\SE exam\\Selenium\\chromedriver.exe");
		driver =new ChromeDriver();
		//open
		driver.get("https://demo.guru99.com/v4/");
		//maximize
		driver.manage().window().maximize();
		//close
		//driver.close();
	}
	
	public void login()
	{
		//username by name
		WebElement usnm = driver.findElement(By.name("uid"));
		usnm.sendKeys("mngr475498");
		//password by name
		driver.findElement(By.name("password")).sendKeys("dedArut");
		//login button by name
		driver.findElement(By.name("btnLogin")).click();
		
		//find link
		//driver.findElement(By.linkText("New Customer")).click();
		
		//same as above with partial name
		driver.findElement(By.partialLinkText("Customer")).click();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Script2 obj = new Script2();
		obj.open();
		obj.login();
	}

}
