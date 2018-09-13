
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.PendingException;
import gherkin.lexer.Pa;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeWebsiteStepDefinitionClass {



    WebDriver driver;
    ExtentReports reports;
    ExtentTest test;
    Actions action = null;



    @Before
    public void setup(){

        System.setProperty("webdriver.chrome.driver",
                "C:/Development/web_driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        reports = new ExtentReports("C:\\Users\\Admin\\Desktop\\Reports\\passionate.html", true);//this will replace the old report with a new report each time the test is ran
        test = reports.startTest("Passionate Test");


        action = new Actions(driver);



    }


    @Given("^the login page$")
    public void the_login_page()  {

        driver.get("https://qa-trials641.orangehrmlive.com/auth/login");
        test.log(LogStatus.INFO, "accessed web page");


    }

    @When("^I login$")
    public void i_login() {

        OrangeLoginPage loginPage = PageFactory.initElements(driver, OrangeLoginPage.class);
        loginPage.login();
        test.log(LogStatus.INFO, "user logged in successfully");

        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I click the PIM tab$")
    public void i_click_the_PIM_tab()  {
        OrangeDashBoard dashBoard = PageFactory.initElements(driver, OrangeDashBoard.class);
        dashBoard.clickPIM();
        test.log(LogStatus.INFO, "PIM tab clicked");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^then the Add Employee Tab$")
    public void then_the_Add_Employee_Tab() {

        driver.get("https://qa-trials641.orangehrmlive.com/client/#/dashboard");

        OrangeDashBoard dashBoard = PageFactory.initElements(driver, OrangeDashBoard.class);
        WebElement myDynamicElement = (new WebDriverWait(driver, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"menu_pim_addEmployee\"]/span[2]")));

        dashBoard.clickAddEmployeeTab();
        test.log(LogStatus.INFO, "add employee tab clicked");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I fill out the Employee Details correctly$")
    public void i_fill_out_the_Employee_Details_correctly() {



        driver.get("https://qa-trials641.orangehrmlive.com/client/#/pim/employees");

        OrangeEmployeesPage employeesPage =PageFactory.initElements(driver, OrangeEmployeesPage.class);

        WebElement myDynamicElement = (new WebDriverWait(driver, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"firstName\"]")));

        employeesPage.fillOutEmployeeDetails();
        test.log(LogStatus.INFO, "add employee tab clicked");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I choose to create Login Details by clicking the appropriate button$")
    public void i_choose_to_create_Login_Details_by_clicking_the_appropriate_button() {
        OrangeEmployeesPage employeesPage =PageFactory.initElements(driver, OrangeEmployeesPage.class);
        employeesPage.chooseLoginDetails();
        test.log(LogStatus.INFO, "create login details ticked");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I fill out the Login Details correctly$")
    public void i_fill_out_the_Login_Details_correctly()  {

        driver.get("https://qa-trials641.orangehrmlive.com/client/#/pim/employees");

        OrangeEmployeesPage employeesPage =PageFactory.initElements(driver, OrangeEmployeesPage.class);
        WebElement myDynamicElement = (new WebDriverWait(driver, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"username\"]")));
        employeesPage.createLoginDetails("bob", "lee", "swagger");
        test.log(LogStatus.INFO, "login details created");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I click the Save button$")
    public void i_click_the_Save_button() {

        OrangeEmployeesPage employeesPage =PageFactory.initElements(driver, OrangeEmployeesPage.class);

      // employeesPage.saveLoginDetails();
       test.log(LogStatus.INFO, "login details saved");
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I can search for the Employee I have just created$")
    public void i_can_search_for_the_Employee_I_have_just_created() {


        OrangeEmployeesPage employeesPage =PageFactory.initElements(driver, OrangeEmployeesPage.class);

        employeesPage.clickSearchedEmployee(action);

        assertEquals("Employee List", driver.findElement(By.xpath("//*[@id=\"right-side\"]/header/div/nav/div/div/ul[1]/li")).getText());



        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^select them for inspection$")
    public void select_them_for_inspection()  {

        OrangeEmployeesPage employeesPage = PageFactory.initElements(driver, OrangeEmployeesPage.class);
        // Write code here that turns the phrase above into concrete actions

        employeesPage.employeeClick();

    }

    @After
    public void teardown() throws Exception {


        reports.endTest(test);
        reports.flush();


    }


}
