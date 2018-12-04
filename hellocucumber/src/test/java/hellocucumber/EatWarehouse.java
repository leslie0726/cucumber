package hellocucumber;

public class EatWarehouse {
	
	private final int  num;

	public EatWarehouse(int num) {
		this.num = num;
	}
	
	public int Eating(int num) {
		return this.num - num; 
	}
	

	
}
