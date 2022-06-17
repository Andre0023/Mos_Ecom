package etap;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import io.cucumber.java.en.And;

import static com.codeborne.selenide.Selenide.$;

public class FrequencyOccurrence {
    private final SelenideElement frequencyOccurrenceSmell = $("[type='radio'][value='Каждый день']").parent();
    @И("Выбор периодичности появления запахов.")
    public void FrequencyOccurrence() {
        frequencyOccurrenceSmell.click();

    }
}
