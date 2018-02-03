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
	//devuelve el título
	protected String getTitulo() {
		return titulo;
	}
	//cambia el título
	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	//devuelve el responsable de la dirección de publicación
	protected String getRespdir() {
		return respdir;
	}
	//cambia el responsable de la dirección de publicación
	protected void setRespdir(String respdir) {
		this.respdir = respdir;
	}
	//devuelve el código
	protected int getCodigo() {
		return codigo;
	}
	//cambia el código
	protected void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	//devuelve la duración
	protected int getDuracion() {
		return duracion;
	}
	//cambia la duración
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
