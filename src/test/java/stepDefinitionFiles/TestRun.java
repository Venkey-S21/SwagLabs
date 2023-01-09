package stepDefinitionFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFolder",glue= {"stepDefinitionFiles"},
monochrome = true,
plugin = {"pretty", "html:target/HTML/report.html",
		"json:target/Json/report.json",
		"junit:target/Junit/report.xml"
		
}
)

public class TestRun {

}
