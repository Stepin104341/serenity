package testRunners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue= {"stepDefinations"},
        plugin = { "html:target/Report-html"})

public class Runner 
{

}
