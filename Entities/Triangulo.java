package Entities;

public class Triangulo {
    public double width;
	public double height;
	
	public double Area(double x, double y) {
		return x * y;
	}
	
	public double Perimetro(double x, double y) {
		return 2 * x + 2 * y;
	}
	
	public double Diagonal(double x, double y) {
		return Math.sqrt(x * x + y * y);
	}
}    
