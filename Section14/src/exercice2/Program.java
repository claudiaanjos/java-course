package exercice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+i+" data");
			System.out.print("Individual or company (i/c)? ");
			char choice = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.next();
			String name = sc.nextLine();
			System.out.print("Annual Income: ");
			double annualIncome = sc.nextDouble();
			
			if(choice == 'c'){
				System.out.print("Number of employees: ");
				int employeesNumber = sc.nextInt();
				list.add(new CompanyPayer(name, annualIncome, employeesNumber));
			} else if(choice == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new IndividualPayer(name, annualIncome, healthExpenditures));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
		}
		
		System.out.println();
		double sum = 0.0;
		for (TaxPayer tp : list) {
			sum += tp.tax();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
		
	}

}
