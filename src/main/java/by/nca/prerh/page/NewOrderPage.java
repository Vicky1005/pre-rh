package by.nca.prerh.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOrderPage {
    private WebDriver driver;


    @FindBy(xpath = "//div[@id='s2id_secondSel']")
    private WebElement preObjectSortField;

    @FindBy(xpath = "//div[text()='Капитальное строение']")
    private WebElement objectSortField;

    @FindBy(xpath = "//div[@id='s2id_thirdSel']")
    private WebElement preObjectTypeField;

    @FindBy(xpath = "//div[text()='Здание']")
    private WebElement objectTypeField;

    @FindBy(xpath = "//div[@id='s2id_fourthSel']")
    private WebElement preObjectFunctionFeld;

    @FindBy(xpath = "//div[text()='2 10 00 - Здание жилое']")
    private WebElement objectFunctionFeld;

    @FindBy(xpath = "//a[@id='saveAllData']")
    private WebElement furtherButton;

    public NewOrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public NewOrderPage presetObjectSort() {
        preObjectSortField.click();

        return this;
    }

    public NewOrderPage setObjectSort() {

        objectSortField.click();
        return this;
    }


    public NewOrderPage presetObjectType() {
        preObjectTypeField.click();
        return this;
    }

    public NewOrderPage setObjectType() {
        objectTypeField.click();
        return this;
    }

    public NewOrderPage presetObjectFunction() {
        preObjectFunctionFeld.click();
        return this;
    }

    public NewOrderPage setObjectFunction() {
        objectFunctionFeld.click();
        return this;
    }

    public NewOrderSecondPage toContinueCreateObject() {
        presetObjectSort();
        setObjectSort();
        presetObjectType();
        setObjectType();
        presetObjectFunction();
        setObjectFunction();
        furtherButton.click();
        return new NewOrderSecondPage(driver);
    }

}
