package smokeTest;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.droppablePage;

public class SelectSliderTest extends TestBase{

    @BeforeTest(alwaysRun = true)
    public void setup() {
        droppablePage = PageFactory.initElements(driver,droppablePage.class);
    }

    @Test
    public void testSelectDroppable () {
        droppablePage.clickSliderLink();
    }

}

