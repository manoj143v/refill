package steprunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//features/flip.feature",
                  glue="org.stepdef",
                  dryRun=false,
                  monochrome=true,
                  plugin= {"pretty","html:target-html-output"}

                  )
public class testrun {

}
