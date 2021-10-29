package t1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.WebBrowser;
import utility.WebElementMethods;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=WebBrowser.openBrowser("https://jqueryui.com/droppable/");
//		driver.switchTo().frame(0);
		
		WebElement frame=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		Actions builder=new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		
		String text=driver.findElement(By.cssSelector("div#droppable>p")).getText();
		if(text.equals("Dropped!"))
		{
			System.out.println("Done");
		}
		
		driver.close();
	}

}
