package alerts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTest;

public class FileUploadTests extends BaseTest{

	@Test
	public void testFileUpload() {
		var uploadPage = homePage.clickFileUpload();
		uploadPage.uploadFile("/home/andile/Documents/Development/WebDriver/webDriver/resources/chromedriver");
		assertEquals(uploadPage.getUploadedFiles(), "chromedriver","Uploaded");
	}
}
