package dropdown;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DropdownPage;

public class DropDownTests extends BaseTest {
	
	 String option;

	@Test
	public void testSelectedOption() {
		DropdownPage dropdownPage = homePage.dropdown();
		dropdownPage.selectFromDropDown(option);
		List selectedOptions = dropdownPage.getSelectedOption();
		assertEquals(selectedOptions.size(),1 , "Incorrect number of selections");
		assertTrue(selectedOptions.contains(option),"Option not selected");
	}

}
