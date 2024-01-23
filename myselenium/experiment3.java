package myselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class experiment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.gecko.driver","C:\\Users\\SAMBHAVI SHRIVASTAVA\\OneDrive\\Desktop\\Test Automation\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		WebDriver obj= new FirefoxDriver();
		obj.manage().window().maximize();
		obj.get("file:///C:/Users/SAMBHAVI%20SHRIVASTAVA/Downloads/monica-1.0.0/monica-1.0.0/helloworld.html");
		WebElement placeholder = obj.findElement(By.id("textbox"));
		placeholder.sendKeys("hello there");
	}

}
