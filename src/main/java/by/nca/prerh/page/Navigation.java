package by.nca.prerh.page;

import com.codeborne.selenide.commands.Find;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation {

    private WebDriver driver;


    public Navigation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left']//a[text()='Реестр объектов']")
    private WebElement registerOfObjectsToolBarButton;


    public void goToRegisterOfObject() {
        registerOfObjectsToolBarButton.click();
    }
}
