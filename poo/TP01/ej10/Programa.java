package ej10;
public class Programa {
	//atributos
	protected String titulo;
	protected String respdir;
	protected int codigo;
	protected int duracion;
	protected double horainicio;
	protected String emisora;
	//constructor
	public Programa(String titulo, String respdir, int codigo, int duracion, double horainicio, String emisora){
		this.titulo = titulo;
		this.respdir = respdir;
		this.codigo = codigo;
		this.duracion = duracion;
		this.horainicio = horainicio;
		this.emisora = emisora;
	}
	//devuelve el t�tulo
	protected String getTitulo() {
		return titulo;
	}
	//cambia el t�tulo
	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	//devuelve el responsable de la direcci�n de publicaci�n
	protected String getRespdir() {
		return respdir;
	}
	//cambia el responsable de la direcci�n de publicaci�n
	protected void setRespdir(String respdir) {
		this.respdir = respdir;
	}
	//devuelve el c�digo
	protected int getCodigo() {
		return codigo;
	}
	//cambia el c�digo
	protected void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	//devuelve la duraci�n
	protected int getDuracion() {
		return duracion;
	}
	//cambia la duraci�n
	protected void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	//devuelve la hora de inicio
	protected double getHorainicio() {
		return horainicio;
	}
	//cambia la hora de inicio
	protected void setHorainicio(double horainicio) {
		this.horainicio = horainicio;
	}
	//devuelve la emisora
	protected String getEmisora() {
		return emisora;
	}
	//cambia la emisora
	protected void setEmisora(String emisora) {
		this.emisora = emisora;
	}
}
