package etap;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.ru.*;

public class BeforStep {
    @Дано("Открыть {string}")
    public void OpenMsecom(String url) {
        Configuration.browserSize = "1920x1080";
        Selenide.open(url);
    }
}
