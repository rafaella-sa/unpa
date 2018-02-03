package ej14;
public class Biblioteca {
	protected Consulta[] elementos;
	protected int limite = 10;
	protected int indice;
	protected Biblioteca(){
		elementos = new Consulta[limite];
		indice = 0;
	}
	//redimensionar
	protected void redimensionar(){
		Consulta[] aux = new Consulta[limite*2];
		for (int i = 0; i < limite; i++)
			aux[i] = elementos[i];
		elementos = aux;
		limite = limite * 2;
	}
	//agregar consulta
	protected void agregarConsulta(Consulta c){
		if(indice < limite){
			elementos[indice] = c;
			indice++;
		}
		else{
			redimensionar();
			elementos[indice] = c;
			indice++;
		}
	}
	//eliminar una consulta
	protected void eliminarConsulta(int dni){
		int i = buscarConsulta(dni);
		if(i >= 0){
			elementos[i] = null;
			for (int j = i; j < indice - 1; j++){
				elementos[j] = elementos [j+1];	
				elementos[j+1] = null;
			}
			System.out.println("Elemento eliminado.");
			}
		}
	protected int buscarConsulta(int dni){
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
			System.out.println("No se encontró la consulta.");
		}
		return pos;
		}
	//borrar las consultas
	protected void borrarConsultas(int cod){
		for (int i = 0; i < indice; i++)
			elementos[i] = null;
		indice = 0;
		System.out.println("Consultas borradas.");
	}
	//mostrar las consultas
	protected void mostrarConsultas(){
		if(indice != 0){
			System.out.println("Las consultas son: ");
			for(int i = 0; i < indice; i++)
				if(elementos[i] != null){
					System.out.println("DNI: " + elementos[i].getDni());
					System.out.println("Numero: " + elementos[i].getNumero());
					System.out.println("Fecha: ");
					elementos[i].getFecha();
				}	
		}
		else
			System.out.println("No hay consultas.");
	}
}
