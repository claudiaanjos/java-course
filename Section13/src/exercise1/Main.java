package exercise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		//Client(String name, String email, Date birthDate)
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next()); //converte a String para o enum
		
		//Order(Date moment, OrderStatus status, Client client)
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #"+i+" item data");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			//Product(String name, Double price)
			Product product = new Product(productName, price);
			
			//OrderItem(Integer quantity, Double price, Product product)
			order.addItem(new OrderItem(quantity, price, product));
			
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();

	}

}
