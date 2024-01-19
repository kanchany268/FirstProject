package swaglabsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MeanuItems {
	WebDriver driver;

public MeanuItems(WebDriver Ldriver) {
	driver=Ldriver;
}

    By menu=By.xpath("//div[@class='bm-burger-button']");
    By About=By.id("about_sidebar_link") ;
    By ResetAppState=By.id("reset_sidebar_link"); WebElement Reset;
	By AllItems=By.id("inventory_sidebar_link");
	By close=By.id("react-burger-cross-btn");

public void clickMenu() throws InterruptedException {

	driver.findElement(menu).click();
    Thread.sleep(2000);

}

   public void clickAbout() throws InterruptedException {
	driver.findElement(About).click();

	java.util.Set<String>s=driver.getWindowHandles();
	 for(String window: s ) {
		  driver.switchTo().window(window);
		  }
	 String actualTittle=driver.getTitle();
     String ExpectedTittle="Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing";
     		if(ExpectedTittle.equalsIgnoreCase(actualTittle))

     		{
     			System.out.println(actualTittle);
     			System.out.println("Test case passs");
     		}
     		else
     		{
     			System.out.println("Test case fail");
     		}

	driver.navigate().back();
	Thread.sleep(2000);
}
public void clickMenus() throws InterruptedException {

	driver.findElement(menu).click();
	Thread.sleep(2000);


}
	public void clickReset() throws InterruptedException {
	driver.findElement(ResetAppState).click();
	Thread.sleep(2000);

	}



public void clickAllItems() throws InterruptedException {
	driver.findElement(AllItems).click();
	Thread.sleep(2000);

}
public void clickClose() throws InterruptedException {
	driver.findElement(close).click();
	Thread.sleep(3000);
}
}


