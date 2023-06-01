package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadUsingAdvanceXpath {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Enter the username (using ES-YS Xpath)
		driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("demosalesManager");
		//Enter the password (using ES-YS)
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		//Click Login (using EC-YC)
		driver.findElement(By.xpath("//input[@id='password']/following::input")).click();
		//Click crm/sfa link (using P-C) 
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		//Click Leads link (using GP-GC)
		driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']//a")).click();
		//Click on Create Lead(using EC-YC)
		driver.findElement(By.xpath("//a[text()='My Leads']/following::a")).click();
		//Enter company name(using EC-YC)
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input")).sendKeys("Infosys");
		//Enter First name(using EC-YC)
		driver.findElement(By.xpath("//span[text()='First name']/following::input")).sendKeys("Natesh");
		//Enter Last name(using EC-YC)
		driver.findElement(By.xpath("//span[text()='Last name']/following::input")).sendKeys("Kumar");
		//click on Create Lead button 
		driver.findElement(By.name("submitButton")).click();
		//Click Edit (using YS-ES[index])
		driver.findElement(By.xpath("(//a[text()='Delete']/preceding-sibling::a)[3]")).click();
		//Change the company name (using EC-YC)
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input")).clear();
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input")).sendKeys("Capgemini");
		//Click Update
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}
}
		
		
	
		
		
		
	
	
		
		
		

		


		
	



