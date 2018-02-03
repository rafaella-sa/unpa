package ej05;

public class Fichero {
	protected String nombre;
	protected String extension;
	protected byte tamano;
	protected Fecha fecha;
	protected boolean read;
	protected boolean write;
	
	public Fichero(String nombre, String extension, byte tamano, Fecha fecha, boolean read, boolean write){
		this.nombre = nombre;
		this.extension = extension;
		this.tamano = tamano;
		this.fecha = fecha;
		this.read = read;
		this.write = write;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public byte getTamano() {
		return tamano;
	}

	public void setTamano(byte tamano) {
		this.tamano = tamano;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public boolean isWrite() {
		return write;
	}

	public void setWrite(boolean write) {
		this.write = write;
	}
	
	
}
