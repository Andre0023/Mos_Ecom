package etap;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.ru.*;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AddAdres {
    private final SelenideElement setOpen = $("#address-autocomplete");
    private final SelenideElement setAdres = $(byText("город Москва, Открытое шоссе, дом 19А"));
    @И("Заполняем адрес.")
    public void AddAdres() {
        setOpen.setValue("открытое");
        setAdres.click();

    }
}
