package ej07;
public class Billetera {
	private int dos, cinco, diez, veinte, cincuenta, cien;
	public Billetera(){
		dos = 0;
		cinco = 0;
		diez = 0;
		veinte = 0;
		cincuenta = 0;
		cien = 0;
	}
	public void setDosPesos(int cantnotas){
		this.dos = this.dos + (2 * cantnotas);
	}
	public int getDosPesos(){
		return dos;
	}
	public void setCincoPesos(int cantnotas){
		this.cinco = this.cinco + (5 * cantnotas);
	}
	public int getCincoPesos(){
		return cinco;
	}
	public void setDiezPesos(int cantnotas){
		this.diez = this.diez + (10 * cantnotas);
	}
	public int getDiezPesos(){
		return diez;
	}
	public void setVeintePesos(int cantnotas){
		this.veinte = this.veinte + (20 * cantnotas);
	}
	public int getVeintePesos(){
		return veinte;
	}
	public void setCincuentaPesos(int cantnotas){
		this.cincuenta = this.cincuenta + (50 * cantnotas);
	}
	public int getCincuentaPesos(){
		return cincuenta;
	}
	public void setCienPesos(int cantnotas){
		this.cien = this.cien + (100 * cantnotas);
	}
	public int getCienPesos(){
		return cien;
	}
	public int getTotal(){
		int total = dos + cinco + diez + veinte + cincuenta + cien;
		return total;
	}
}
