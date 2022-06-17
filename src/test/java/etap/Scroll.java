package etap;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.*;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Scroll {
    private final SelenideElement scroll = $(byText("Ответить"));
    @И("Прокрутка экрана вниз.")
    public void Scroll() {
        scroll.scrollTo();

    }
}
