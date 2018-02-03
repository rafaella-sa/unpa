package ej14;

public class RPapel extends Documento{
	private int volumen;
	private int numero;
	private int mes;
	
	public RPapel(String titulo, String autor, String editorial, int ano, int volumen, int numero, int mes){
		super(titulo, autor, editorial, ano);
		this.volumen = volumen;
		this.numero = numero;
		this.mes = mes;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
	
}
