package ej01;

public class Cancion {
	protected String titulo;
	protected double duracion;
	protected String estilo;
	protected String autor;
	
	public Cancion (String titulo, double duracion, String estilo, String autor){
		this.titulo = titulo;
		this.duracion = duracion;
		this.estilo = estilo;
		this.autor = autor;
	}
	
	public void setTitulo (String titulo){
		this.titulo = titulo;
	}
	
	public String getTitulo (){
		return titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
