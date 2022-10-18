package Exercicios;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		String product = "Computer";
		String product1 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price = 2100.0;
		double price1 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf(product + ", which price is $ %.2f\n", price);
		System.out.printf(product1+ ", which price is $ %.2f", price1);
		System.out.println("\n");
		System.out.printf("Record: " + age + " years old, " + "code " + code + " and " +"gender: " + gender);
		System.out.println("\n");
		System.out.printf("Measure with eight decimal places: %.8f\n", measure);
		System.out.printf("Rouded (tree decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Us decimal point: %.3f", measure);
		
		
		
	}

}
