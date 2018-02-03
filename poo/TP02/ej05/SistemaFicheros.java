package ej05;
import java.util.*;
public class SistemaFicheros {
	public int id_disco;
	public byte capacidad;
	public Vector<Fichero> ficheros;
	public int dim = 10;
	
	public SistemaFicheros(int id_disco, byte capacidad){
		this.id_disco = id_disco;
		this.capacidad = capacidad;
		ficheros = new Vector<Fichero>(dim);
	}
	
	public void agregarFichero(Fichero f){		
		if(ficheros.size() != ficheros.capacity())
			ficheros.addElement(f);
		else{
			redimensionar();
			ficheros.addElement(f);
		}
	}
	
	public void eliminarFichero(String id){
		int i = buscar(id);
		ficheros.removeElementAt(i);
	}
	
	public int buscar(String id){
		boolean ok = false;
		int i = 0;
		int pos = -1;
		while(i < ficheros.size() && !ok){
			if(ficheros.elementAt(i).getNombre() == id){
				ok = true;
				pos = i;
			}
		}
		return pos;	
	}
	public void mostrar(String id){
		int i = buscar(id);
		System.out.println("Nombre: " + ficheros.elementAt(i).getNombre());
		System.out.println("Extensión: " + ficheros.elementAt(i).getExtension());
		System.out.println("Tamaño (bytes): " + ficheros.elementAt(i).getTamano());
	}
	public void listarFicheros(){
		for(int i = 0; i < ficheros.size(); i++){
			System.out.println("Nombre: " + ficheros.elementAt(i).getNombre());
			System.out.println("Extensión: " + ficheros.elementAt(i).getExtension());
			System.out.println("");
		}
	}

	public void redimensionar(){
		dim = dim * 2;
		ficheros.setSize(dim);
	}
	public int getId_disco() {
		return id_disco;
	}

	public void setId_disco(int id_disco) {
		this.id_disco = id_disco;
	}

	public byte getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(byte capacidad) {
		this.capacidad = capacidad;
	}
}
