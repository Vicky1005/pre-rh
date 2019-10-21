package by.nca.prerh.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DeletionPage1 {

    private WebDriver driver;
    Alert alert = driver.switchTo().alert();


    @FindBy(xpath = "//button[@id='saveAllData']")
    private WebElement createDeletedObjectButton;

    @FindBy(xpath = "//a[text()='к Объекту']")
    private WebElement toObjectButton;

    @FindBy(xpath = "//button[@id='changeOperationStatus']")
    private WebElement toCompleteButton;

    @FindBy (xpath="//div[@id='s2id_selectForChangeOperationStatus']")
    private WebElement preStatusButton;

    @FindBy (xpath="//div[@id='select2-result-label-7']")
    private WebElement sostavilStatus;

    @FindBy (xpath="//button[@id='confirmChangeOperationStatus']")
    private WebElement confirmButton;

    @FindBy (xpath="//div[@id='select2-result-label-7']")
    private WebElement proverilStatus;

    public DeletionPage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public RegisterOfObjectsPage createDeletedOrder() {
        createDeletedObjectButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        toObjectButton.click();
        alert.accept();
        toCompleteButton.click();
        preStatusButton.click();
        sostavilStatus.click();
        confirmButton.click();
        alert.accept();
        toCompleteButton.click();
        alert.accept();
        preStatusButton.click();
        proverilStatus.click();
        confirmButton.click();
        alert.accept();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new RegisterOfObjectsPage(driver);

    }
}
