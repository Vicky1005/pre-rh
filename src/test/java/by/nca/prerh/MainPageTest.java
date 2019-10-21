package by.nca.prerh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Disabled("text")
public class MainPageTest extends AbstractTest {


    @Test
    @DisplayName("Перейти в реестр объектов")
    public void navigateToegisterOfObjects() {
        mainPage.navigateToRegisterOfObgects();
        Assertions.assertEquals("https://pre-rh.nca.by/moduleSearch.html", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Перейти в журнал заказов")
    public void navigateToOrderBook() {
        mainPage.naavigateToOrderBook();
        Assertions.assertEquals("https://pre-rh.nca.by/journal.html", driver.getCurrentUrl());
    }



}
