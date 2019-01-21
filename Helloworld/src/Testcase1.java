import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/home/swapni/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://openweathermap.org/"); 
		
		driver.getTitle();
		System.out.println(driver.getTitle());   //Validate current URL title
		System.out.println(driver.getCurrentUrl()); //Validate if you landed on correct URL
		if (driver.getTitle().equalsIgnoreCase("Сurrent weather and forecast - OpenWeatherMap"))
		{
			System.out.println("We are landed on correct URL");
		}
		
		else
		{
			System.out.println("We are landed on wrong URL ");
		}
	}

}
