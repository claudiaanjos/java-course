package exercise1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		if(answer == 'Y' || answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);
		} 
		
		account = new Account(number, name);
		 
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		account.deposit(value);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		sc.close();

	}

}
