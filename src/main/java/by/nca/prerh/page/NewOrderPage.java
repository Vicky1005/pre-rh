package by.nca.prerh.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOrderPage {
    private WebDriver driver;

    @FindBy (xpath = "//select[@id='secondSel']/option[@value='2']")
    private WebElement objectSortField;

    @FindBy (xpath = "//select[@id='thirdSel']/option[@value='1']")
    private WebElement objectTypeField;

    @FindBy (xpath = "//select[@id='fourthSel']/option[@value='21000']")
    private WebElement objectFunctionFeld;

    @FindBy (xpath = "//a[@id='saveAllData']")
    private WebElement furtherButton;

    public NewOrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public NewOrderPage setObjectSort() {
        objectSortField.click();
        return this;
    }

    public NewOrderPage setObjectType() {
        objectTypeField.click();
        return this;
    }

    public NewOrderPage setObjectFunction() {
        objectFunctionFeld.click();
        return this;
    }

    public NewOrderSecondPage toContinueCreateObject() {
        setObjectSort();
        setObjectType();
        setObjectFunction();
        furtherButton.click();
        return new NewOrderSecondPage(driver);
    }

}
