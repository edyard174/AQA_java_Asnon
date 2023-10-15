import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WebTest {

    WebDriver driver;
    By blocElement = By.xpath("//ul[@class='select__list']/li/p");
    By button = By.xpath("//button[@class='select__header']");
    By inputFields = By.xpath("//form[@class='pay-form opened']/div/input");
    By spanBy = By.xpath("//span[@class='select__now']");
    By inputPhone = By.id("connection-phone");
    By inputSum = By.id("connection-sum");
    By button2 = By.xpath("//form[@class='pay-form opened']/button");
    By button3 = By.xpath("//div[@class='card-page__card']/button");
    By cookie = By.className("cookie__close");

    By head = By.xpath("//div[@class='header__payment']/p");
    By cardNumber = By.xpath("//div[@class='content ng-tns-c46-1']");
    By icon = By.xpath("//div[@class='cards-brands ng-tns-c46-1']/div/img");
    By icon2 = By.xpath("//div[@class='cards-brands ng-tns-c46-1']/div/div");
    By validity = By.xpath("//div[@class='content ng-tns-c46-4']");
    By cvc = By.xpath("//div[@class='content ng-tns-c46-5']");
    By name = By.xpath("//div[@class='content ng-tns-c46-3']");
    String phone = "297777777";
    String sum = "10";


    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void connection() {
        driver= new ChromeDriver();
        driver.get("https://mts.by");
        driver.manage().window().maximize();
        driver.findElement(cookie).click();
    }

    @Test
    void checkInscritionTest() throws InterruptedException {
        List<WebElement> listWebElementsService = driver.findElements(blocElement);
        Actions builder = new Actions(driver);
        int j = 0;
        for (int i = 0; i < listWebElementsService.size(); i++) {
            builder.click(driver.findElement(button)).build().perform();
            Thread.sleep(2000);
            builder.click(listWebElementsService.get(i)).build().perform();
            List<WebElement> lwe = null;
            lwe = driver.findElements(inputFields);
            String phone = lwe.get(0).getAttribute("placeholder");
            String span = driver.findElement(spanBy).getText();

            switch (span) {
                case ("Услуги связи"):
                    assertEquals("Номер телефона", phone);
                    break;
                case ("Домашний интернет"):
                    assertEquals("Номер абонента", phone);
                    break;
                case ("Рассрочка"):
                    assertEquals("Номер счета на 44", phone);
                    break;
                case ("Задолженность"):
                    assertEquals("Номер счета на 2073", phone);
                    break;
            }

            String summa = lwe.get(1).getAttribute("placeholder");
            assertEquals("Сумма", summa);

            String email = lwe.get(2).getAttribute("placeholder");
            assertEquals("E-mail для отправки чека", email);

            lwe.clear();
            Thread.sleep(2000);
        }
    }

    @Test
    void checkFrame() throws InterruptedException {

        driver.findElement(inputPhone).sendKeys(phone);
        driver.findElement(inputSum).sendKeys(sum);
        driver.findElement(button2).click();
        Thread.sleep(3000);

        driver.switchTo().frame(0);
        Thread.sleep(3000);

        List<WebElement> leh = driver.findElements(head);

        assertEquals(sum, leh.get(0).getText().substring(0, sum.length()));

        assertEquals(phone, leh.get(1).getText().substring(30));

        assertEquals("Номер карты", driver.findElement(cardNumber).getText());

        List<WebElement> lei = driver.findElements(icon);

        for (int i = 0; i < lei.size(); i++) {
            assertTrue(lei.get(i).isDisplayed());
        }

        assertTrue(driver.findElement(icon2).isDisplayed());

        assertEquals("Срок действия", driver.findElement(validity).getText());

        assertEquals("CVC", driver.findElement(cvc).getText());

        assertEquals("Имя держателя (как на карте)", driver.findElement(name).getText());

        assertEquals(sum, driver.findElement(button3).getText().substring(9, 9 + sum.length()));

    }




    @AfterEach
    void teardown() throws InterruptedException {
        driver.quit();
    }

}
