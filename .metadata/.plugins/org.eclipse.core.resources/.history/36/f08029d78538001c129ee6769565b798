package t1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * When we test for alert it is called as yellow-box testing
 * Alert is java-script or window message 
 * Confrim alert is alert which display information where we can  accept(ok) or deny(Cancel)
 * */
public class ConfirmAlert1 {

	public static void main(String[] args) {
		// To handle alert(javascript) in selenium webdriver there is interface Alert
		//WebDriver is parent interface which is implemented in chromedriver class
		
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get(String arg0)  load new webpage  in current browser window
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		
		
		
		try {
			Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert=driver.switchTo().alert();
		String expected="Press a Button !";
		String actual=alert.getText();
		
		System.out.println(actual);
		if(expected.equals(actual)) {
			System.out.println("both matches");
		}
		//Cancel button click
		Thread.sleep(5000);
		alert.dismiss();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
