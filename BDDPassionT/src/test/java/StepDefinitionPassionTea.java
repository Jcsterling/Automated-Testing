
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.PendingException;
import gherkin.lexer.Pa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitionPassionTea {

    WebDriver driver;

    ExtentReports reports;
    ExtentTest test;

    String url;






    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        reports = new ExtentReports("C:\\Users\\Admin\\Desktop\\Reports\\passionate.html", true);//this will replace the old report with a new report each time the test is ran
        test = reports.startTest("Passionate Test");


    }


    @Given("^the correct web address$")
    public void the_correct_web_address()  {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://www.practiceselenium.com/welcome.html");
        test.log(LogStatus.INFO, "access web page");

    }


    @When("^I navigate to the 'Menu' page$")
    public void i_navigate_to_the_Menu_page() {
        PassionTeaHomepage homepage = PageFactory.initElements(driver, PassionTeaHomepage.class);
        homepage.clickMenuButton();
        test.log(LogStatus.INFO, "navigated to menu page");
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^I can browse a list of the available products\\.$")
    public void i_can_browse_a_list_of_the_available_products() {

        PassionTeaMenuPage page = PageFactory.initElements(driver, PassionTeaMenuPage.class);
        assertEquals("Green Tea", driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")).getText());
        assertEquals("Red Tea", driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231072\"]/div/p/span/span/strong")).getText());

        String title = driver.getTitle();

        if (title.equals("Menu")) {
            test.log(LogStatus.PASS, "user is able to browse");
        } else {
            test.log(LogStatus.FAIL, "unsuccessful");
        }

        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I click the checkout button$")
    public void i_click_the_checkout_button() {
        PassionTeaMenuPage page = PageFactory.initElements(driver, PassionTeaMenuPage.class);

        driver.get("http://www.practiceselenium.com/menu.html?");
        page.clickCheckOutButton();
        test.log(LogStatus.INFO, "Check out button clicked");



        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I am taken to the checkout page$")
    public void i_am_taken_to_the_checkout_page() throws InterruptedException{

        PassionTeaCheckOutPage checkOutPage = PageFactory.initElements(driver, PassionTeaCheckOutPage.class);

        checkOutPage.checkOut();
        assertEquals("Menu", driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914921\"]/div/h1")).getText());


        String title = driver.getTitle();

        if (title.equals("Menu")) {
            test.log(LogStatus.PASS, "user checked out");
        } else {
            test.log(LogStatus.FAIL, "unsuccessful checkout");
        }

        // Write code here that turns the phrase above into concrete actions

    }
    @After
    public void teardown() throws Exception {

        Thread.sleep(3000);
        reports.endTest(test);
        reports.flush();
        driver.quit();


    }






}
