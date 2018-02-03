package Ejer10;

public class Auto {
	private String patente;
	private int cant;
	//CONSTRUCTOR
	
	public Auto(String pat){
			patente=pat;
			cant=0;
		}
	public Auto(){
			patente="";
			
		}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant){
		this.cant=cant;
	}
	}
	
