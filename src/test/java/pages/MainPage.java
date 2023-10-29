package pages;

import static com.codeborne.selenide.Selenide.$;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codeborne.selenide.SelenideElement;

import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

public class MainPage{

    private SelenideElement plus = $(MobileBy.id("op_add"));
    private SelenideElement minus = $(MobileBy.id("op_sub"));
    private SelenideElement multiplication = $(MobileBy.id("op_mul"));
    private SelenideElement division = $(MobileBy.id("op_div"));
    private SelenideElement equals = $(MobileBy.id("eq"));
    private SelenideElement result = $(MobileBy.id("result_final"));
    private SelenideElement two = $(MobileBy.id("digit_2"));
    private SelenideElement four = $(MobileBy.id("digit_4"));

    @Step("Click on plus")
    public MainPage clickToPlus() {
        plus.click();
        return this;
    }

    @Step("Click on minus")
    public MainPage clickToMinus() {
        minus.click();
        return this;
    }

    @Step("Click on multiplication")
    public MainPage clickToMultiplication() {
        multiplication.click();
        return this;
    }

    @Step("Click on the division")
    public MainPage clickToDivision() {
        division.click();
        return this;
    }

    @Step("Click on equal")
    public MainPage clickToEquals() {
        equals.click();
        return this;
    }

    @Step("Click on 2")
    public MainPage clickToTwo() {
        two.click();
        return this;
    }

    @Step("Click on 4")
    public MainPage clickToFour() {
        four.click();
        return this;
    }

    @Step("Comparison")
    public MainPage check(int sum) {
        assertEquals(sum, Integer.parseInt(result.getText()));
        return this;
    }

    public int getResult() {
        return Integer.parseInt(result.getText());
    }

}
