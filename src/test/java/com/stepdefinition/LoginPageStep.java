package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep {
	WebDriver driver;

	@Given("User is on facebook page")
	public void user_is_on_facebook_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91994\\eclipse-workspace\\CucumberClass1030Am\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("User enters {string} , {string}")
	public void user_enters(String s1, String s2) {
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys(s1);

		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(s2);
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Log In']"));
		btnLogin.click();
	}

	@Then("verify success message")
	public void verify_success_message() {
		Assert.assertTrue(false);
		driver.quit();
	}

}
