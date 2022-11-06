package Entities;

public class pessoaJ extends pessoa{
	private int func;
	public pessoaJ(String name, Double renda, int func) {
		super(name, renda);
		this.func = func;
	}
	public int getFunc() {
		return func;
	}
	public void setFunc(int func) {
		this.func = func;
	}
	@Override
	public Double imposto() {
		if (func > 10) {
			return (renda * 0.14);
		}else {
			return (renda * 0.16);
		}
	}
	@Override
	public String toString() {
		return name + ": $ " + renda;
	}

}
