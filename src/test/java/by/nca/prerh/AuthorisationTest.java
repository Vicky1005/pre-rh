package by.nca.prerh;

import by.nca.prerh.model.User;
import by.nca.prerh.page.AuthorizationPage;
import by.nca.prerh.page.MainPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthorisationTest {

    private WebDriver driver;


    @BeforeEach
    public void init() {
        //System.setProperty("webdriver.chrome.driver", "D://work//driver//chromedriver.exe"); //дом
        System.setProperty("webdriver.chrome.driver", "D://Work//vika//IdeaProjects//testselenium//drivers//chromedriver.exe"); //работа
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://pre-rh.nca.by/signin.html");
    }

    @Test
    @DisplayName("Успешная авторизация")
    public void successLogin() {
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        MainPage mainPage = authorizationPage.submit(User.SUPER_ADMIN);
        Assertions.assertEquals("https://pre-rh.nca.by/guide.html?oper=enter", driver.getCurrentUrl());
    }


    @Test
    @DisplayName("Авторизация с невалидными данными")
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


