package week4.day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcAlert {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//)Load the url https://www.irctc.co.in/nget/train-search
		driver.get("https://www.irctc.co.in/nget/train-search");
		//Enter MS in ‘From’ textbox
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("MS");
		driver.findElement(By.xpath("//span[text()='CHENNAI EGMORE - MS']")).click();
		//Enter Cape in ‘To’ textbox
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("cape");
		driver.findElement(By.xpath("//span[text()='KANYAKUMARI - CAPE']")).click();
		//Thread.sleep(3000);	
		//Click search button
		driver.findElement(By.xpath("//button[@class='search_btn train_Search']")).click();
		//Click refresh button
		driver.findElement(By.xpath("//div[@class='col-xs-12 link']")).click();
		//Click WL and Click BookNow button
		driver.findElement(By.xpath("//div[@class='WL col-xs-12']")).click();
		driver.findElement(By.xpath("//button[text()=' Book Now ']")).click();
		//Click No button in the alert
		driver.findElement(By.xpath("//span[text()='No']")).click();
		
		
		
	
		
		

		
	
	
		
		
		
		
		
		
	}

}
