package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features="src/test/resources/featuresWithTags"
,glue={"stepDefinitions"}
,tags= {"@mustRun"}

)

public class TR_RunWithSingleTag {
}