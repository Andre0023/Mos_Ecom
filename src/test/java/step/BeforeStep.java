package step;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.BeforeEach;

public class BeforeStep {
    @BeforeEach
    @Given("Открыть сайт {string}")
    public void OpenMsecom(String url) {
        Configuration.browserSize = "1920x1080";
        Selenide.open(url);


    }
}
