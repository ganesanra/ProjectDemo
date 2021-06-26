package stepdefinitions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.addToCartpage;
import pageObjects.landingPage;
import pageObjects.wishlistpage;

public class stepDefinition {

	public static WebDriver driver;
	Double minPrice;
	ArrayList<Double> prices = new ArrayList<Double>();

	@Before()

	public void browsersetup() {

		System.setProperty("webdriver.chrome.driver", "//Users//ganesan//Downloads//chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://testscriptdemo.com");

	}

	@Given("^I add four different products to my wish list$")
	public void i_add_four_different_products_to_my_wish_list() throws Throwable {

		landingPage lp = new landingPage(driver);
		Select category = new Select(lp.selectprodectcategory());
		category.selectByValue("womens-clothing");
		lp.searchicon().click();
		lp.womenswishlistitem3().click();
		Thread.sleep(2000);
		lp.womenswishlistitem4().click();
		lp.searchicon().click();
		lp.menswishlistitem1().click();
		lp.menswishlistitem2().click();

	}

	@When("^I 	view my wishlist table$")
	public void i_view_my_wishlist_table() throws Throwable {
		wishlistpage wp = new wishlistpage(driver);
		wp.wishlisticon().click();

	}

	@When("^I search for the lowest price product$")
	public void i_search_for_the_lowest_price_product() throws Throwable {
		wishlistpage wp = new wishlistpage(driver);

		for (int i = 0; i < wp.pricelist().size(); i++) {

			String[] PriceinEuro = wp.pricelist().get(i).getText().split("£");
			double price = Double.parseDouble(PriceinEuro[1]);
			prices.add(price);

		}

	}

	@Then("^I  find total \"([^\"]*)\" selected items in my wishlist$")
	public void i_find_total_something_selected_items_in_my_wishlist(String count) throws Throwable {
		wishlistpage wp = new wishlistpage(driver);
		int Actualcount = wp.pricelist().size();

		Assert.assertEquals(Actualcount, Integer.parseInt(count));

	}

	@When("I am able to add the lowest price item to my cart")
	public void i_am_able_to_add_the_lowest_price_item_to_my_cart() {
		addToCartpage ap = new addToCartpage(driver);
		minPrice = Collections.min(prices);

		for (int i = 0; i < ap.pricelist().size(); i++) {
			String[] PriceinEuro = ap.pricelist().get(i).getText().split("£");
			double price = Double.parseDouble(PriceinEuro[1]);
			if (price == minPrice) {
				ap.AddtoCartlist().get(i).click();
				break;
			}

		}

	}

	@Then("I am able to verify the item in my cart")
	public void i_am_able_to_verify_the_item_in_my_cart() throws Exception {
		addToCartpage ap = new addToCartpage(driver);
		Thread.sleep(2000);
		ap.addtocartbag().click();

	}

	
	 @After() public void bteardown() { driver.quit(); }
	 

}
