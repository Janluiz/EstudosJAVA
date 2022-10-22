package aplicattion;
import java.util.Scanner;

import Entities.Student;
public class Program3 {

	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		Student student = new Student();
		student.nomeAluno = jc.nextLine();
		student.nota1 = jc.nextDouble();
		student.nota2 = jc.nextDouble();
		student.nota3 = jc.nextDouble();
		
		double media = student.Media(student.nota1,student.nota2,student.nota3);
		if (media >= 60) {
			System.out.printf("FINAL GRADE = " + media +"\n");
			System.out.println("PASS");}
		else {
				System.out.println("FINAL GRADE = " + media);
				System.out.println("FAILED");
				double num = 60 - media;
				System.out.println("MISSING " + num + " POINTS");
			}	
		
	}

}
