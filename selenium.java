import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
 

public class selenium {

	@Test
	public static void main() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Hi, Welcome to Jenkins!");
		
		driver.navigate().to("https://amazon.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nike Shoes");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().back();
		String title= driver.getTitle();
		System.out.println("Page Title is: "+ title);
		
		driver.navigate().to("https://facebook.com");
		driver.findElement(By.name("email")).sendKeys("456vidya@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("@iloveumanu624");
        driver.findElement(By.id("loginbutton")).click();
        
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        
		

	}

}
