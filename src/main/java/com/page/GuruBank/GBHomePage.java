package com.page.GuruBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GBHomePage {
	WebDriver driver;
	public GBHomePage(WebDriver driver){
		this.driver = driver;
	}
	@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")WebElement homePageUserNameText;
	public  String  gethomePageUserNameText() {
		return homePageUserNameText.getText();
	}

}