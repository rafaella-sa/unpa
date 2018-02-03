package ej09;
public class Auto {
	int patente, movimientos;	
	public Auto(){
		patente = 0;
		movimientos = 0;
	}
	public Auto(int pat){
		this.patente = pat;
		movimientos = 0;
	}
	public int getPatente() {
		return patente;
	}
	public void setPatente(int patente) {
		this.patente = patente;
	}
	public int getMovimientos(){
		return movimientos;
	}
	public void setMovimientos(){
		this.movimientos++;
	}
}
