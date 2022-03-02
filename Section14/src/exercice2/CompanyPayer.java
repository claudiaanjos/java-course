package exercice2;

public class CompanyPayer extends TaxPayer {

	private Integer employeesNumber;

	public CompanyPayer(String name, Double annualIncome, Integer employeesNumber) {
		super(name, annualIncome);
		this.employeesNumber = employeesNumber;
	}

	public Integer getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public double tax() {
		if(employeesNumber > 10) {
			return getAnnualIncome() * 0.14;
		} 
		return getAnnualIncome() * 0.16;
	}
	
	
	
}
