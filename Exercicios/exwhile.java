package Exercicios;
import java.util.Locale;
import java.util.Scanner;
public class exwhile {

	public static void main(String[] args) {
		
		Scanner jc = new Scanner(System.in);
		int x = jc.nextInt();
		int y = jc.nextInt();
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}else if(x > 0 && y < 0) {
				System.out.println("quarto");
			}else if(x < 0 && y < 0) {
				System.out.println("terceiro");
			}else if(x < 0 && y > 0 ) {
				System.out.println("segundo");
			}
			x = jc.nextInt();
			y = jc.nextInt();
		}
		System.out.println("saindo");
		jc.close();
	}
}