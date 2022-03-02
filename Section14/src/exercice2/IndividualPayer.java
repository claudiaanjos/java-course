package exercice2;

public class IndividualPayer extends  TaxPayer {

	private Double healthExpenditures;

	public IndividualPayer(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double tax;
		if (getAnnualIncome() < 20000.00) {
			tax = getAnnualIncome() * 0.15;
		} else {
			tax = getAnnualIncome() * 0.25;
		}
		tax = tax - (getHealthExpenditures() + 0.5);
		if(tax < 0.0) {
			tax = 0.0;
		}
		
		return tax;
	}
	
	
}
