package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {
	
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
				
	}
	
	public void addCustomer()
	{
		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("CDAC");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")).click();
		///html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]
		driver.findElement(By.id("dob")).sendKeys("08/09/2021");
		driver.findElement(By.name("addr")).sendKeys("Kharghar");
		driver.findElement(By.name("city")).sendKeys("Navi Mumbai");
		driver.findElement(By.name("state")).sendKeys("Maharastra");
		driver.findElement(By.name("pinno")).sendKeys("422121");
		driver.findElement(By.name("telephoneno")).sendKeys("9876543210");
		driver.findElement(By.name("emailid")).sendKeys("xyz@abc.com");
		driver.findElement(By.name("password")).sendKeys("Kharghar");
		driver.findElement(By.name("sub")).click();		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Script3 obj = new Script3();
		obj.open();
		obj.login();
		obj.addCustomer();
	}

}
