package exercises.chapter7.contextmenu;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTest;

public class ContextMenuTests extends BaseTest {

	@Test
	public void textRightClick() {
		var menuPage = homePage.clickContextMenu();
		menuPage.rightClickInBox();
		String message = menuPage.getPopupText();
		menuPage.acceptPopUp();
		assertEquals(message, "You selected a context menu","Popup message incorrect ");
	}
}
