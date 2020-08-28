package exercises.chapter6.slider;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTest;

public class SliderTests extends BaseTest{

	@Test
	public void testSliderToWwholeNumber() {
		String value = "4";
		var sliderPage = homePage.clickHorizontalPage();
		sliderPage.setSliderValue(value);
		assertEquals(sliderPage.getSliderValue(), value,"Slider value is incorrect");
	}
	
}
