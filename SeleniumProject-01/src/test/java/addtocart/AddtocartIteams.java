package addtocart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import swaglabsTestPage.LoginTestRun;


public class AddtocartIteams extends LoginTestRun  {
	WebDriver driver;
	public  AddtocartIteams(WebDriver Ldriver) {
		driver=Ldriver;

	}
	By backpack=By.id("item_4_title_link");
	By addtocart=By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
	By shoppingcart=By.xpath("//div[@id='shopping_cart_container']/child::a");
	By continueShopping=By.xpath("//button[@id='continue-shopping']");
	By selectShirt=By.xpath("//a[@id='item_3_title_link']/child::div");
	By addToCart=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	By visiableItems= By.className("shopping_cart_link");
	By shoppingCart=By.xpath("//div[@id='shopping_cart_container']/child::a");
	By checkout=By.id("checkout");



public void clickBackpack() throws InterruptedException {
	driver.findElement(backpack).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    System.out.println("Select first Items:-"+driver.findElement(By.xpath("//div[@class='inventory_details_desc_container']/child::div")).getText());
}
public void clickAddtoCart() throws InterruptedException {
	driver.findElement(addtocart).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	System.out.println("Clicked AddToCartButton");
}
public void clickShoppingCart() throws InterruptedException {
	driver.findElement(shoppingcart).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
}
public void clickContinueShopping() throws InterruptedException {
	driver.findElement(continueShopping).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
public void clickShirt() throws InterruptedException {
	driver.findElement(selectShirt).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	System.out.println("Select Second Items:-"+driver.findElement(By.xpath("//div[@class='inventory_details_desc_container']/child::div")).getText());
}
public void clickAddToCart() throws InterruptedException {
	driver.findElement(addToCart).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	System.out.println("Clicked AddToCartButton");
}

public void clickShoppingcart() throws InterruptedException {
	driver.findElement(visiableItems);
	System.out.println("The Selected 2 products are shown in cart");
	driver.findElement(shoppingCart).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	System.out.println("Clicked cart");
}
public void clickCheckouts() throws InterruptedException {
	driver.findElement(checkout).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
}














}