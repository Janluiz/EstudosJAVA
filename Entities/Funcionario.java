package Entities;

public class Funcionario {
	public String name;
	public double salario;
	public double tax;
		

public double NetSalary() {
	return salario - tax;
}

public void IncreaseSalary(double x) {
	salario += salario  * x/100;