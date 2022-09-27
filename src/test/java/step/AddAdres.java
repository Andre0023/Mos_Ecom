package step;

import com.codeborne.selenide.SelenideElement;
import helpers.Attach;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.AfterEach;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AddAdres {
    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
    }
    private final SelenideElement setOpen = $("#address-autocomplete");
    private final SelenideElement setAdres = $(byText("город Москва, Открытое шоссе, дом 19А"));
    @And("Заполняем адрес")
    public void AddAdres() {
        setOpen.setValue("открытое");
        setAdres.click();

    }
}
