package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\ganesh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://technogise.com/");
	
		driver.manage().window().maximize();
	
WebElement k=driver.findElement(By.xpath("//img[@id='hamburgmenu']"));
		
		k.click();
String text= driver.findElement(By.xpath("//div[@class='LandMainMenuList container-fluid']")).getText();
System.out.println(text);
WebElement k2=driver.findElement(By.xpath("//div[@class='contactUsLink']"));
k2.click();
Thread.sleep(5000);
driver.switchTo().frame(0);
String Address= driver.findElement(By.xpath("//div[@class='place-desc-large']")).getText();
System.out.println(" Company Address="+Address);
	}

}
