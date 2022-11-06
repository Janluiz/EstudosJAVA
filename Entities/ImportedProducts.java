package Entities;

public class ImportedProducts extends Product {
	private Double customFee;
	
	public ImportedProducts(String name, Double price,Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}
	
	public String priceTag() {
		return name + " $ " + price + " (Customs fee: $ " + customFee;
	}
	
	
	

}
