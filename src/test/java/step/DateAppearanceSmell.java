package step;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DateAppearanceSmell {
    private final SelenideElement dateAppearance = $("[id='report-date']");
    private final SelenideElement numberAppearance = $(byText("16"));
    private final SelenideElement intervalAppearance = $(".multi-selector-input").$(byText("Выберите временные отрезки"));
    private final SelenideElement timeAppearance = $("[type='checkbox'][value='2']").parent();

    @And("Выбор даты и отрезка появления запаха")
    public void DateAppearanceSmell() {
        dateAppearance.click();
        numberAppearance.click();
        intervalAppearance.click();
        timeAppearance.click();


    }
}
