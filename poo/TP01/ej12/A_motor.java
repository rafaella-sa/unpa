package ej12;

public class A_motor extends Barco{
	protected int potenciacv;
	protected A_motor(int matricula, int eslora, int ano, int potenciacv){
		super(matricula, eslora, ano);
		this.potenciacv = potenciacv;
	}
	public int getPotenciacv() {
		return potenciacv;
	}
	public void setPotenciacv(int potenciacv) {
		this.potenciacv = potenciacv;
	}
	protected double calcularModulo(){
		return super.calcularModulo() + potenciacv;
	}
}
