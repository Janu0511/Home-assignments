package Week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class createaccount {

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
	
		//pathway to create account
		driver.findElement(By.xpath("//div[@id='label']")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-tl'])[4]")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		//account creation details
		driver.findElement(By.id("accountName")).sendKeys("Janani.Demo");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.id("numberEmployees")).sendKeys("20");
		driver.findElement(By.className("smallSubmit")).click();
		
		//to check if title of webpage is displayed
		String Name = driver.getTitle();
		System.out.println(Name);
		
		if ( Name.contains("Create Account | opentaps CRM")) {
			System.out.println("The webpage is displayed correct ");}
			
			else{
				System.out.println("The webpage is displayed wrong");
			}
	}}
	
	




