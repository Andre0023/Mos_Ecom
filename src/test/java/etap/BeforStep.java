package etap;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.en.Given;
import io.cucumber.java.ru.*;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforStep {
    @Test
    @BeforeEach
    @Step("Открыть сайт")
    @Дано("Открыть {string}")
    public void OpenMsecom(String url) {
        Configuration.browserSize = "1920x1080";
        Selenide.open(url);
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}
