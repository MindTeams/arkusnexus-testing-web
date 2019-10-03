package pages;

import manage.InitializePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExamplePage extends InitializePage {

    @FindBy(id = "ejemplo")
    private static WebElement ejemplo;

    public void initElements() {
        init(ExamplePage.class);
    }

    public void ejemploMetodo1(){
        //
    }
}
