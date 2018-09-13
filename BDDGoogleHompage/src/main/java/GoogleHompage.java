
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHompage {

    @FindBy(id = "lst-ib")
    private WebElement enterSerchTerm;


    public void GoogleSearch(String query){
        enterSerchTerm.sendKeys(query);
        enterSerchTerm.sendKeys(Keys.ENTER);

    }


}
