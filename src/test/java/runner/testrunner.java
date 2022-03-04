package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
        glue = {"seleniumgluecode"},
        plugin = {"pretty", "html:target/htmlReports/htmlReport.html", "json:target/JsonReports/report.json", "junit:target/XmlReports/report.xml"},
        tags = "@firsttest")
public class testrunner {
}
