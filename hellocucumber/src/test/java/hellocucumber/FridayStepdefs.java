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


public class FridayStepdefs {
	
	private IsItFriday iif;
	private String actualAnswer;
	
	@Given("^today is \"([^\"]*)\"$")
	public void today_is_Sunday(String today) throws Exception {
		iif = new IsItFriday(today);
	}
	

	@When("^I ask whether it's Friday yet$")
	public void i_ask_whether_it_s_Friday_yet() throws Exception {
	    actualAnswer = iif.isItFriday();
	}

	@Then("^I should be told \"([^\"]*)\"$")
	public void i_should_be_told(String expectedAnswer) throws Exception {
		assertEquals(expectedAnswer,actualAnswer);
	}
}