package ej11;

public class Diario extends Publicacion{
	protected double recargo;
	protected int semana;
	protected Diario (String titulo, String persona, int codigo, String editor, int cantpag, double precio, int ano, int mes, double recargo, int semana){
		super(titulo, persona, codigo, editor, cantpag, precio, ano, mes);
		this.recargo = recargo;
		this.semana = semana;
		
	}
	public double getRecargo() {
		return recargo;
	}
	public void setRecargo(double recargo) {
		this.recargo = recargo;
	}
	public int getSemana() {
		return semana;
	}
	public void setSemana(int semana) {
		this.semana = semana;
	}
}
