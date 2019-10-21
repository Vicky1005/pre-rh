package by.nca.prerh.page;

import by.nca.prerh.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage {


    private WebDriver driver;

    @FindBy(xpath = "//input[@id='j_username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='j_password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='remember_me']")
    private WebElement rememberMe;

    @FindBy(xpath = "//input[@id='submit']")
    private WebElement submitVButton;

    @FindBy(xpath = "//div[@class='errors']")
    private WebElement errorText;


    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AuthorizationPage setUsername(String username) {
        usernameField.sendKeys(username);
        return this;
    }

    public AuthorizationPage setPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public AuthorizationPage setCheckbox() {
        rememberMe.click();
        return this;
    }

    public MainPage submit(User user) {
        setUsername(user.getUsername());
        setPassword(user.getPassword());
        setCheckbox();
        submitVButton.click();
        return new MainPage(driver);
    }

    public AuthorizationPage submitWithError(User user) {
        setUsername(user.getUsername());
        setPassword(user.getPassword());
        setCheckbox();
        submitVButton.click();
        return this;
    }

    public String getErrorText() {
        return errorText.getText();
    }
}



