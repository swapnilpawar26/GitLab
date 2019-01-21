import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","/home/swapni/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://openweathermap.org/");
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		driver.findElement(By.xpath("//form[@id='searchform']/div/input[1]")).sendKeys("mum");  //Travel from Parent to child to find xpath
		driver.findElement(By.xpath("//form[@id='searchform']//button[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-warning']")).getText());			
		
	}

}
