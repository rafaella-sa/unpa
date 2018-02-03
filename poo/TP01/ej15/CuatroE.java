package ej15;

public class CuatroE extends Hotel{
	protected char gym;
	protected String nomrest;
	protected int caprest;
	protected CuatroE(int canthab, int numcamas, int cantpisos, double preciohab, char gym, String nomrest, int caprest){
		super(canthab, numcamas, cantpisos, preciohab);
		this.gym = gym;
		this.nomrest = nomrest;
		this.caprest = caprest;
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
		return precio;
		}
}
