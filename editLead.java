package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class editLead {

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
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jaan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("selladurai");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Marketing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium automation tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jaan123@gmail.com");
		
		//dropdown for state
  		WebElement element= driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
  		Select option=new Select(element);
  		option.selectByValue("NY");
  		
  		driver.findElement(By.className("smallSubmit")).click();
  		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
  		
  		//to clear description and update value
  		driver.findElement(By.id("updateLeadForm_description")).clear();
  		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Editing done");
  		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
  		
  	    //Resulting webpage title
  			String Name = driver.getTitle();
  			System.out.println(Name);
		
  			driver.close();
	}}


