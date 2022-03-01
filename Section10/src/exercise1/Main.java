package exercise1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Room rent[] = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #"+i+":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int number = sc.nextInt();
			rent[number] = new Room(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i=0; i<10; i++) {
			if(rent[i] != null) {
				System.out.println(i+": "+rent[i]);
			}
		}
		
		
		sc.close();

	}

}
