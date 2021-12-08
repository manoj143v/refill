package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test2.base;

public class flip extends base{
	public flip() {
PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement phno;

	@FindBy(xpath="//input[@type='password']")
	private WebElement pswd;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement lgntbn;

	
	

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getLgntbn() {
		return lgntbn;
	}
	
	
}
