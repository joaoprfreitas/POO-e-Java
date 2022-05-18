package entities;

public class PessoaJuridica extends Pessoa {
	
	private Integer numberOfEmployees;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if (numberOfEmployees > 10) {
			return getAnnualIncome() * 0.14;
		}
		
		return getAnnualIncome() * 0.16;
	}

}
