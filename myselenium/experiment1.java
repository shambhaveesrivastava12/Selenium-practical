package myselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class experiment1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.gecko.driver","C:\\Users\\SAMBHAVI SHRIVASTAVA\\OneDrive\\Desktop\\Test Automation\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		WebDriver obj= new FirefoxDriver();
		obj.manage().window().maximize();
		obj.get("https://www.google.co.in/");
    }
}
