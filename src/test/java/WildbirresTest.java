import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;
import java.util.Collections;
import java.util.List;

import static common.Config.CLOSE_BROWSER;
import static common.Config.WILDBERRIES;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WildbirresTest extends BaseTest {

    @BeforeEach
    void open() {
        basePage.open(WILDBERRIES);
    }

    @Test
    void checkBasketTest() throws InterruptedException {
        mainPage.scroll().addToBasket();
        basketPage.clickBasket();
        basketPage.checkCountCard();

        assertEquals(mainPage.getCount(), basketPage.getCount());
        Thread.sleep(1000);

        List<WebElement> lwen = basketPage.getListName();
        List<WebElement> lwep = basketPage.getListPrice();
        Collections.reverse(lwen);
        Collections.reverse(lwep);
        for (int i = 0; i < basketPage.getCount(); i++) {
            assertEquals(mainPage.getName(i).substring(2), lwen.get(i).getText());
            assertEquals(mainPage.getPrice(i), lwep.get(i).getText());
        }

        assertEquals(mainPage.getSum(), basketPage.getTotalSum());

    }

    @AfterEach
    void close() {
        if (CLOSE_BROWSER) {
            driver.quit();
        }
    }

}
