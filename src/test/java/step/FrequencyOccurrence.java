package step;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;

import static com.codeborne.selenide.Selenide.$;

public class FrequencyOccurrence {
    private final SelenideElement frequencyOccurrenceSmell = $("[type='radio'][value='Каждый день']").parent();
    @And("Выбор периодичности появления запахов")
    public void FrequencyOccurrence() {
        frequencyOccurrenceSmell.click();

    }
}
