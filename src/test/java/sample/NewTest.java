package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();  
	  driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	  WebElement gmail= driver.findElement(By.id("identifierId"));
	  gmail.sendKeys("msbalan888@gmail.com");
	  WebElement next=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content"));
	  next.click();
	  
	  
  }
}
  
  
