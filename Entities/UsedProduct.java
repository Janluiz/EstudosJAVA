package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private Date manufectureDate;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct(String name, Double price, Date manufectureDate) {
		super(name, price);
		this.manufectureDate = manufectureDate;
	}

	public String priceTag() {
		return name + " (used) $ " + price + " (manufecture date: " + sdf.format(manufectureDate) + ")";
	}
	
	
}
