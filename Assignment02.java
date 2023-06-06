package week4.day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment02 {

	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
        //1.  alert (simple dialog):
		
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//gives control from driver to alert
		Alert alert = driver.switchTo().alert();
		//gettext
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();
		
		String t2 = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println(t2);
		
		//2.Alert (confirm dialog):  
		
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		//change the control from driver to alert
		Alert alert1 = driver.switchTo().alert();
		String text1 = alert1.getText();
		System.out.println(text1);
		
		Thread.sleep(3000);
		alert.accept();
		
		String t3 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(t3);
		
		//3. Alert (Sweet dialog):
				driver.get("https://www.leafground.com/alert.xhtml");
				driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
				
	    //4. Sweet model dialog:
				driver.get("https://www.leafground.com/alert.xhtml");
				driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
				
	    //5. Alert (Prompt dialog)
				
				driver.get("https://www.leafground.com/alert.xhtml");
				driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
				
				//gives control fro driver to alert
				Alert alert2 = driver.switchTo().alert();
				
				//get text from alert
				String text2 = alert2.getText();
				System.out.println(text2);
				
				Thread.sleep(3000);
				alert.sendKeys("Natesh");
				alert.accept();
				
				String t4 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
				System.out.println(t4);	
				
		//6. Sweet Alert (Confirmation)
				
				driver.get("https://www.leafground.com/alert.xhtml");
				driver.findElement(By.xpath("//span[text()='Delete']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='Yes']")).click();
				
		//7. (Minimize and Maximize)
				
				driver.get("https://www.leafground.com/alert.xhtml");
				driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-extlink']")).click();
				
				
				
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
					
				
				
  }

}
