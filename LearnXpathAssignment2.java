package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathAssignment2 {

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
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    driver.findElement(By.xpath("//span[text()='Phone']")).click();
	    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9597000354");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    
			Thread.sleep(3000);
	    
	    String LeadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
	    System.out.println(LeadId);
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	    //driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()='Delete']")).click();
	    driver.findElement(By.xpath("//a[contains(text(), 'Find')]")).click();
	    driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadId);
	    driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
	    
	    //Verify message "No records to display" in the Lead List. This message confirms the successful deletion
	    
	    String expectedmessage = "No records to display";
	    String actualmessage = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
	    
	    if(actualmessage.equals (actualmessage)) {
	    	System.out.println("The Record is deleted successfully");

	    }else {System.out.println("The Record is not deleted");
	    }
	    	
	    }
	    
	    
			//Thread.sleep(3000);
			//driver.close();
	    
	}

	  

	    
	    
	  
	    
	   
	


