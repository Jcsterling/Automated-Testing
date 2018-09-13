import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class PassionTeaCheckOutPage {

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement name;

    @FindBy(xpath = "//*[@id=\"address\"]")
    private WebElement address;

    @FindBy(xpath = "//*[@id=\"card_type\"]")
    private WebElement cardtype;

    @FindBy(xpath = "//*[@id=\"card_number\"]")
    private WebElement cardNumber;

    @FindBy(xpath = "//*[@id=\"cardholder_name\"]")
    private WebElement cardHolderName;

    @FindBy(xpath = "//*[@id=\"verification_code\"]")
    private WebElement VERIcODE;

    @FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")
    private WebElement placeOrder;

    public void  checkOut() throws InterruptedException{
        email.sendKeys("123@hotmail.com");
        name.sendKeys("batman");
        address.sendKeys("678 fake street");
        Thread.sleep(500);
        cardtype.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        cardNumber.sendKeys("1234567890");
        cardHolderName.sendKeys("Smithers lord beechcroft");
        VERIcODE.sendKeys("1369");

        placeOrder.click();
    }
}
