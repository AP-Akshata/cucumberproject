package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature\\tag_demo.feature",glue= {"stepDef"},plugin= {"html:target/cucumber.html"},tags= {"@SmokeTest","@RegressionTest"})
public class RunnerClass {

}
