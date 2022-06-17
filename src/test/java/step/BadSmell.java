package step;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;

import static com.codeborne.selenide.Selenide.$;

public class BadSmell {
    private final SelenideElement smell = $("[type='radio'][value='Другое']").parent();
    private final SelenideElement typeSmell = $("[name='smell_type_custom']");

    @And("Выбор характер запаха")
    public void BadSmell() {
        smell.click();
        typeSmell.setValue("Клопы");

    }
}
