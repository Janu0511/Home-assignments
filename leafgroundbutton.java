package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafgroundbutton {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Click and Confirm title
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		//verify title
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		//Confirm if the button is disabled
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt90']")).isEnabled();

		WebElement element = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));  
		Point location = element.getLocation();  
		
		//System.out.println("X: " + location.getX() + " Y: " + location.getY());
		System.out.println("location is " +location);
		
		//background color
		WebElement element2 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
		String color = element2.getCssValue("color");
		System.out.println("color is:" +color);
		
		WebElement element3 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]"));
		Dimension size = element3.getSize();
		System.out.println("Size is:" +size);
		
		driver.close();
	}

}
