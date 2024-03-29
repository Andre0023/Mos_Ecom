package step;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SendForm {
    private final SelenideElement send0 = $("[id='quiz-page-id-0']").$(byText("Ответить"));
    private final SelenideElement send1 = $("[id='quiz-page-id-1']").$(byText("Ответить"));
    private final SelenideElement send2 = $("[id='quiz-page-id-2']").$(byText("Ответить"));
    private final SelenideElement send3 = $("[id='quiz-page-id-3']").$(byText("Ответить"));
    @And("Нажать кнопку Отправить 1")
    public void SendFormOne() {
       send0.click();

    }
    @And("Нажать кнопку Отправить 2")
    public void SendFormTwo() {

        send1.click();
    }
    @And("Нажать кнопку Отправить 3")
    public void SendFormThree() {

        send2.click();
    }
    @And("Нажать кнопку Отправить 4")
    public void SendFormFour() {

        send3.click();


    }
}
