import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercuryRegPage {

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
    private WebElement enterfIRSTName;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")
    private WebElement enterLastName;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")
    private  WebElement enterPhonenumber;

    @FindBy(xpath = "//*[@id=\"userName\"]")
    private  WebElement enterEmail;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")
    private  WebElement enterAddress;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input")
    private  WebElement enterAddress2;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")
    private  WebElement enterCity;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input")
    private  WebElement enterPostcode;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")
    private  WebElement enterCountry;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private  WebElement enteruserName;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")
    private  WebElement enterPassWord;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input")
    private  WebElement enterConfirmationPassword;

    @FindBy(xpath = " /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")
    private  WebElement clickSubmitButton;










    public void ContactInformation(){

        enterEmail.sendKeys("bbbbbb@gmail.com");
        enterfIRSTName.sendKeys("jimbrosia");
        enterLastName.sendKeys("smithers");
        enterPhonenumber.sendKeys("012068849");

    }

    public void mailingInformation(){

        enterAddress.sendKeys("123 fake street");
        enterAddress2.sendKeys("fakendale");
        enterCity.sendKeys("Manchester");
        enterPostcode.sendKeys("MG6 007");


        enterCountry.sendKeys(Keys.ARROW_UP);

        enterCountry.sendKeys(Keys.ENTER);



    }

    public void UserDetails(){

        enteruserName.sendKeys("satwant");
        enterPassWord.sendKeys("pancakes");
        enterConfirmationPassword.sendKeys("pancakes");
        clickSubmitButton.click();


    }

}
