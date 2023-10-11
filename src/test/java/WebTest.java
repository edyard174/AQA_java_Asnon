import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class WebTest {

    WebDriver driver;
    By blocPay = By.xpath("//section/div/h2");
    By logo = By.xpath("//div[@class='pay__partners']//img");
    By service = By.xpath("//a[text()='Подробнее о сервисе']");
    By inputPhone = By.id("connection-phone");
    By inputSum = By.id("connection-sum");
    By button = By.xpath("//form[@class='pay-form opened']/button");


    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void connection() {
        driver= new ChromeDriver();
        driver.get("https://mts.by");
    }

    @Test
    void nameBlockTest() {
        driver.manage().window().maximize();
        String name = driver.findElement(blocPay).getText();
        assertEquals("Онлайн пополнение\nбез комиссии", name);
    }

    @Test
    void payLogoTest() {
        driver.manage().window().maximize();
        List<WebElement> listElements = driver.findElements(logo);
        listElements.stream().forEach(a -> assertTrue(a.isDisplayed()));
    }

    @Test
    void serviceTest() {
        driver.manage().window().maximize();
        if (driver.findElement(service).isDisplayed()) {
            driver.findElement(service).click();
        }
    }

    @Test
    void checkButtonTest() {
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(inputPhone).click();
        driver.findElement(inputPhone).sendKeys("297777777");
        driver.findElement(inputSum).click();
        driver.findElement(inputSum).sendKeys("100");
        driver.findElement(button).click();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

}