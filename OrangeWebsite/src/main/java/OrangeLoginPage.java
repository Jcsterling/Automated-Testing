import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OrangeLoginPage {

    @FindBy(xpath = "//*[@id=\"txtUsername\"]")
    private WebElement userName;

    @FindBy(xpath = "//*[@id=\"txtPassword\"]")
    private  WebElement PassWord;

    @FindBy(xpath = "//*[@id=\"btnLogin\"]")
    private WebElement loginButton;


    public void login(){
        userName.sendKeys("Admin");
        PassWord.sendKeys("AdminAdmin");
        loginButton.click();
    }



}
