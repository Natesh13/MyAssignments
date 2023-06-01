package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookUsingAdvanceXpath {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://en-gb.facebook.com/");
		
		// Click on Create New Account button (P-C)
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		//Enter the first name 
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Steffy");
		//Enter the surname name (ES-YS)
		driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("Angel");
		//Enter the mobile number(ES-YS)
		driver.findElement(By.xpath("//div[contains(text(),'Mobile')]/following-sibling::input")).sendKeys("9597000354");
		//Enterthe password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Natesh@1314");
		
		// Handle all the three drop downs
		WebElement ss = driver.findElement(By.id("day"));
		Select srkv=new Select(ss);
		srkv.selectByIndex(12);
		
		WebElement ss1 = driver.findElement(By.id("month"));
		Select srkv1=new Select(ss1);
		srkv1.selectByVisibleText("Feb");
		
		WebElement ss2 = driver.findElement(By.id("year"));
		Select srkv2=new Select(ss2);
		srkv2.selectByValue("1990");
		
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		
		Thread.sleep(3000);
		driver.close();
	}
}
		
	
		
		
		
	
