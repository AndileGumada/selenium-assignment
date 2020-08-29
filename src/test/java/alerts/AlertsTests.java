package alerts;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTest;

public class AlertsTests extends BaseTest {

	@Test
	public void testAcceptAlert() {
		var alertsPage = homePage.clickJavaScriptAlerts();
		alertsPage.triggerAlert();
		alertsPage.alert_clickToAccept();
		alertsPage.getResults();
		assertEquals(alertsPage.getResults(), "You successfuly clicked an alert","Results incorrect");
	}
	@Test
	public void testGetText() {
		var alertsPage = homePage.clickJavaScriptAlerts();
		alertsPage.triggerConfirm();
		String text = alertsPage.alert_getText();
		alertsPage.alert_clickToDismiss();
		assertEquals(text, "I am a JS Confirm","Alret text incorrect");
	}
	@Test
	public void name() {
		var alertsPage = homePage.clickJavaScriptAlerts();
		alertsPage.triggerPrompt();
		
		String text = "Keep pushing";
		alertsPage.alert_setInput(text);
		alertsPage.alert_clickToAccept();
		assertEquals(alertsPage.getResults(),"You entered: "+text, "Result incorrect text");
	}
}
