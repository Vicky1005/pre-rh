package by.nca.prerh.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderBookPage {
    private WebDriver driver;

    @FindBy (xpath = "//a[@id='newOrder']")
    private WebElement newOrderButton;

    public OrderBookPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public NewOrderPage navigateToCreateOrder() {
        newOrderButton.click();
        return new NewOrderPage(driver);
    }
}
