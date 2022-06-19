package etap;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.*;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Scroll {
    private final SelenideElement scroll = $(byText("Ответить"));
    @Test
    @Step("Прокрутка экрана вниз.")
    @И("Прокрутка экрана вниз.")
    public void Scroll() {
        scroll.scrollTo();

    }
}
