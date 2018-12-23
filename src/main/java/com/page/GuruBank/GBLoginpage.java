package com.page.GuruBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GBLoginpage {
	WebDriver driver;
	//Constructor//
	public GBLoginpage(WebDriver driver){
		this.driver = driver;
	}
	//Using FindBy for locating elements
	@FindBy(how=How.XPATH, using="/html/body/form/table/tbody/tr[1]/td[2]/input")WebElement UserIDTexBox;
	@FindBy(how=How.XPATH, using="/html/body/form/table/tbody/tr[2]/td[2]/input")WebElement PasswordTextBox;
	@FindBy(how=How.XPATH, using="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")WebElement LOGINButton;
	@FindBy(how=How.XPATH,using="/html/body/div[2]/h2")WebElement LOGINTitle;
	// Defining all the user actions (Methods) that can be performed in the Guru99 home page
	 
    // This method is to set UserID in the UserID text box 
	public void setUserID(String strUserID){
		UserIDTexBox.sendKeys(strUserID);
	}
     public void setPassword(String strPassword){
    	 PasswordTextBox.sendKeys(strPassword);
     }
     public void clickonLOGINButton(){
    	 LOGINButton.click();
}
     public void  getLOGINTitle() {
    	 LOGINTitle.getText();
		
	}
}
