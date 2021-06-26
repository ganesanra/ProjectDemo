package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.base;

public class landingPage extends base {

	
	public WebDriver driver;
	
	public landingPage(WebDriver driver) {
		this.driver=driver;
	
	}
	

By selectprodectcategory	=By.name("product_cat");
By searchicon				= By.xpath("//i[@class='la la-search']");
By menswishlistitem1		=By.xpath("//*[(@data-product-id='16' and @data-title='Add to wishlist')]");
By menswishlistitem2		=By.xpath("//*[(@data-product-id='15' and @data-title='Add to wishlist')]");
By womenswishlistitem3		=By.xpath("//*[(@data-product-id='22' and @data-title='Add to wishlist')]");
By womenswishlistitem4		=By.xpath("//*[(@data-product-id='20' and @data-title='Add to wishlist')]");
                



public WebElement selectprodectcategory() {
return driver.findElement(selectprodectcategory);
}

public WebElement searchicon(){
return driver.findElement(searchicon);
}

public WebElement menswishlistitem1(){
return driver.findElement(menswishlistitem1);
}

public WebElement menswishlistitem2(){
return driver.findElement(menswishlistitem2);
}
public WebElement womenswishlistitem3(){
return driver.findElement(womenswishlistitem3);
}
public WebElement womenswishlistitem4(){
return driver.findElement(womenswishlistitem4);
}




}
