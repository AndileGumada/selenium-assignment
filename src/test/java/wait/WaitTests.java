package wait;

import static org.junit.Assert.*;

import org.testng.annotations.Test;

import base.BaseTest;

public class WaitTests extends BaseTest{

	@Test
	public void testWaitUntilHidden() {
		var loadingPage = homePage.clickDynamicLoading().clickExample1();
		loadingPage.clickStart();
		assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
	}
	@Test
	public void testWaitUntilVisible(){
		var loadingPage = homePage.clickDynamicLoading().clickExample2();
		loadingPage.clickStart();
		assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
	}
}
