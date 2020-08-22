package keys;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.KeyPressesPage;

public class KeysTests extends BaseTest{

	@Test
	public void testBackspace() {
		var keyPage = homePage.clickKeyPresses();
		keyPage.enterText("A"+ Keys.BACK_SPACE);
		assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");	
	}
	@Test
	public void testPi(){
		var keypage = homePage.clickKeyPresses();
		keypage.enterPi();
	}
	
}
