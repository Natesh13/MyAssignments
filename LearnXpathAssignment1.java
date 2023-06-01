package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		//1.Basic Xpath - Attribute based: //tagname[@attribute='attribute value']
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");

	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	 
	    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	    
	    //2.Basic Xpath Partial match - Attribute based: //tagname[contains(@attribute,'Partial attribute value')]
	    driver.findElement(By.xpath("//a[contains(text(), 'CRM')]")).click();
	    	
	    //3.Basic Xpath - Text based: //tagname[text()='text value']
	    driver.findElement(By.xpath("//a[text()='Leads']")).click();
	    
	    //4.Basic Xpath Partial match - Text based: //tagname[contains(text(), 'Partial text value')]
	    driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
	    
	    //5.Basic Xpath - Attribute based: //tagname[@attribute='attribute value']
	    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ZOHO");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("NATESH");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("KUMAR");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("nateshkumar.rajen@gmail.com");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9597000354");
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    
	    driver.close();
	    
	    
	     
	}

}
