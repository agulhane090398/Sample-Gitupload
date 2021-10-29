package t1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.WebBrowser;

public class DragBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=WebBrowser.openBrowser("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		
		Actions builder=new Actions(driver);
		Point loc=source.getLocation();
		
		builder.dragAndDropBy(source, loc.getX()+50	, loc.getY()+40).perform();
		System.out.println("Currrent position "+loc.getX()+","+loc.getY());
		
		loc=source.getLocation();
		builder.dragAndDropBy(source, loc.getX()+60	, loc.getY()+0).perform();
		loc=source.getLocation();
		System.out.println("Currrent position "+loc.getX()+","+loc.getY());

		loc=source.getLocation();
		builder.dragAndDropBy(source, loc.getX()+0	, loc.getY()-30).perform();
		loc=source.getLocation();
		System.out.println("Currrent position "+loc.getX()+","+loc.getY());

		
		
		builder.clickAndHold(source);
		loc=source.getLocation();
		System.out.println("Currrent position "+loc.getX()+","+loc.getY());

		builder.moveByOffset(50, 50);
		loc=source.getLocation();
		System.out.println("Currrent position "+loc.getX()+","+loc.getY());

		builder.release().perform();
		loc=source.getLocation();
		System.out.println("Currrent position "+loc.getX()+","+loc.getY());

		
	}

}
