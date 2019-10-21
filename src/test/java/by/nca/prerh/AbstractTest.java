package by.nca.prerh;

import by.nca.prerh.model.User;
import by.nca.prerh.page.AuthorizationPage;
import by.nca.prerh.page.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractTest {

    protected WebDriver driver;
    protected MainPage mainPage;

    @BeforeEach
    public void init() {
        System.setProperty("webdriver.chrome.driver", "D://work//driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://pre-rh.nca.by/signin.html");
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        mainPage = authorizationPage.submit(User.SUPER_ADMIN);
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
