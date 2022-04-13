
public class FullTime extends Employee {

	
	public FullTime(String name, double salary, String ssn) {
		super(name,salary, ssn);
		
	}
	double calculateBonus() {
		
		return 0.15 * this.salary;
		
	}
	
	@Override
	double getPay() {
		
		return this.salary / 26;
	}
	
	

}
