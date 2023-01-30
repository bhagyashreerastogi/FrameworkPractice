package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features="src/test/resources/HooksDemo/hooksDemo.feature"
,glue={"StepsForHooks"},
monochrome=true,

plugin={"pretty","html:target/HtmlReports",
		"json:target/JSONReports/report.json",
		"junit:target/JUnitReports/report.xml"}
		)


public class TRForHooks {

}
