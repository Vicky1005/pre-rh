package by.nca.prerh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainPageTest extends AbstractTest {

    @Test
    public void navigateToOrderBook() {
        mainPage.naavigateToOrderBook();
        Assertions.assertEquals("https://pre-rh.nca.by/journal.html", driver.getCurrentUrl());
    }

}
