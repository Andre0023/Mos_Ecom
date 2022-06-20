import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        publish = true)

public class RunCucumberTest {

    @BeforeClass
    static public void setup() {
        Configuration.headless = false;
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = false;
        Configuration.reportsFolder = "target/surefire-reports";
    }

}
