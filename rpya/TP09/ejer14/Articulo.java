package ejer14;

public class Articulo {
	private String nombre;
	private String descripcion;
	private double precio;
	private int stock;
	private int codigo;
	//constructor
	public Articulo (String nom, String descr, float prec, int cod)
	{ 
	nombre=nom;
	descripcion=descr;
	precio=prec;
	codigo=cod;
	stock=0;
	}
	
	public Articulo()
	{ 
	nombre="";
	descripcion="";
	precio=0;
	codigo=0;
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}



