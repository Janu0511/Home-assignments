package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteLead {

	public static void main(String[] args) {		

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        driver.get("http://leaftaps.com/opentaps/control/main");
		
        //login details
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); 
		driver.findElement(By.xpath("//div[@id='label']")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-tl'])[2]")).click();
	
		//find lead path
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9444787878");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		
		//captured lead id
		System.out.println("Lead id is 17459");
        
		//to delete
        driver.findElement(By.linkText("Janani")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.name("id")).sendKeys("17459");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		driver.close();
	}}

