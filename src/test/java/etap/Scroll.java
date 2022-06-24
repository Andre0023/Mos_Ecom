package etap;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Scroll {
    private final SelenideElement scroll = $(byText("Ответить"));

    @Step("Прокрутка экрана вниз.")
    @И("Прокрутка экрана вниз.")
    public void Scroll() {
        scroll.scrollTo();

    }
    @Attachment
    public String performedActions(ActionSequence actionSequence) {
        return actionSequence.toString();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
}
