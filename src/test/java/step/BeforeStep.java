package step;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;

public class BeforeStep {
    @Given("Открыть сайт {string}")
    public void OpenMsecom(String url) {
        Configuration.browserSize = "1920x1080";
        Selenide.open(url);
    }
}
