package swaglabsTestPage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import addtocart.AddtocartIteams;
import io.github.bonigarcia.wdm.WebDriverManager;
import logoutPage.logoutpage;
import menuitemsPage.MeanuItems;
import orderPlacePage.OrderPlace;

public class LoginTestRun {
	
	WebDriver driver;
	 
	@BeforeMethod
	public void LanchuBrowser(){
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(dataProvider = "datavalues",dataProviderClass = Allvalues .class)
	public void login(String username,String password) {
		try {
		driver.findElement(By.id("user-name")).clear();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("user-name")).sendKeys(username);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("password")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("password")).sendKeys(password);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("login-button")).click();
		java.util.Set<String>s=driver.getWindowHandles();
		 for(String window: s ) {
			  driver.switchTo().window(window);
			  }
		 MeanuItems m=new  MeanuItems (driver);
	     AddtocartIteams addc=new AddtocartIteams(driver);
	     OrderPlace op=new OrderPlace (driver);
		 logoutpage lo=new logoutpage(driver);
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
	    op.FirstName("kanchan");
	    op.LastName("yadav");
	    op.CODE("442401");
        op.clickContinue();
        op.clickfinish();
        lo.clickMenu();
        lo.clickonLogOUTButton();
       System.out.println("Valid ");
	}catch(Exception e) {
		List <WebElement> error=driver.findElements(By.xpath("//div[@class='error-message-container error']/child::h3")) ;
		for(WebElement errormsg:error) {
			System.out.println(errormsg.getText());
			System.out.println("Test case passs");
			
		}
		
	}
		
		
	}
	
	}


