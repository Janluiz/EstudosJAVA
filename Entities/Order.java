package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	private Client cliente;
	
	private List<Orderitem> items = new ArrayList<Orderitem>();
	
	public void additem(Orderitem item) {
		items.add(item);
		
	}
	public void removeitem(Orderitem item) {
		items.remove(item);
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public Client getCliente() {
		return cliente;
	}
	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	}
	public void setItems(List<Orderitem> items) {
		this.items = items;
	}
	
	public double Total() {
		double sum = 0.0;
		for(Orderitem it : items ) {
			sum += it.subTotal();
		}
	
	
	

}
