package ej14;
public class Articulo {
	private String descripcion;
	private double precio;
	private int codigo, stock;	
	public Articulo(double p, int c, int s, String d){
		descripcion = d;
		precio = p;
		codigo = c;
		stock = s;
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
