package exercice1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> product = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #"+i+" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char choice = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(choice == 'i') {
				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();
				product.add(new ImportedProduct(name, price, fee));
			}
			else if(choice == 'c') {
				product.add(new Product(name, price));
			}
			else if(choice == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				product.add(new UsedProduct(name, price, date));
			}
		}
		
		System.out.println("\nPRICE TAGS: ");
		for(Product p: product) {
			System.out.println(p.priceTag());
		}
		
		sc.close();

	}

}
