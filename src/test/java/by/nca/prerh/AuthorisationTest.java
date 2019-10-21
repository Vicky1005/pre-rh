package by.nca.prerh;

import by.nca.prerh.model.User;
import by.nca.prerh.page.AuthorizationPage;
import by.nca.prerh.page.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthorisationTest {

    private WebDriver driver;


    @BeforeEach
    public void init() {
        System.setProperty("webdriver.chrome.driver", "D://work//driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://pre-rh.nca.by/signin.html");
    }

    @Test
    public void successLogin() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        MainPage mainPage = authorizationPage.submit(User.SUPER_ADMIN);
        Assertions.assertEquals("https://pre-rh.nca.by/guide.html?oper=enter", driver.getCurrentUrl());
    }


    @Test
    public void errorLogin() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.submitWithError(User.INVALID_USER);
        Assertions.assertEquals("Пользователь или пароль некорректен, повторите ввод.", authorizationPage.getErrorText());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}


