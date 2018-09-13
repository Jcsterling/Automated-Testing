import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.awt.windows.WEmbeddedFrame;

public class OrangeEmployeesPage {

    @FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")
    private WebElement PIM;

    @FindBy(xpath = "//*[@id=\"menu_pim_addEmployee\"]/span[2]")
    private WebElement employeeList;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNames;

    @FindBy(xpath = "//*[@id=\"middleName\"]")
    private WebElement middleName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id=\"employeeId\"]")
    private WebElement employeeID;

    @FindBy(xpath = "//*[@id=\"location_inputfileddiv\"]/div/input")
    private WebElement location;

    @FindBy(xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")
    private WebElement createLoginDetailsButton;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement newUserName;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement newPassword;

    @FindBy(xpath = "//*[@id=\"confirmPassword\"]")
    private WebElement confirmNewPassword;

    @FindBy(xpath = "//*[@id=\"adminRoleId_inputfileddiv\"]/div/input")
    private WebElement adminRole;

    @FindBy(xpath = "//*[@id=\"systemUserSaveBtn\"]")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"employee_name_quick_filter_employee_list_value\"]")
    private WebElement search;

    @FindBy(xpath = "//*[@id=\"right-side\"]/header/div/nav/div/div/ul[2]/li[2]/a")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"employeeListTable\"]/tbody/tr/td[1]/img")
    private WebElement Employee;



    public void fillOutEmployeeDetails(){

        firstNames.sendKeys("B");
        middleName.sendKeys("L");
        lastName.sendKeys("Swagger");
        employeeID.sendKeys("0161Maloe");
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ENTER);




    }

    public void chooseLoginDetails(){
        createLoginDetailsButton.click();

    }
   // public void waitforelement(){
       // WebDriver driver = new ChromeDriver();
       // driver.get("http://exampleURL");
       // WebElement myDynamicElement = (new WebDriverWait(driver, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"firstName\"]")));
   // }

    public void createLoginDetails(String name1, String name2, String name3){

        newUserName.sendKeys(name1);
        newPassword.sendKeys(name2);
        confirmNewPassword.sendKeys(name3);
        adminRole.sendKeys(Keys.ARROW_DOWN);
        adminRole.sendKeys(Keys.ENTER);
        saveButton.click();
    }

    public void clickSearchedEmployee(Actions action){

        search.sendKeys("B L Swagger");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //action.sendKeys(Keys.ARROW_DOWN).perform();
        action.sendKeys(Keys.ENTER).perform();
    }


    public void employeeClick(){

        Employee.click();

    }








}
