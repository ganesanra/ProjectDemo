package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addToCartpage {
	
	public WebDriver driver;
	public addToCartpage(WebDriver driver) {
		this.driver=driver;
	
	}	
	
By AddtoCartlist=By.xpath(" //td[@class='product-add-to-cart']")  ;   
By leastaddtocart			=By.xpath("//a[@data-product_id='22']");
By addtocartbag				=By.xpath("//a[@title='Cart']");	
By pricelist				=By.xpath("//td[@class='product-price']/ins");	

public List<WebElement> AddtoCartlist() {
return driver.findElements(AddtoCartlist);

}

public WebElement addtocartbag() {
return driver.findElement(addtocartbag);

}
public List<WebElement> pricelist() {
return driver.findElements(pricelist);

}
}
