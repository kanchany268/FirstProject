package menuitemsPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import swaglabsTestPage.LoginTestRun;


public class MeanuItems extends LoginTestRun  {
	WebDriver driver;

public MeanuItems(WebDriver ldriver) {
	driver=ldriver;
}

    By menu=By.xpath("//div[@class='bm-burger-button']");
    By about=By.id("about_sidebar_link") ;
    By resetappstate=By.id("reset_sidebar_link"); WebElement Reset;
	By allitems=By.id("inventory_sidebar_link");
	By close=By.id("react-burger-cross-btn");

public void clickMenu() throws InterruptedException {

	driver.findElement(menu).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

}

   public void clickAbout() throws InterruptedException {
	driver.findElement(about).click();

	java.util.Set<String>s=driver.getWindowHandles();
	 for(String window: s ) {
		  driver.switchTo().window(window);
		  }
	 String actualTittle=driver.getTitle();
     String expectedTittle="Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing";
     		if(expectedTittle.equalsIgnoreCase(actualTittle))

     		{
     			System.out.println(actualTittle);
     			System.out.println("Test case passs");
     		}
     		else
     		{
     			System.out.println("Test case fail");
     		}

	driver.navigate().back();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
}
public void clickMenus() throws InterruptedException {

	driver.findElement(menu).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));


}
	public void clickReset() throws InterruptedException {
	driver.findElement(resetappstate).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

	}



public void clickAllItems() throws InterruptedException {
	driver.findElement( allitems).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

}
public void clickClose() throws InterruptedException {
	driver.findElement(close).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
}
}


