package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(){
        System.out.println("Opening the browser : Firefox");

        System.setProperty("webdriver.firefox.marionette", "D:\\libs\\geckodriver.exe");
        Driver = new FirefoxDriver();
    }
    @After
    public void TearDownTest(){
        System.out.println("Closing the browser : MOCK");
    }
}
