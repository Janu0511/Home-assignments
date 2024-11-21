package Week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class createlead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        driver.get("http://leaftaps.com/opentaps");
        
        //login details
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); 
	
		//pathway to create lead
		driver.findElement(By.xpath("//div[@id='label']")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//filling up details in lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Janani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("selladurai");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9444787878");
		driver.findElement(By.className("smallSubmit")).click();
		
		//checking if title given in lead is getting displayed right
		String actualtitle = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
	    System.out.println(actualtitle);
		
	   if (actualtitle.contains("Tester")) {
			System.out.println("The title is Displayed correct:" +actualtitle);
	   }
	   else {
			System.out.println("The title is displayed wrong");
			driver.close();
	   }
	}}


