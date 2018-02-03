package ej15;

public class Hotel {
	protected int canthab;
	protected int numcamas;
	protected int cantpisos;
	protected double preciohab;

	public Hotel(int canthab, int numcamas, int cantpisos, double preciohab){
		this.canthab = canthab;
		this.numcamas = numcamas;
		this.cantpisos = cantpisos;
		this.preciohab = preciohab;
	}

	public int getCanthab() {
		return canthab;
	}

	public void setCanthab(int canthab) {
		this.canthab = canthab;
	}

	public int getNumcamas() {
		return numcamas;
	}

	public void setNumcamas(int numcamas) {
		this.numcamas = numcamas;
	}

	public int getCantpisos() {
		return cantpisos;
	}

	public void setCantpisos(int cantpisos) {
		this.cantpisos = cantpisos;
	}

	public double getPreciohab() {
		return preciohab;
	}

	public void setPreciohab(double preciohab) {
		this.preciohab = preciohab;
	}
	protected double calcularPrecio(){
		return 50.0 + (1 * this.numcamas);	
	}
}
