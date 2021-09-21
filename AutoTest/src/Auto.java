import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto {
	public String signUp(String input1,String input2) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E://desktop/web/geckodriver.exe"); 
		WebDriver webDriver = new FirefoxDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.get("http://localhost:8080/final/register.jsp");
		webDriver.findElement(By.xpath("//input[@name='username']")).sendKeys(input1);
		webDriver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(input2);
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//input[@value='×¢²á']")).click();
		Thread.sleep(2000);
		String feedback=webDriver.findElement(By.xpath("//a")).getText();
		webDriver.quit();
		if("µÇÂ½½çÃæ".equals(feedback)) {
			return "SignUpSuccessful";
		}else{
			return "SignUpFailed";
		}
	}
}
