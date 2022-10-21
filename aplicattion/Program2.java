package aplicattion;
import java.util.Scanner;

import Entities.Funcionario;
public class Program2 {
    Scanner jc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Name: ");
		funcionario.name = jc.nextLine();

		System.out.print("Gross salary: ");
		funcionario.salario = jc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = jc.nextDouble();
		
		double liquido = funcionario.NetSalary();
		System.out.printf("Employee: "+ funcionario.name +", $ " + liquido);
		System.out.println("");
		System.out.print("which percentage to increase salary: ");
		double au = jc.nextDouble();
		
		funcionario.IncreaseSalary(au);
		System.out.printf("Update data: " + funcionario.name + ", $ " + funcionario.salario);
		
		
		jc.close();
    
}
