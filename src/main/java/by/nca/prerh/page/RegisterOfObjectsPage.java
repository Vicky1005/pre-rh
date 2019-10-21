package by.nca.prerh.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterOfObjectsPage {

    private WebDriver driver;
    OrderBookPage orderBookPage;
    NewOrderPage newOrderPage;


    @FindBy (xpath = "//button[@id='delete-object']")
    private WebElement deleteObjectButton;

    public RegisterOfObjectsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public DeletionPage1 deleteObject(){
        deleteObjectButton.click();
        return new DeletionPage1(driver);
    }

}
