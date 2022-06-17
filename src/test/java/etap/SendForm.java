package etap;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.ru.*;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SendForm {
    private final SelenideElement send0 = $("[id='quiz-page-id-0']").$(byText("Ответить"));
    private final SelenideElement send1 = $("[id='quiz-page-id-1']").$(byText("Ответить"));
    private final SelenideElement send2 = $("[id='quiz-page-id-2']").$(byText("Ответить"));
    private final SelenideElement send3 = $("[id='quiz-page-id-3']").$(byText("Ответить"));
    @И("Нажать кнпку Отправить 1.")
    public void SendFormOne() {
       send0.click();

    }
    @И("Нажать кнпку Отправить 2.")
    public void SendFormTwo() {

        send1.click();
    }
    @И("Нажать кнпку Отправить 3.")
    public void SendFormThree() {

        send2.click();
    }
    @И("Нажать кнпку Отправить 4.")
    public void SendFormFour() {

        send3.click();


    }
}
