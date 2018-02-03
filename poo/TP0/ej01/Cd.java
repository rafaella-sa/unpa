package ej01;

class Cd {
	protected String titulo;
	protected String cantante;
	protected double precio;
	protected String compania;
	protected int cantidad;
	protected Cancion[] canciones;
	protected int actual = 0;
	
	public Cd (String titulo, String cantante, double precio, String compania, int cantidad){
		this.titulo = titulo;
		this.cantante = cantante;
		this.precio = precio;
		this.compania = compania;
		this.cantidad = cantidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void crearCD (int cantidad){
		canciones = new Cancion[cantidad];
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public Cancion[] getCanciones() {
		return canciones;
	}

	public void setCanciones(Cancion[] canciones) {
		this.canciones = canciones;
		
	}
	
	public void agregarCancion (Cancion cancion){
			canciones[actual] = cancion;
			actual++;
	}
	
	public void consultarCancion (int cancion){
		System.out.println("La canción se llama: " + canciones[cancion].getTitulo());
		System.out.println("La duración es de: " + canciones[cancion].getDuracion());
		System.out.println("El estilo es: " + canciones[cancion].getEstilo());
		System.out.println("El autor es: " + canciones[cancion].getAutor());
	}
	
	public double calcularDuracion (){
		double duracion = 0;
		for (int i = 0; i < this.cantidad; i++){
			duracion = duracion + canciones[i].getDuracion();
		}
		return duracion;
	}
	
}
