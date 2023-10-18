package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasketPage extends BasePage{

    private By basket = By.xpath("//a[@aria-label='Корзина']");
    private By card = By.xpath("//div[@class='list-item__wrap']");
    private By name = By.xpath("//span[@class='good-info__good-name']");
    private By price = By.xpath("//div[@class='list-item__price-new']");
    private By totalSum = By.xpath("//p[@class='b-top__total line']");
    private int count;

    public int getCount() {
        return count;
    }

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public BasketPage clickBasket() {
        driver.findElement(basket).click();
        return this;
    }

    public BasketPage checkCountCard() {
        count = driver.findElements(card).size();
        return this;
    }

    public List<WebElement> getListName() {
        return driver.findElements(name);
    }

    public List<WebElement> getListPrice() {
        return driver.findElements(price);
    }

    public int getTotalSum() {
        return Integer.parseInt(driver
                .findElement(totalSum)
                .getText()
                .substring(6)
                .replaceAll(" ", "")
                .replaceAll("₽", ""));
    }

}
