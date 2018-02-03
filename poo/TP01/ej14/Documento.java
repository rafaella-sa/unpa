package ej14;

public class Documento {
	protected String titulo;
	protected String autor;
	protected String editorial;
	protected int ano;
	public Documento(String titulo, String autor, String editorial, int ano){
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.ano = ano;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
