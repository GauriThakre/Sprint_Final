package Stepdefination;

import Excel.ReadData;
import Pages.DashboardPage;
import Pages.EmplistPage;
import Pages.Loginpage;
import Pages.Reset;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResetEmployee {
	@Given("I have already logged in OrangeHrm and navigates to employee list tab")
	public void i_have_already_logged_in_orange_hrm_and_navigates_to_employee_list_tab() {
		try{String url =ReadData.config("url");
		Loginpage.lpage(url);
		DashboardPage.pimTab();
		System.out.println("step 4 passed");}catch(Exception e) {
			System.out.println("error");
		}
		
	}

	@When("the employee information  details is entered")
	public void the_employee_information_details_is_entered() {
try {
		EmplistPage.Employeelist();
		EmplistPage.Employeename("odis Aldawis ");
		EmplistPage.EmployeeId("0002");
		EmplistPage.SupervisourName("john smith");
}catch(Exception e) {
	System.out.println("error");
	
}

	}

	@When("click the reset")
	public void click_the_reset() {
   
		try{
			Reset.reset();
		}catch(Exception e) {
			System.out.println("error in when");
		}

	}

	@Then("the employee details will be reset.")
	public void the_employee_details_will_be_reset() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("The employee information is not entered")
	public void the_employee_information_is_not_entered() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("no change will occur")
	public void no_change_will_occur() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


}
