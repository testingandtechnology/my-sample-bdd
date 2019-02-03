package cucumber.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @author Thanh Le
 */
public class Hooks extends BaseStep {
    @Before
    public void setUp(Scenario scenario) throws Exception {
        System.out.println("=============================================START============================================");
        System.out.println("|| Scenario: " + scenario.getName());
        System.out.println("==============================================================================================");
        startWeb();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            captureScreenShot(scenario);
        }
        //stopWeb();
        System.out.println("=============================================END==============================================");
    }
}