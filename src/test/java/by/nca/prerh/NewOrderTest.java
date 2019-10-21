package by.nca.prerh;

import by.nca.prerh.page.NewOrderPage;
import by.nca.prerh.page.NewOrderSecondPage;
import by.nca.prerh.page.OrderBookPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewOrderTest extends AbstractTest {

    @Test
    public void toContinueCreateOrder() {
        OrderBookPage orderBookPage = mainPage.naavigateToOrderBook();
        NewOrderPage newOrderPage = orderBookPage.navigateToCreateOrder();
        NewOrderSecondPage orderSecondPage = newOrderPage.toContinueCreateObject();
        Assertions.assertEquals("https://pre-rh.nca.by/operations.html?oper=create", driver.getCurrentUrl());

//        mainPage.naavigateToOrderBook()
//                .navigateToCreateOrder()
//                .toContinueCreateObject();


    }

}
