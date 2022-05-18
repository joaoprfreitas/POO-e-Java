package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<Pessoa>();
		
		System.out.print("Enter the number of tax payers: ");
		int nPayers = sc.nextInt();
		
		for (int i = 1; i <= nPayers; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				list.add(new PessoaFisica(name, annualIncome, healthExpenditures));
			} else if (ch == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				list.add(new PessoaJuridica(name, annualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID");
		
		for (Pessoa p : list) {
			System.out.println(p.getName() + ": $" + String.format("%.2f", p.tax()));
		}
		
		System.out.println();
		double total = 0;
		for (Pessoa p : list) {
			total += p.tax();
		}
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", total));
		
		sc.close();

	}

}
