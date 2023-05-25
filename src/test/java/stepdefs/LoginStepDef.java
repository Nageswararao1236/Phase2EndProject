package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
WebDriver driver = Hooks.driver;

	@Given("I  launch the SwagLabs Application")
	public void i_launch_the_SwagLabs_Application() {
		driver.get("https://www.saucedemo.com/");
	}

	@When("I  enter the username as {string}")
	public void i_enter_the_username_as(String username) {
		driver.findElement(By.id("user-name")).sendKeys(username);
	}

	@When("I  enter the password as {string}")
	public void i_enter_the_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("I should be landed on products page")
	public void i_should_be_landed_on_products_page() {
		String SwaglabsTitle=driver.getTitle();
		Assert.assertEquals(SwaglabsTitle, "Swag Labs");
	}

	@Then("I should get the error as {string}")
	public void i_should_get_the_error_as(String errors) {
		WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String AcError = error.getText();
		System.out.println(AcError);
		Assert.assertEquals(AcError, errors);
	}



}
