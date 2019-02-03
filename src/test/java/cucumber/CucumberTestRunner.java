package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

/**
 * @author Thanh Le
 * @Modified Swapna Anne
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        //strict = true,
        features = {"src/test/resources/features/demo.feature"},
        plugin = {"json:test-output/report.json", "html:test-output/report.html"},
        monochrome = false,
        tags = {},
        glue = {"cucumber.steps"}
)
public class CucumberTestRunner{
}

