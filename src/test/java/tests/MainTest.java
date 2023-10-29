package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.qameta.allure.Description;
import pages.MainPage;

public class MainTest extends BaseTest {

    private static MainPage mainPage;

    @BeforeAll
    public static void init() {
        mainPage = new MainPage();
    }
    @Description("Addition testing")
    @Test
    void checkAddition() {
        mainPage
                .clickToTwo()
                .clickToPlus()
                .clickToTwo()
                .clickToEquals()
                .check(2);
    }

    @Description("Subtraction testing")
    @Test
    void checkSubtraction() {
        mainPage
                .clickToFour()
                .clickToMinus()
                .clickToTwo()
                .clickToEquals()
                .check(2);
    }

    @Description("Multiplication testing")
    @Test
    void checkMultiplication() {
        mainPage
                .clickToTwo()
                .clickToMultiplication()
                .clickToTwo()
                .clickToEquals()
                .check(4);
    }

    @Description("Division testing")
    @Test
    void checkDivision() {
        mainPage
                .clickToFour()
                .clickToDivision()
                .clickToTwo()
                .clickToEquals()
                .check(2);
    }
}
