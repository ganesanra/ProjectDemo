package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wishlistpage {
public WebDriver driver;
	
	public wishlistpage(WebDriver driver) {
		this.driver=driver;
	
	}
		
	By wishlisticon				=By.xpath("(//a[@title='Wishlist'])[1]");
	By pricelist				=By.xpath("//td[@class='product-price']/ins");
	
	By Itemsrowlist				=By.xpath("//tbody[@class='wishlist-items-wrapper']/tr");
               

	public WebElement wishlisticon(){
		return driver.findElement(wishlisticon);
		}	

public List<WebElement> pricelist() {
return driver.findElements(pricelist);

}
public List<WebElement> Itemsrowlist() {
return driver.findElements(Itemsrowlist);

}




}
