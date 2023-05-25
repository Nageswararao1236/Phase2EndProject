package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	WebDriver driver = Hooks.driver;

	@Given("I launch the SauceLabs Application")
	public void i_launch_the_SauceLabs_Application() {
		driver.get("https://www.saucedemo.com/");

	}

	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String username) {
		driver.findElement(By.id("user-name")).sendKeys(username);
	}

	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("I cick on Login")
	public void i_cick_on_Login() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("I should be landed on Home Page")
	public void i_should_be_landed_on_Home_Page() {
		String SwaglabsTitle = driver.getTitle();
		Assert.assertEquals(SwaglabsTitle, "Swag Labs");
	}

	@When("I click on product name as {string}")
	public void i_click_on_product_name_as(String product) {
		driver.findElement(By.xpath("//div[contains(text(),'" + product + "')]")).click();
	}

	@When("I click on Add to cart")
	public void i_click_on_Add_to_cart() {
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

	}

	@When("I click on shopping cart")
	public void i_click_on_shopping_cart() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

	}

	@Then("I verify the cart item")
	public void i_verify_the_cart_item() {
		WebElement product = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		String ActName = product.getText();
		String ExpName = "Sauce Labs Bike Light";
		Assert.assertEquals(ActName, ExpName);
	}

}
