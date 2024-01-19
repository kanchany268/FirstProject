package swaglabsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logoutpage {
	WebDriver driver;
	public  logoutpage(WebDriver ldriver) {
		driver=ldriver;
	}
	By menu=By.xpath("//div[@class='bm-burger-button']");
	By logout=By.xpath("//a[@id='logout_sidebar_link']");
    
  public void clickMenu() throws InterruptedException {

    	driver.findElement(menu).click();
        Thread.sleep(2000);
  }
public void clickonLogOUTButton() throws InterruptedException {
	driver.findElement(logout).click();
	Thread.sleep(2000);

}



}




