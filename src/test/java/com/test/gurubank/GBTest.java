package com.test.gurubank;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page.GuruBank.GBHomePage;
import com.page.GuruBank.GBLoginpage;

public class GBTest extends BaseTest {
  @Test
  public void inittest() throws Exception {
	  GBLoginpage loginpage = PageFactory.initElements(driver, GBLoginpage.class);
	  loginpage.setUserID("mngr169688");
	  loginpage.setPassword("YzejUgE");
	  loginpage.clickonLOGINButton();
	  GBHomePage  homepage = PageFactory.initElements(driver, GBHomePage.class);
	  homepage.gethomePageUserNameText();
  }
}
