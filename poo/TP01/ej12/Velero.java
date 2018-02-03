package ej12;

public class Velero extends Barco {
	protected int numero;	
	protected Velero(int matricula, int eslora, int ano, int numero){
		super(matricula, eslora, ano);
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	protected double calcularModulo(){
		return super.calcularModulo() + numero;
	}
}
