package day6.propertyfilecalendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.SeleniumUtil;

public class ValidateColorCode {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		
		WebElement signinButton=driver.findElement(By.id("submitbtn"));
		//selenium get the color in RGBA format
		String buttonTextColorCode=signinButton.getCssValue("color");
		String buttonColorCode=signinButton.getCssValue("background-color");//
		String buttonFontSize=signinButton.getCssValue("font-size");
		System.out.println("Button text color code: "+buttonTextColorCode);
		System.out.println("Color code: "+buttonColorCode);
		System.out.println("Button font-size: "+buttonFontSize);

	}

}
