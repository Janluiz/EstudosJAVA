package Entities;

public abstract class pessoa {
	protected String name;
	protected Double renda;
	public pessoa(String name, Double renda) {
		super();
		this.name = name;
		this.renda = renda;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public Double getRenda() {
		return renda;
	}
	public void setRenda(Double renda) {
		this.renda = renda;
	}
	
	public String toStringg() {
		return name + ": $ " + renda;
	}
	public Double imposto() {
		if (renda < 20000) {
			return (renda * 0.15);
		}else {
			return (renda * 0.25);
		}

}
}