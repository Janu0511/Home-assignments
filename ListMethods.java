 package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListMethods {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        driver.get("https://www.facebook.com/");
        
        //find how many a tags element present
        List<WebElement> totallink = driver.findElements(By.tagName("a"));
        int size = totallink.size();
        System.out.println("The total link presentis:" +size);
        
        //to get a tag text 
        for (int i = 0; i < totallink.size() ; i++) {
        	System.out.println(totallink.get(i).getText());
			
		}

	}

}
