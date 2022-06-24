import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PageEco {


    @Test
    @DisplayName("Open mosecom.mos.ru")
    void pageEco() {
        Configuration.browserSize = "1920x1080";
        open("https://mosecom.mos.ru");


        $(byText("Ответить")).scrollTo();

        $("#address-autocomplete").setValue("открытое");

        $(byText("город Москва, Открытое шоссе, дом 19А")).click();


        $("[id='quiz-page-id-0']").$(byText("Ответить")).click();


        $("[type='radio'][value='Другое']").parent().click();
        $("[name='smell_type_custom']").setValue("Клопы");
        $("[id='quiz-page-id-1']").$(byText("Ответить")).click();

        $("[id='report-date']").click();

        $(byText("16")).click();

        $(".multi-selector-input").$(byText("Выберите временные отрезки")).click();
        $("[type='checkbox'][value='2']").parent().click();

        $("[id='quiz-page-id-2']").$(byText("Ответить")).click();

        $("[type='radio'][value='Каждый день']").parent().click();

        $("[id='quiz-page-id-3']").$(byText("Ответить")).click();
        $(".quiz-air-quality-inline-form").shouldHave(text("Оставьте комментарий"));







    }
}