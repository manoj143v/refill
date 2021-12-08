package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test2.base;

public class sampojo extends base{

	public sampojo() {
 
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement login;
	
	@FindBy(name="pass")
	private WebElement pass;
	 
	@FindBy(name="login")
	private WebElement clckbtns;
	
	

	public WebElement getClckbtns() {
		return clckbtns;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	
}
