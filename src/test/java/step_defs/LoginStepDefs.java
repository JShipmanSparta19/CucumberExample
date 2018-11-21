package step_defs;

import com.sparta.jas.bbcSite.BbcSite;
import com.sparta.jas.seleniumConfig.SeleniumDriverConfig;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefs {
//    private WebDriver driver;
    private BbcSite bbcSite;

    public LoginStepDefs(){
        SeleniumDriverConfig seleniumDriverConfig = new SeleniumDriverConfig("chrome");
        WebDriver driver = seleniumDriverConfig.getDriver();
        bbcSite = new BbcSite(driver);
    }

//    @Given("^I am able to access the sign in page$")
//    public void i_am_able_to_access_the_sign_in_page() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        bbcSite.getBbcLoginPage().goToLoginPage();
//        Assert.assertEquals(bbcSite.getBbcLoginPage().getLoginUrl(), bbcSite.getCurrentUrl());
//    }
//
//    @When("^I use incorrect credentials to login$")
//    public void i_use_incorrect_credentials_to_login() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        bbcSite.getBbcLoginPage().typeUsername("TestUser");
//        bbcSite.getBbcLoginPage().typePassword("TestPassword");
//        bbcSite.getBbcLoginPage().clickSubmitButton();
//    }
//
//    @Then("^I receive a viable error$")
//    public void i_receive_a_viable_error() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        Assert.assertNotEquals(null, bbcSite.getBbcLoginPage().getPasswordErrorText());
//    }



    @Given("^I am on the sign in page$")
    public void i_am_on_the_sign_in_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        bbcSite.getBbcLoginPage().goToLoginPage();
        Assert.assertEquals(bbcSite.getBbcLoginPage().getLoginUrl(), bbcSite.getCurrentUrl());
    }

    @When("^I input a valid Email Address$")
    public void i_input_a_valid_Email_Address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        bbcSite.getBbcLoginPage().typeUsername("test@email.com");
    }

    @When("^I input an invalid (.*) that will generate an error$")
    public void i_input_an_invalid_pass_that_will_generate_an_error(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        bbcSite.getBbcLoginPage().typePassword(password);
        bbcSite.getBbcLoginPage().clickSubmitButton();
    }

    @Then("^I receive the corresponding error (.*)$")
    public void i_receive_the_corresponding_error(String error) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(error,bbcSite.getBbcLoginPage().getPasswordErrorText());
    }

    @After
    public void shutdown(){
        bbcSite.quit();
    }
}