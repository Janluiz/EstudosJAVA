package Entities;

public class Orderitem {
	public Integer quantity;
	public Double price;
		
	public Orderitem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}
	

	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Double subTotal() {
		return quantity * price;
		
	}


    public static Orderitem valueOf(String next) {
        return null;
    }

}
