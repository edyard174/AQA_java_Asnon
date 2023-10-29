package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;

import static driver.RunDriver.runDriver;
import static io.qameta.allure.Allure.step;

import io.qameta.allure.Allure;
import io.qameta.allure.selenide.AllureSelenide;

public class BaseTest {

    @BeforeAll
    public static void setup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.reportsFolder = "screenshots/actual/";
        Configuration.browser = runDriver().getDriverClass().getName();
        Configuration.startMaximized = false;
        Configuration.browserSize = null;
        Configuration.timeout = 10000;
    }

    @BeforeEach
    public void startDriver() {
        step("Open application", (Allure.ThrowableRunnableVoid) Selenide::open);
    }

    @AfterEach
    public void afterEach() {
        step("Close application", Selenide::closeWebDriver);
    }
}