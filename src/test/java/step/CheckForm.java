package step;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CheckForm {

    private final SelenideElement checkNumber = $(".quiz-air-quality-inline-form");

    @And("Проверка формы 5 из 5")
    public void CheckForm() {
        checkNumber.shouldHave(text("Вопрос 5/5"));

    }
}
