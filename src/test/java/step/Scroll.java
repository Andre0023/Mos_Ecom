package step;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Scroll {
    private final SelenideElement scroll = $(byText("Ответить"));
    @When("Прокрутка экрана вниз")
    public void Scroll() {
        scroll.scrollTo();

    }
}
