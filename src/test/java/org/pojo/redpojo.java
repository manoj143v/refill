package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test2.base;


public class redpojo extends base{
	public  redpojo() {
		 
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="signin-block")
	private WebElement sigininbtn;
	
	@FindBy(id="signInLink")
	private WebElement singin;
	
	
	
	public WebElement getSingin() {
		return singin;
	}
	public WebElement getSigininbtn() {
		return sigininbtn;
	}
	
	
}
