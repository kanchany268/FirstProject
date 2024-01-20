package orderPlacePage;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import swaglabsTestPage.LoginTestRun;



public class OrderPlace extends LoginTestRun {

	
	WebDriver driver;
	public OrderPlace(WebDriver rdriver) {
		driver=rdriver;
	}
	By firstName=By.name("firstName");
	By lastName=By.name("lastName");
	By code=By.id("postal-code");
	By Continue=By.id("continue");
	By finish=By.id("finish");
	


public void FirstName(String name) throws InterruptedException {
	driver.findElement(firstName).sendKeys(name);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	public void LastName(String lname) throws InterruptedException {
		driver.findElement(lastName).sendKeys(lname);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	public void CODE(String Code) throws InterruptedException {
		driver.findElement(code).sendKeys(Code);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	public void clickContinue() throws InterruptedException {
		driver.findElement(Continue).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
	

	}
	
		public void clickfinish() throws InterruptedException {
		driver.findElement(finish).click();
		System.out.println(driver.findElement(By.xpath("//h2[@class='complete-header']")).getText());
		Thread.sleep(2000);
	}
	
		
	}




