package ejer09;

public class Auto {
	private String patente;
	private int cant;
	
	Auto(String pat){
		patente=pat;
		cant=0;
	}
	Auto(){
		patente="";
		
	}

	public String getPatente() {
		return patente;
	}
	public int getcant(){
		return cant;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	public void aumentar(){
		cant++;
	}
	}

