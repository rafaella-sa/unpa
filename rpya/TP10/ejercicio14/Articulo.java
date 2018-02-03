package ejercicio14;

public class Articulo {
	//DECLARACION DE ATRIBUTO
	String descripcion;
	double precio;
	int codigo;
	int stock;
	
	//CONSTRUCTOR
	public Articulo(String des,double pre, int cod, int sto ){
		descripcion=des;
		precio=pre;
		codigo=cod;
		stock=sto;
	}
	//METODO
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(short precio) {
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
