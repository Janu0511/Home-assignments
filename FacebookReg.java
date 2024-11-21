package Week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg {

	public static void main(String[] args) {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//create account by giving details
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Akshan");
	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Kumar");
	
	//filling up D.O.B using select tag
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='day']"));
	Select option=new Select(dropdown);
	
	option.selectByIndex(29);
	
	WebElement drop2 = driver.findElement(By.xpath("//select[@id='month']"));
	Select opt2=new Select(drop2);
	opt2.selectByIndex(0);
	
	WebElement drop3 = driver.findElement(By.xpath("//select[@id='year']"));
	Select opt3=new Select(drop3);
	opt3.selectByValue("2018");
	
	//gender select using non-select tag
	driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
	
	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("9444787878");
	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("demo123");
	
	driver.close();
	}}