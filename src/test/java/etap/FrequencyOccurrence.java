package etap;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class FrequencyOccurrence {
    private final SelenideElement frequencyOccurrenceSmell = $("[type='radio'][value='Каждый день']").parent();
    @Test
    @Step("Выбор периодичности появления запахов.")
    @И("Выбор периодичности появления запахов.")
    public void FrequencyOccurrence() {
        frequencyOccurrenceSmell.click();

    }
}
