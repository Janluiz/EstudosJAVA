package aplicattion;

import java.util.Scanner;
import Entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Enter rectangle width and height: ");
		triangulo.width = jc.nextDouble();
		triangulo.height = jc.nextDouble();
		
		double area = triangulo.Area(triangulo.width,triangulo.height);
		System.out.printf("AREA = %.2f", area);
		System.out.println(" ");
		double perimetro = triangulo.Perimetro(triangulo.width,triangulo.height);
		System.out.printf("PERIMETRO = %.2f", perimetro);
		System.out.println(" ");
		double diagonal = triangulo.Diagonal(triangulo.width,triangulo.height);
		System.out.printf("DIAGONAL = %.2f", diagonal);	
	
	}
	}