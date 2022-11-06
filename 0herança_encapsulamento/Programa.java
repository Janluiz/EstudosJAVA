package aplicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entities.ImportedProducts;
import Entities.Product;
import Entities.UsedProduct;


public class Programa {

	public static void main(String[] args) throws ParseException {
		List<Product> lista = new ArrayList<Product>();
		 Scanner sc = new Scanner(System.in);
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for(int j = 1; j <= n; j++) {
			System.out.printf("Product #" + j + " data:");
			System.out.println("");
			System.out.print("Common, used or imported (c/u/i)? ");
			char choice = sc.next().charAt(0);
			System.out.print("Name: ");
			String Name = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if (choice == 'i') {
				System.out.print("Custom fee: ");
				Double fee = sc.nextDouble();
				ImportedProducts imp = new ImportedProducts(Name,price,fee);
				lista.add(imp);
			}else if(choice == 'c') {
				Product produto = new Product(Name,price);
				lista.add(produto);
			}else if(choice == 'u') {
				System.out.print("Manufecture date (DD/MM/YYYY): ");
				Date usedd = sdf.parse(sc.next());
				UsedProduct usado = new UsedProduct(Name, price, usedd);
				lista.add(usado);
				}
		}
		System.out.println("PRICE TAGS: ");
		for(Product c : lista){
			System.out.println(c.priceTag());
		}
	}
	

}
