package swaglabsProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OrderPlace {

	
	WebDriver driver;
	public OrderPlace(WebDriver ldriver) {
		driver=ldriver;
	}
	By FirstName=By.name("firstName");
	By LastName=By.name("lastName");
	By code=By.id("postal-code");
	By Continue=By.id("continue");
	By Finish=By.id("finish");
	


public void FirstName(String Name) throws InterruptedException {
	driver.findElement(FirstName).sendKeys(Name);
		Thread.sleep(2000);
	}
	public void LastName(String LName) throws InterruptedException {
		driver.findElement(LastName).sendKeys(LName);
		Thread.sleep(2000);
	}
	public void CODE(String Code) throws InterruptedException {
		driver.findElement(code).sendKeys(Code);
		Thread.sleep(2000);
	}
	public void clickContinue() throws InterruptedException {
		driver.findElement(Continue).click();
		Thread.sleep(2000);
	
	

	}
	
		public void clickfinish() throws InterruptedException {
		driver.findElement(Finish).click();
		System.out.println(driver.findElement(By.xpath("//h2[@class='complete-header']")).getText());
		Thread.sleep(2000);
	}
	
		
	}




