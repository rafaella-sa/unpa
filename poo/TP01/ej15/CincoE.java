package ej15;

public class CincoE extends Hotel{
	protected char gym;
	protected String nomrest;
	protected int caprest;
	protected int cantsalones;
	protected int cantsuites;
	protected int cantlim;
	protected CincoE(int canthab, int numcamas, int cantpisos, double preciohab, char gym, String nomrest, int caprest, int cantsalones, int cantsuites, int cantlim){
		super(canthab, numcamas, cantpisos, preciohab);
		this.gym = gym;
		this.nomrest = nomrest;
		this.caprest = caprest;
		this.cantsalones = cantsalones;
		this.cantsuites = cantsuites;
		this.cantlim = cantlim;
		}
	public char getGym() {
		return gym;
	}
	public void setGym(char gym) {
		this.gym = gym;
	}
	public String getNomrest() {
		return nomrest;
	}
	public void setNomrest(String nomrest) {
		this.nomrest = nomrest;
	}
	public int getCaprest() {
		return caprest;
	}
	public void setCaprest(int caprest) {
		this.caprest = caprest;
	}
	public int getCantsalones() {
		return cantsalones;
	}
	public void setCantsalones(int cantsalones) {
		this.cantsalones = cantsalones;
	}
	public int getCantsuites() {
		return cantsuites;
	}
	public void setCantsuites(int cantsuites) {
		this.cantsuites = cantsuites;
	}
	public int getCantlim() {
		return cantlim;
	}
	public void setCantlim(int cantlim) {
		this.cantlim = cantlim;
	}
	protected double calcularPrecio(){
		double precio = super.calcularPrecio();
		if(this.getCaprest() < 30)
			precio = precio + 10;
		else if(this.getCaprest() <= 50)
			precio = precio + 30;
		else
			precio = precio + 50;
		if(this.getGym() == 'a' | this.getGym() == 'A')
			precio = precio + 50;
		else
			precio = precio + 30;
		precio = precio + (15 * this.getCantlim());
		return precio;
		}
}
