package t1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.WebBrowser;

public class AlertWithWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=WebBrowser.openBrowser("https://demoqa.com/alerts");
		
		driver.findElement(By.id("timeAlertButton")).click();
		
		try {
			Alert a=driver.switchTo().alert();
			a.accept();
		}
		catch (NoAlertPresentException e) {
			// TODO: handle exception
			WebDriverWait wait=new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert a=driver.switchTo().alert();
			a.accept();
		}
	}

}
