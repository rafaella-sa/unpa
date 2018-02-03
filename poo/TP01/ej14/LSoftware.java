package ej14;

public class LSoftware extends Documento{
	private String formato, licencia;
	public LSoftware (String titulo, String autor, String editorial, int ano, String formato, String licencia){
		super(titulo, autor, editorial, ano);
		this.formato = formato;
		this.licencia = licencia;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getLicencia() {
		return licencia;
	}
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	
}