package week4.day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeAssignment1 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the url(https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt)
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		//handle the frame 
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Natesh");
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();
		
		String text2 = driver.findElement(By.xpath("//p[@id='demo']	")).getText();
		
		System.out.println(text2);
		
		
		
		
	}

}
