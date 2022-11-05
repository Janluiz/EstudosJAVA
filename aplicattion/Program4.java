package aplicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import Entities.Client;
import Entities.Orderitem;
import Entities.Products;
import Enums.OrderStatus;

public class Program4 {

	public static void main(String[] args) throws ParseException {
		Scanner jc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		LocalDate d01 = LocalDate.now();
		int i;
		
		System.out.println("Enter cliente data:");
		System.out.print("name: ");
		String name = jc.next();
		System.out.print("Email: ");
		String email = jc.next();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birth = sdf.parse(jc.next());
		Client cliente = new Client(name,email, birth);
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		Orderitem status = Orderitem.valueOf(jc.next());
		System.out.print("How many items to this order? ");
		int n = jc.nextInt();
		for(i = 1; i <= n; i++) {
			System.out.printf("Enter #%d item data: ",i);
			System.out.println("");
			System.out.print("Product name: ");
			String nameee = jc.next();
			System.out.print("Product price: ");
			Double price = jc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = jc.nextInt();
			Products produto = new Products(nameee, price);
			Orderitem order = new Orderitem(quantity, price);
		}
		
		System.out.println("ORDER SUMMARY: ");
		System.out.println("Order moment: ");
		System.out.println("Order Status: " + Orderitem.PROCESSING);
		System.out.println(cliente.toString());
		System.out.println("Order items: ");
		System.out.println();

	}

}
