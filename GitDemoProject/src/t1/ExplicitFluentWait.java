package t1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitFluentWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		

		// manage is method webdriver In manage there is method timeouts
		// timeouts method return Timeouts in this interface method
		// implicitlyWait(long integer, TimeUnit);
		/*
		 * An implementation of the Wait interface that may have its timeout and polling
		 * interval configured on the fly. Each FluentWait instance defines the maximum
		 * amount of time to wait for a condition, as well as the frequency with which
		 * to check the condition. Furthermore, the user may configure the wait to
		 * ignore specific types of exceptions whilst waiting, such as
		 * NoSuchElementExceptions when searching for an element on the page.
		 */

driver.get("https://www.flipkart.com/search?q=Selenium+book&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&page=1");

		
		int count=1;
		while (isVisible(driver,By.xpath("//*[text()='Next']"))) {
			if (isVisible(driver,By.xpath("//*[@class='_4rR01T']"))) {
				List<WebElement> list = driver.findElements(By.xpath("//*[@class='_4rR01T']"));

				for (WebElement ele : list) {
					if (isVisible(driver, By.xpath("//*[@class='_4rR01T']"))) {
						for(int i=0;i<10;i++) {
						System.out.println(count+":"+ele.getText());
						count++;
						break;
						
						}
					}
				}

			}
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[text()='Next']")).click();
			Thread.sleep(5000);
		}
		
		
	}

	public static boolean isVisible(WebDriver driver, By by) {

		Wait<WebDriver> ft = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(60)).ignoring(NoSuchElementException.class);

		WebElement ele = ft.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {

				return driver.findElement(by);
			}
		});

		return ele.isDisplayed();
	}

}
/*
//Demo 2 Working properly
 
 
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait; //FluentWait is a Class and it is a part of this package
 
import com.google.common.base.Function;
 
public class ExplicitFluentWait {
	public static void main(String[] args) {
		fluentWaitMethod();
	}
	public static void fluentWaitMethod(){
		System.setProperty("webdriver.gecko.driver",".//lib//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	       .withTimeout(Duration.ofSeconds(30))
	       .pollingEvery(Duration.ofSeconds(5))
	       .ignoring(NoSuchElementException.class);
 
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(By.xpath("//*[@id=\"myAnchor\"]"));
				String getTextOnPage = element.getText();
				System.out.println(getTextOnPage);
				if(getTextOnPage.equals("www.SoftwareTestingMaterial.com")){
					System.out.println(getTextOnPage);
					return element;
				}else{
					System.out.println("FluentWait Failed");
					return null;
				}
			}
		});
	}
}*/