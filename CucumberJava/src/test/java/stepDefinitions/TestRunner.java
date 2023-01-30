package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features="src/test/resources/features/Login.feature"
,glue={"stepDefinitions"},
monochrome=true,

/*plugin={"pretty","html:target/HtmlReports",
		"json:target/JSONReports/report.json",
		"junit:target/JUnitReports/report.xml"}*/



plugin={"pretty","html:target/HtmlReports",
		"json:target/cucumber.json",
		})

public class TestRunner {
}
