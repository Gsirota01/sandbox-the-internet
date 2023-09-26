
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = {"actions"},
                 plugin = { "html:reports/html-report.html" },
                 features = {"src/test/resources/features"})
public class Runner extends AbstractTestNGCucumberTests {
}



