package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.sql.Driver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(){
        System.out.println("Opening the browser : Chrome");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\llh\\chromedriver.exe");
        base.Driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();

    }
    @After
    public void TearDownTest(){
        System.out.println("Closing the browser : MOCK");
        //base.Driver.quit();
    }
}
