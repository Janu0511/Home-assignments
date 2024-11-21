package Week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
			driver.get("http://leaftaps.com/opentaps/");
        	//login details
      		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
      		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
      		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); 
      	
      		//pathway to create account
      		driver.findElement(By.xpath("//div[@id='label']")).click();
      		driver.findElement(By.xpath("(//div[@class='x-panel-tl'])[4]")).click();
      		driver.findElement(By.linkText("Create Account")).click();
      		
      		//account creation details
      		driver.findElement(By.id("accountName")).sendKeys("Janani.Demo1");
      		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
      		
      		//dropdown using select tag for industry
      		WebElement element = driver.findElement(By.xpath("(//select[@class='inputBox'])[2]"));
      		Select option=new Select(element);
      		option.selectByValue("IND_SOFTWARE");
      		
      		//dropdown for ownership
      		WebElement element1 = driver.findElement(By.xpath("(//select[@class='inputBox'])[3]"));
      		Select option1=new Select(element1);
      		option1.selectByValue("OWN_SCORP");
      		
      		//dropdown for source
      		WebElement element2 = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
      		Select option2=new Select(element2);
      		option2.selectByValue("LEAD_EMPLOYEE");
      		
      		//dropdown by index for marketing campign
      		WebElement element3 = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
      		Select option3=new Select(element3);
      		option3.selectByIndex(5);
      		
      		//dropdown for state
      		WebElement element4 = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
      		Select option4=new Select(element4);
      		option4.selectByValue("TX");
      		
      		driver.findElement(By.className("smallSubmit")).click();
      		
      		Thread.sleep(10000);

      		//To verify if account name display right
      		String accname = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
      		System.out.println(accname);
      		
      		
      		if (accname.contains("Janani.Demo1")) {
				System.out.println("Account name is Displayed correct :" +accname);
			}
      		
      		driver.close();
}}
