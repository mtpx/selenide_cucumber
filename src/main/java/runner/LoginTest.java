package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/features/programs/Login.feature"},
                plugin = {"pretty"},
                glue = {"stepDefinition"})
public class LoginTest {
}