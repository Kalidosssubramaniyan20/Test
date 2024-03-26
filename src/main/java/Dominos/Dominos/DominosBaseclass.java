package Dominos.Dominos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DominosBaseclass {
	
	
	public static void maxi(WebDriver driver) 
	{
		driver.manage().window().maximize();
		
	}
	
	public static void click(WebElement clk) {
		clk.click();
	}
	
	public static void Driver(WebElement raj,String Textbeon) {
		raj.sendKeys(Textbeon);
	}
	
	public static void Url(WebDriver driver,String Website) {
		driver.get(Website);
	}
	
	public static void select(WebDriver driver,WebElement dropdownElement,String value) {
		Select dropdown = new Select(dropdownElement);
		//dropdown.selectByIndex(0);
		dropdown.selectByValue(value);
		//dropdown.selectByVisibleText(value);
	
		
		
		  ;
	}


}
