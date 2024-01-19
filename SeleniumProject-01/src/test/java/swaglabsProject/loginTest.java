package swaglabsProject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class loginTest{
	static WebDriver driver;
 
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	    MeanuItems m=new  MeanuItems (driver);
		AddtocartIteams addc=new AddtocartIteams(driver);
		OrderPlace OP=new OrderPlace (driver);
		logoutpage lo=new logoutpage(driver);
		String []user= {"standard_user","standard ","standard_user","standard_user","  ","  ","standard"};
    String []PASSWORD= {"secret_sauce","secret_sauce","selenium123","  ","selenium123","  ","selenium"};
		
	
	for(int i=0;i<7;i++) {
		System.out.println(user[i]+" "+PASSWORD[i]);
		try {
			
		    driver.findElement(By.id("user-name")).clear();
		    Thread.sleep(2000);
			driver.findElement(By.id("user-name")).sendKeys(user[i]);
			Thread.sleep(2000);
			driver.findElement(By.id("password")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys(PASSWORD[i]);
			Thread.sleep(2000);
			driver.findElement(By.id("login-button")).click();
			
			java.util.Set<String>s=driver.getWindowHandles();
			 for(String window: s ) {
				  driver.switchTo().window(window);
				  }
			m.clickMenu();
			m.clickAbout();
			m.clickMenus();
		    m.clickReset();
		    m.clickAllItems();
		    m.clickClose();
		    addc.clickBackpack();
		    addc.clickAddtoCart();
            addc.clickShoppingCart();
		    addc.clickContinueShopping();
		    addc.clickShirt();
		    addc.clickAddToCart();
		    addc.clickShoppingcart();
		    addc.clickCheckouts();
		    OP.FirstName("kanchan");
		    OP.LastName("yadav");
		    OP.CODE("442401");
            OP.clickContinue();
            OP.clickfinish();
            lo.clickMenu();
            lo.clickonLogOUTButton();
            System.out.println("Valid ");
		}catch(Exception e) {
			List <WebElement> Error=driver.findElements(By.xpath("//div[@class='error-message-container error']/child::h3")) ;
			for(WebElement error:Error) {
				System.out.println(error.getText());
				System.out.println("Test case passs");
				
			}
			
			
		}

	}
	}}