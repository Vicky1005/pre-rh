package by.nca.prerh;

import by.nca.prerh.page.NewOrderPage;
import by.nca.prerh.page.NewOrderSecondPage;
import by.nca.prerh.page.OrderBookPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

@Disabled("text")
public class NewOrderSecondPageTest extends AbstractTest {



    @Test
    @Disabled ("Рабочий!")
    @DisplayName("Создание нового заказа часть 2")
    public void toContinueCreateOrder() {
        OrderBookPage orderBookPage = mainPage.naavigateToOrderBook();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        NewOrderPage newOrderPage = orderBookPage.navigateToCreateOrder();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        NewOrderSecondPage neworderSecondPage = newOrderPage.toContinueCreateObject();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        OrderBookPage orderBookPage1=neworderSecondPage.createOrder();
        Assertions.assertEquals("https://pre-rh.nca.by/journal.html", driver.getCurrentUrl());

    }
}
