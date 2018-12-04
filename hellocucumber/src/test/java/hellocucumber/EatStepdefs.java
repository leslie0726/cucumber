package hellocucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

//class IsItFriday{
//	static String isItFriday(String today) {
//		if(today.equals("Friday")) {
//			return "TGIF";
//		}
//		return "Nope";
//	}
//}


public class EatStepdefs {
	
	EatWarehouse w;
	int num=0;
	@Given("^there are (\\d+) cucumbers$")
	public void there_are_cucumbers(int arg1) throws Exception {
	    w = new EatWarehouse(arg1);
	}

	@When("^I eat (\\d+) cucumbers$")
	public void i_eat_cucumbers(int arg1) throws Exception {
	   num = w.Eating(arg1);
	}

	@Then("^I should have (\\d+) cucumbers$")
	public void i_should_have_cucumbers(int arg1) throws Exception {
		assertEquals(arg1, num);
	}

}