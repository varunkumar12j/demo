package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue="stepDefinations",stepNotifications=true,tags ="@webTest",plugin= {"pretty","html:target/fileN.html","junit:target/fileN.xml","json:target/fileN.json"}
, monochrome=true)
public class TestRunner {

}
