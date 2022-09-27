package step;

import com.codeborne.selenide.SelenideElement;

import helpers.Attach;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.AfterEach;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Scroll {

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
    }

    private final SelenideElement scroll = $(byText("Ответить"));
    @When("Прокрутка экрана вниз")
    public void Scroll() {
        scroll.scrollTo();

    }
}
