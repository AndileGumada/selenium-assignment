package login;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTest {
	
		@Test
		public void testSuccessfulLogin() {
		LoginPage loginPage = homePage.clickFormAuthentication();
		loginPage.setUsername("tomsmith");
		loginPage.setPassword("SuperSecretPassword!");
		
		SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

		assertTrue(secureAreaPage.getAlertText()
                .contains("You logged into a secure area!"),
                "Alert text is incorrect");
		
		}
}
