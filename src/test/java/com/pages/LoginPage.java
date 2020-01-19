package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class LoginPage extends Base {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private List<WebElement> lstTxtUserName;

	@FindBy(id = "pass")
	private List<WebElement> lstTxtPassword;

	@FindBy(xpath = "//input[@value='Log In']")
	private List<WebElement> lstBtnLogin;

	public List<WebElement> getLstTxtUserName() {
		return lstTxtUserName;
	}

	public List<WebElement> getLstTxtPassword() {
		return lstTxtPassword;
	}

	public List<WebElement> getLstBtnLogin() {
		return lstBtnLogin;
	}

}
