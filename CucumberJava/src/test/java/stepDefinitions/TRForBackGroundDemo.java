package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features="src/test/resources/BackGroundDemo/BackGroundDemo.feature"
,glue={"StepsForBackground"},
monochrome=true,

plugin={"pretty","html:target/HtmlReports",
		"json:target/JSONReports/report.json",
		"junit:target/JUnitReports/report.xml"}
		)

public class TRForBackGroundDemo {

}
