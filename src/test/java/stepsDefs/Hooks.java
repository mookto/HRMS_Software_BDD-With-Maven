package stepsDefs;
import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Hooks extends BaseTest{

    @Before
    public void beforeScenario() {
        setup();
    }

    @After
    public void afterScenario() {
        tearDown();
    }
}
