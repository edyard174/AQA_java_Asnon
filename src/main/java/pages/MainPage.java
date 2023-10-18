package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MainPage extends BasePage{

    private int count = 0;
    private int sum = 0;
    private List<String> ln = new ArrayList<>();
    private List<String> lp = new ArrayList<>();

    public String getName(int index) {
        return ln.get(index);
    }

    public String getPrice(int index) {
        return lp.get(index);
    }

    public int getCount() {
        return count;
    }

    public int getSum() {
        return sum;
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage scroll() {
        (new WebDriverWait(driver, Duration.ofSeconds(5))).until(ExpectedConditions.titleContains("Wildberries"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");
        return this;
    }

    public MainPage addToBasket() {

        By basket = By.xpath("//a[normalize-space()='В корзину']");
        By name = By.xpath("//span[@class='product-card__name']");
        By price = By.xpath("//ins[@class='price__lower-price']");
        By close = By.xpath("//a[@href='#']");

        List<WebElement> lwe = new ArrayList(driver.findElements(basket));
        List<WebElement> lwen = new ArrayList<>(driver.findElements(name));
        List<WebElement> lwep = new ArrayList<>(driver.findElements(price));


        for (int i = 0; i < 4; i++) {
            try {
                lwe.get(i).click();
                Thread.sleep(1000);
                if (lwe.get(i).getText().equals("В корзину")) {
                    driver.findElement(close).click();
                } else {
                    count++;
                    ln.add(lwen.get(i).getText());
                    lp.add(lwep.get(i).getText());
                    sum += Integer.parseInt(lwep.get(i)
                                    .getText()
                                    .replaceAll(" ", "")
                                    .replaceAll("₽", ""));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this;
    }
}
