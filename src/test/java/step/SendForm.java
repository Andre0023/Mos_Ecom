package step;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SendForm {
    private final SelenideElement send = $("[id='quiz-page-id-0']").$(byText("Ответить"));
    @And("Нажать кнпку Отправить")
    public void SendForm() {
        send.click();

    }
}
