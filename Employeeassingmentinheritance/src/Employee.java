
public abstract class Employee {
	
	protected String name;
	protected double salary;
	protected String ssn;
	protected final int employeeId;
	protected static int nextId;
	
	
	public Employee(String name, double salary, String ssn) {
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
		this.employeeId = nextId++;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public static int getNextId() {
		return nextId;
	}


	public int getEmployeeId() {
		return employeeId;
	}
	
	abstract double getPay();
		
		 
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", ssn=" + ssn + ", employeeId=" + employeeId + "]";
	}
		
	
}
