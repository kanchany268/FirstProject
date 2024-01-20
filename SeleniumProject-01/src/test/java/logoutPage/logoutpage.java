package logoutPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import swaglabsTestPage.LoginTestRun;



public class logoutpage extends LoginTestRun {
	WebDriver driver;
	public  logoutpage(WebDriver rdriver) {
		driver=rdriver;
	}
	By menu=By.xpath("//div[@class='bm-burger-button']");
	By logout=By.xpath("//a[@id='logout_sidebar_link']");
    
  public void clickMenu() throws InterruptedException {

    	driver.findElement(menu).click();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }
public void clickonLogOUTButton() throws InterruptedException {
	driver.findElement(logout).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

}



}




