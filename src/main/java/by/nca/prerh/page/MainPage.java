package by.nca.prerh.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@title='Кликните чтобы перейти в журнал']")
    private WebElement orderBookButton;

    @FindBy(xpath = "//a[@title='Кликните чтобы перейти в реестр']")
    private WebElement registerOfObjectsButton;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public OrderBookPage naavigateToOrderBook() {
        orderBookButton.click();
        return new OrderBookPage(driver);
    }

    public RegisterOfObjectsPage navigateToRegisterOfObgects() {
        registerOfObjectsButton.click();
        return new RegisterOfObjectsPage(driver);
    }
}
