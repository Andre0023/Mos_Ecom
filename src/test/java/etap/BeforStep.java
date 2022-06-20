package etap;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.ru.Дано;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

public class BeforStep  {

    @Test

    @BeforeEach
    @Step("Открыть сайт")
    @Дано("Открыть {string}")
    public void OpenMsecom(String url) {
        Configuration.browserSize = "1920x1080";
        Selenide.open(url);
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        attachPageSource();
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
    @Attachment(value = "Screenshot", type = "text/html", fileExtension = "html")
    public byte[] attachPageSource(){
        return WebDriverRunner.source().getBytes(StandardCharsets.UTF_8);
    }
}
