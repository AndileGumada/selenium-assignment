import base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTest {
    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }
    public void testScrollToFifthParagraph(){

    }
}
