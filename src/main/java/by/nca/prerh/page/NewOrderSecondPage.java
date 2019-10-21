package by.nca.prerh.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewOrderSecondPage {

    private WebDriver driver;

    public NewOrderSecondPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
