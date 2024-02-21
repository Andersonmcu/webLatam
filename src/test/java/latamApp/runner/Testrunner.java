package latamApp.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/latamApp/features",
        glue = ("seleniumgluecode")
)

public class Testrunner {
}
