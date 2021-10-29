package t1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.WebBrowser;
import utility.WebElementMethods;

public class DynamicMenus {

	public static void main(String[] args) {/*
		WebDriver driver=WebBrowser.openBrowser("https:/www.istqb.org/");
		
		WebElement menu=driver.findElement(By.linkText("Certification"));
		Actions builder=new Actions(driver);
		
		builder.moveToElement(menu).perform();
		
		List<WebElement> submenus = driver.findElements(By.cssSelector("div.mega-inner>ul>li>a"));
		for(WebElement sb:submenus)
		{
			if(sb.getText().trim().equalsIgnoreCase("Acceptance Testing"))
			{
				sb.click();
				break;
			}
		}

		*/
//		Demo2
		/*
		WebDriver driver1=WebBrowser.openBrowser("http://demo.automationtesting.in/Register.html");
		WebElement mnu=driver1.findElement(By.linkText("SwitchTo"));
		Actions builder1=new Actions(driver1);
				
		builder1.moveToElement(mnu).perform();
		
		List<WebElement> submnu=driver1.findElements(By.cssSelector("ul.dropdown-menu>li>a"));
		for(WebElement sb1:submnu)
		{
			if(sb1.getText().trim().equalsIgnoreCase("Alerts"))
			{
				sb1.click();
				break;
			}
		}
		*/
//	Demo3
		WebDriver driver2=WebBrowser.openBrowser("http://demo.automationtesting.in/Register.html");
		WebElementMethods.selectMenu(driver2,By.partialLinkText("Interactions"), By.cssSelector("ul.dropdown-menu>li>a"), "Drag and Drop");
	}
	

}
