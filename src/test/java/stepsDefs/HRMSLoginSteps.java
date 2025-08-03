package stepsDefs;

import static org.testng.Assert.assertTrue;

import base.BaseTest;
import config.configReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;
public class HRMSLoginSteps extends BaseTest{
	
	LoginPage loginP;
    DashboardPage dashboardP;

    
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
    	loginP = new LoginPage(BaseTest.driver);
        loginP.open(configReader.get("baseUrl"));
       // throw new io.cucumber.java.PendingException();
    }
    
    @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() throws InterruptedException {
    
    	Thread.sleep(5000);
    	loginP.login(configReader.get("username"), configReader.get("password"));
    	dashboardP = new DashboardPage(BaseTest.driver);
       
    }
    
    @Then("the dashboard should be visible")
    public void the_dashboard_should_be_visible() throws InterruptedException {
    	Thread.sleep(5000);
    	dashboardP.salary_menu();
    	Thread.sleep(5000);

    }
    
    @When("the user clicks generate salary")
    public void the_user_clicks_generate_salary() {
        System.out.print("the user clicks generate salary step is passed ");

    }

    @Then("the salary should be generated")
    public void the_salary_should_be_generated() {
        System.out.print("the salary should be generated step is passed");

    }
}
