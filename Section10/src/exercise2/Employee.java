package exercise2;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void salaryIncrease(double percentage) {
		this.salary = salary + (salary * percentage / 100.0); 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

}
