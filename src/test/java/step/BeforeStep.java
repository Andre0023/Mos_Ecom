package step;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;

public class BeforeStep {
    @Given("Открыть сайт {string}")
    public void OpenMsecom(String url) {
        Selenide.open(url);
    }
}
