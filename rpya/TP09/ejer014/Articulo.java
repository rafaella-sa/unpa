package ejer014;

public class Articulo {
	private String nombre;
	private String descripcion;
	private float precio;
	public int stock;
	private int codigo;
	//constructor
	Articulo (String nom, String descr, float prec, int cod)
	{ 
	nombre=nom;
	descripcion=descr;
	precio=prec;
	codigo=cod;
	stock=0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
