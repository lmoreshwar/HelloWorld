import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowser {
public static void main(String[] args) throws Throwable {

	
	
	//System.out.println("Hello World");
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\E002985\\Documents\\geckodriver.exe");
	WebDriver d = new FirefoxDriver();
	d.get("https://www.google.com");
	d.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("Times of india");
	Thread.sleep(5000);
	d.findElement(By.xpath(".//*[@id='_fZl']")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/table/tbody/tr[2]/td[2]/div/span/h3/a")).click();
	Thread.sleep(5000);
	d.close();
	
	
		/*
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\E002985\\Downloads\\chromedriver.exe");
		 d = new ChromeDriver();
		 d.get("https://www.youtube.com");
 		d.quit();*/ 
}

}
