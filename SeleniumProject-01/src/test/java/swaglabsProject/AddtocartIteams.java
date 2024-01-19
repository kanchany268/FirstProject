package swaglabsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtocartIteams {
	WebDriver driver;
	public  AddtocartIteams(WebDriver Ldriver) {
		driver=Ldriver;

	}
	By Backpack=By.id("item_4_title_link");
	By Addtocart=By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
	By Shoppingcart=By.xpath("//div[@id='shopping_cart_container']/child::a");
	By ContinueShopping=By.xpath("//button[@id='continue-shopping']");
	By SelectShirt=By.xpath("//a[@id='item_3_title_link']/child::div");
	By AddToCart=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	By VisiableItems= By.className("shopping_cart_link");
	By ShoppingCart=By.xpath("//div[@id='shopping_cart_container']/child::a");
	By Checkout=By.id("checkout");



public void clickBackpack() throws InterruptedException {
	driver.findElement(Backpack).click();
Thread.sleep(2000);
System.out.println("Select first Items:-"+driver.findElement(By.xpath("//div[@class='inventory_details_desc_container']/child::div")).getText());
}
public void clickAddtoCart() throws InterruptedException {
	driver.findElement(Addtocart).click();
	Thread.sleep(3000);
	System.out.println("Clicked AddToCartButton");
}
public void clickShoppingCart() throws InterruptedException {
	driver.findElement(Shoppingcart).click();
	Thread.sleep(3000);
}
public void clickContinueShopping() throws InterruptedException {
	driver.findElement(ContinueShopping).click();
	Thread.sleep(3000);
}
public void clickShirt() throws InterruptedException {
	driver.findElement(SelectShirt).click();
	Thread.sleep(4000);
	System.out.println("Select Second Items:-"+driver.findElement(By.xpath("//div[@class='inventory_details_desc_container']/child::div")).getText());
}
public void clickAddToCart() throws InterruptedException {
	driver.findElement(AddToCart).click();
	Thread.sleep(5000);
	System.out.println("Clicked AddToCartButton");
}

public void clickShoppingcart() throws InterruptedException {
	driver.findElement(VisiableItems);
	System.out.println("The Selected 2 products are shown in cart");
	driver.findElement(ShoppingCart).click();
	Thread.sleep(5000);
	System.out.println("Clicked cart");
}
public void clickCheckouts() throws InterruptedException {
	driver.findElement(Checkout).click();
	Thread.sleep(5000);
}














}