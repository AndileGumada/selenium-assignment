package frames;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTest;

public class FrameTest extends BaseTest {

	@Test
	public void testWiswyg() {
		
		var editorPage = homePage.clickWysiwygEditor();
		editorPage.clearTextArea();
		
		String text1 = "hello";
		String text2 = "world";
		
		editorPage.setTextArea(text1);
		editorPage.decreaseIndention();
		editorPage.setTextArea(text2);
		
		assertEquals(editorPage.getTextFromEditor(), text1+text2,"Text from editor incorrect");
	}
	
}
