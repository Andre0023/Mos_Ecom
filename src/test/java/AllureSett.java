import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.qameta.allure.Attachment;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = "src/test/resources/features",
        glue = "com,pb.cucumbertest.stepdefinitions",
        monochrome = true,
        dryRun = false,
        tags = ("@all")
)

public class AllureSett {
    @BeforeClass
    static public void setup() {
        Configuration.headless = false;
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = false;
        Configuration.reportsFolder = "target/surefire-reports";
    }
    @Attachment
    public String performedActions(ActionSequence actionSequence) {
        return actionSequence.toString();
    }

    @Attachment(value = "Прокрутка экрана вниз.", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }

}




