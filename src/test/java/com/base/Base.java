package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91994\\eclipse-workspace\\CucumberClass1030Am\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}

	public void loadUrl(String url) {
		driver.get(url);

	}

	public String getUrl() {
		return driver.getCurrentUrl();

	}

	public void setText(String name, WebElement element) {
		element.sendKeys(name);
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
