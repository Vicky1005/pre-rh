package by.nca.prerh.page;

import org.junit.jupiter.api.Order;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NewOrderSecondPage {

    private WebDriver driver;

    @FindBy(xpath = "//button[@id='saveAllData']")
    private WebElement createButtton;

    @FindBy(xpath = "//a[text()='Завершить']")
    private WebElement finishBUtton;


    public NewOrderSecondPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public OrderBookPage createOrder() {
        createButtton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        finishBUtton.click();
        return new OrderBookPage(driver);
    }
}
