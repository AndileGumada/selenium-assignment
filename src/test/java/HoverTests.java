import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTest;

public class HoverTests extends BaseTest {

	@Test
	public void testHoverUser1() {
		var hoversPage= homePage.clickHovers();
		var caption = hoversPage.hoverOverFigure(1);
		
		assertTrue(caption.isCaptionDisplayed(),  "Caption not displayed");
		assertEquals(caption.getTitle(), "name: user1","Caption title incorrect");
		assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
		assertTrue(caption.getlink().endsWith("/users/1"), "Link incorrect");
	}
}
