package Steps;

import Base.BaseUtil;

import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import sun.security.util.Password;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class LoginSteps extends BaseUtil {

    private BaseUtil base;

    public LoginSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        System.out.println("I navigate to the login page");
        base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
    }


    @And("^I click login button$")
    public void iClickLoginButton() {
        LoginPage page = new LoginPage(base.Driver);
        page.ClickLogin();
        //base.Driver.findElement(By.name("Login")).submit();
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() {
        Assert.assertEquals("it´s not displayed", base.Driver.findElement(By.id("Initial")).isDisplayed(),true);
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) {

        //Create an array list
        List<User> users = new ArrayList<User>();
        //Store all users
        users = table.asList(User.class);

        LoginPage page = new LoginPage(base.Driver);

        for (User user: users){
            page.Login(user.username, user.password);
        }

    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) {
        System.out.println("UserName is : " + userName);
        System.out.println("Password is : " + password);
    }


    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}
