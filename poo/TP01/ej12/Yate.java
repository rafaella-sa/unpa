package ej12;

public class Yate extends Barco{
	protected int potenciacv;
	protected int camarotes;
	protected Yate(int matricula, int eslora, int ano, int potenciacv, int camarotes){
		super(matricula, eslora, ano);
		this.potenciacv = potenciacv;
		this.camarotes = camarotes;
	}
	public int getPotenciacv() {
		return potenciacv;
	}
	public void setPotenciacv(int potenciacv) {
		this.potenciacv = potenciacv;
	}
	public int getCamarotes() {
		return camarotes;
	}
	public void setCamarotes(int camarotes) {
		this.camarotes = camarotes;
	}
	protected double calcularModulo(){
		return super.calcularModulo() + potenciacv + camarotes;
	}
}
