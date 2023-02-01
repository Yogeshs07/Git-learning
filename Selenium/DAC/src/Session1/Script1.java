package Session1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {
	
	ChromeDriver driver;
	
	//open browser
	
	public void open() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yoges\\OneDrive\\Desktop\\SE exam\\Selenium\\chromedriver.exe");
		driver =new ChromeDriver();
		//open
		driver.get("https://www.google.com/");
		//maximize
		driver.manage().window().maximize();
		//close
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Script1 obj = new Script1();
		obj.open();
	}

}
