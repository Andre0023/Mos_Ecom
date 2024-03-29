package etap;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SendForm {
    private final SelenideElement send0 = $("[id='quiz-page-id-0']").$(byText("Ответить"));
    private final SelenideElement send1 = $("[id='quiz-page-id-1']").$(byText("Ответить"));
    private final SelenideElement send2 = $("[id='quiz-page-id-2']").$(byText("Ответить"));
    private final SelenideElement send3 = $("[id='quiz-page-id-3']").$(byText("Ответить"));
    @Test
    @Step("Нажать кнопку Отправить")
    @И("Нажать кнопку Отправить 1.")
    public void SendFormOne() {
       send0.click();

    }
    @Test
    @Step("Нажать кнопку Отправить")
    @И("Нажать кнопку Отправить 2.")
    public void SendFormTwo() {

        send1.click();
    }
    @Test
    @Step("Нажать кнопку Отправить")
    @И("Нажать кнопку Отправить 3.")
    public void SendFormThree() {

        send2.click();
    }
    @Test
    @Step("Нажать кнопку Отправить")
    @И("Нажать кнопку Отправить 4.")
    public void SendFormFour() {

        send3.click();


    }
}
