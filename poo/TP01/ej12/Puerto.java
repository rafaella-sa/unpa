package ej12;
public class Puerto {
	protected Alquiler[] elementos;
	protected int limite = 10;
	protected int indice;
	protected Puerto(){
		elementos = new Alquiler[limite];
		indice = 0;
	}
	//redimensionar
	protected void redimensionar(){
		Alquiler[] aux = new Alquiler[limite*2];
		for (int i = 0; i < limite; i++)
			aux[i] = elementos[i];
		elementos = aux;
		limite = limite * 2;
	}
	//calcular alquiler
	protected double calcularAlquiler(int dni){
		boolean encontrado = false;
		int i = 0;
		double precio = 0.0;
		while(encontrado = false & i < elementos.length){
			if(dni == elementos[i].getDni()){
				precio = 2 * (elementos[i].getFechafin() - elementos[i].getFechainicio() + 1) * elementos[i].barco.calcularModulo();
				encontrado = true;
			}
			i++;
		}
		if(encontrado == false)
			System.out.println("No se encontró el alquiler.");
		return precio;
	}
	//agregar alquiler
	protected void agregarAlquiler(Alquiler a){
		if(indice < limite){
			elementos[indice] = a;
			indice++;
		}
		else{
			redimensionar();
			elementos[indice] = a;
			indice++;
		}
	}
	//eliminar un alquiler
	protected void eliminarAlquiler(int dni){
		int i = buscarAlquiler(dni);
		if(i >= 0){
			elementos[i] = null;
			for (int j = i; j < indice - 1; j++){
				elementos[j] = elementos [j+1];	
				elementos[j+1] = null;
			}
			System.out.println("Elemento eliminado.");
			}
		}
	protected int buscarAlquiler(int dni){
		int i = 0;
		int pos = -1;
		boolean OK = false;
		while(OK == false & i < elementos.length){
			if(elementos[i].getDni() == dni){
				OK = true;
				pos = i;
			}
			i++;
		}
		if(OK == false){
			System.out.println("No se encontró el alquiler.");
		}
		return pos;
		}
	//borrar los alquileres
	protected void borrarAlquileres(int cod){
		for (int i = 0; i < indice; i++)
			elementos[i] = null;
		indice = 0;
		System.out.println("Alquileres borrados.");
	}
	//mostrar los alquileres
	protected void mostrarAlquileres(){
		if(indice != 0){
			System.out.println("Los alquileres son: ");
			for(int i = 0; i < indice; i++)
				if(elementos[i] != null){
					System.out.println("Nombre del cliente: " + elementos[i].getNombre());
					System.out.println("Matricula del barco: " + elementos[i].barco.matricula);
					System.out.println("De: " + elementos[i].getFechainicio() + " a: " + elementos[i].getFechafin());
				}	
		}
		else
			System.out.println("No hay alquileres.");
	}
}
