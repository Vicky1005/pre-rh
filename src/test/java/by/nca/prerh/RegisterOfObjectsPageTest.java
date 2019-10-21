package by.nca.prerh;

import by.nca.prerh.page.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterOfObjectsPageTest extends AbstractTest {
    MainPage mainPage;
    OrderBookPage orderBookPage;
    NewOrderPage newOrderPage;
    RegisterOfObjectsPage registerOfObjectsPage;
    DeletionPage1 deletionPage1;
    NewOrderTest newOrderTest;
    Navigation navigation;
    NewOrderSecondPage newOrderSecondPage;

    @Test
    public void deleteObject() {
        OrderBookPage orderBookPage = mainPage.naavigateToOrderBook();
        NewOrderPage newOrderPage = orderBookPage.navigateToCreateOrder();
        NewOrderSecondPage orderSecondPage = newOrderPage.toContinueCreateObject();
        newOrderSecondPage.createOrder();
        navigation.goToRegisterOfObject();
        registerOfObjectsPage.deleteObject();
        Assertions.assertEquals("https://pre-rh.nca.by/moduleSearch.html", driver.getCurrentUrl());


    }
}
