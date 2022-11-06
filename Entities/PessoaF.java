package Entities;

import Entities.pessoa;

public class pessoaF extends pessoa {
	private Double gastos;
	
	public pessoaF(String name, Double renda,Double gastos) {
		super(name, renda);
		this.gastos = gastos;
	}

	public Double getGastos() {
		return gastos;
	}

	public void setGastos(Double gastos) {
		this.gastos = gastos;
	}
	@Override
	public Double imposto() {
		if (renda < 20000) {
			return (renda * 0.15) - (gastos * 0.50);
		}else {
			return (renda * 0.25) - (gastos * 0.50);
		}
	}
	@Override
	public String toStringg() {
		return name + ": $ " + renda;
	}
}