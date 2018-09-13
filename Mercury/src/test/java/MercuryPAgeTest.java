import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;

public class MercuryPAgeTest {

    ChromeDriver driver;
    ExtentReports reports;
    ExtentTest test;




    @Before
    public void setup(){

        System.setProperty("webdriver.chrome.driver",
                "C:/Development/web_driver/chromedriver.exe");;

        driver = new ChromeDriver();
    }


    @After
    public void teardown() throws Exception {

        Thread.sleep(5000);
        reports.endTest(test);
        reports.flush();
        driver.quit();


    }


    @Test
    public void searchAndFindItem() {

        reports = new ExtentReports("C:\\Users\\Admin\\Desktop\\Reports\\mercury.html", true);//this will replace the old report with a new report each time the test is ran

        test = reports.startTest("reach flight page");
        test.log(LogStatus.INFO, "verify if user has logged in and got to the flight page");




            driver.get("http://newtours.demoaut.com/mercurysignon.php");








            MercuryHomePage homePage = PageFactory.initElements(driver, MercuryHomePage.class);

            homePage.clickReg();


            MercuryRegPage regPage = PageFactory.initElements(driver, MercuryRegPage.class);

            regPage.ContactInformation();

            regPage.mailingInformation();

            regPage.UserDetails();


            confirmationPage confirm = PageFactory.initElements(driver, confirmationPage.class);

            confirm.clickSignIn();


            signInPage sign = PageFactory.initElements(driver, signInPage.class);

            sign.ContactInformation();


        String title = driver.getTitle();

        if (title.equals("Find a Flight: Mercury Tours:")) {
            test.log(LogStatus.PASS, "user logged in successfully");
        } else {
            test.log(LogStatus.FAIL, "unsuccessful login");
        }

            assertEquals("Flight Details", driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font")).getText());

        }


    }

