package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	   WebElement Email=driver.findElement(By.xpath("//*[@id='email']"));
	   Email.sendKeys("ahsfdhsfdh@gmail.com");
	   driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("sneha@21");
	
	   driver.findElement(By.xpath("//*[@name='login']")).click();


	   System.out.println("this code is changed by sneha from eclipse");

	        System.out.println("Hi this is user two");
	        System.out.println("Good eveing ");

	        System.out.println("hii how are you ");
     
        int a=10;
  int b=20;
int c=a+b;
System.out.println(c);



	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
