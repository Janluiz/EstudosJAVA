package Exercicios;

import java.util.Locale;
import java.util.Scanner;
public class EX2 {

	public static void main(String[] args) {
		
		Scanner jc = new Scanner(System.in);
		float val1,val2, preco1,preco2,precotot;
		int num1, num2, qnt1,qnt2;
		num1 = jc.nextInt();
		qnt1 = jc.nextInt();
		val1 = jc.nextFloat();		
		num2 = jc.nextInt();
		qnt2 = jc.nextInt();
		val2 = jc.nextFloat();
		
		preco1 = qnt1 * val1;
		preco2 = qnt2 * val2;
		precotot = preco1 + preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", precotot);		
				
	}

}

