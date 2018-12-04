package hellocucumber;

public class IsItFriday {
	
	private final String today;
//	private final String actualAnswer;
	
	public IsItFriday(String today) {
		this.today = today;
	}

	
	
	public String isItFriday() {
		if(today.equals("Friday")) {
			return "TGIF";
		}
		return "Nope";
	}

}
