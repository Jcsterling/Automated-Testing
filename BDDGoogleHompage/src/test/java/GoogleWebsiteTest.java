import static org.junit.Assert.assertTrue;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import cucumber.api.PendingException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleWebsiteTest {

    WebDriver driver;

//    ExtentReports reports;
//    ExtentTest test;

    String url;


    @Before
    public void setup() {
        System.setProperty(Constant.WEBDRIVER, Constant.CHROMEDRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Given("^I go to \"([^\"]*)\" website$")
    public void i_go_to_website(String arg1)  {

        driver.get(arg1);
        url = driver.getCurrentUrl();

    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String arg1) {

        GoogleHompage homepage = PageFactory.initElements(driver, GoogleHompage.class);
        homepage.GoogleSearch(arg1);

    }

    @Then("^I am taken to a page with relevant infomation about the searchterm$")
    public void i_am_taken_to_a_page_with_relevant_infomation_about_the_searchterm()  {

        assertTrue(!url.equals(driver.getCurrentUrl()));
    }

    @After
    public void teardown() throws Exception {

        Thread.sleep(3000);
        driver.quit();


    }





}
