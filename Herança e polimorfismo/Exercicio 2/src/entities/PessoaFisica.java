package entities;

public class PessoaFisica extends Pessoa {
	
	private Double healthExpenditures;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double annualIncome, Double healthExpenditures) {
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
		if (getAnnualIncome() < 20000) {
			tax = getAnnualIncome() * 0.15;
		} else {
			tax = getAnnualIncome() * 0.25;
		}
		
		tax -= getHealthExpenditures() * 0.5;
		
		if (tax < 0.0) {
			tax = 0.0;
		}
		
		return tax;
	}

}
