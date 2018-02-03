package ej10;
public class Multimedia {
	//atributos
	protected Programa[] elementos;
	protected int indice;
	protected int limite = 10;
	//constructor
	protected Multimedia(){
		elementos = new Programa[limite];
		indice = 0;
	}
	//redimensionar
	protected void redimensionar(){
		Programa[] aux = new Programa[limite*2];
		for (int i = 0; i < limite; i++)
			aux[i] = elementos[i];
		elementos = aux;
		limite = limite * 2;
	}
	//agregar programa
	protected void agregarPrograma(Programa p){
		if(indice < limite){
			elementos[indice] = p;
			indice++;
		}
		else{
			redimensionar();
			elementos[indice] = p;
			indice++;
		}
	}
	//eliminar un programa
	protected void eliminarPrograma(int cod){
		int i = buscarPrograma(cod);
		if(i >= 0){
			elementos[i] = null;
			for (int j = i; j < indice - 1; j++)
				elementos[j] = elementos [j+1];			
			System.out.println("Elemento eliminado.");
			}
		}
	//borrar los programas
	protected void borrarMulti(){
		for (int i = 0; i < indice; i++)
			elementos[i] = null;
		indice = 0;
		System.out.println("Programas borrados.");
	}
	//mostrar los programas
	protected void mostrarProgramas(){
		if(indice != 0){
			System.out.println("Los programas son: ");
			for(int i = 0; i < indice; i++)
				if(elementos[i] != null){
					System.out.println("Nombre: " + elementos[i].titulo);
					System.out.println("Codigo: " + elementos[i].codigo);
					System.out.println("Emisora: " + elementos[i].emisora);
				}	
		}
		else
			System.out.println("No hay programas.");
	}
	//buscar programa
	protected int buscarPrograma(int cod){
		int i = 0;
		int pos = -1;
		boolean OK = false;
		while(OK == false & i < elementos.length){
			if(elementos[i].getCodigo() == cod){
				OK = true;
				pos = i;
			}
			i++;
			}
		if(OK == false){
			System.out.println("El codigo ingresado NO corresponde a ningun programa.");
		}
		return pos;
		}
	//cambiar titulo
	protected void cambiarTitulo(int i, String titulo){
		System.out.println("El titulo actual es: " + elementos[i].getTitulo());											
		elementos[i].setTitulo(titulo);
		System.out.println("El nuevo titulo es: " + elementos[i].getTitulo());
	}
	//cambiar responsable de dirección
	protected void cambiarDireccion(int i, String respdir){
		System.out.println("El actual responsable es: " + elementos[i].getRespdir());
		elementos[i].setRespdir(respdir);
		System.out.println("El nuevo responsable es: " + elementos[i].getRespdir());
	}
	//cambiar codigo
	protected void cambiarCodigo(int i, int codigo){
		System.out.println("El codigo actual es: ");												
		elementos[i].setCodigo(codigo);
		System.out.println("El nuevo codigo es: " + elementos[i].getCodigo());
	}
	//cambiar duración
	protected void cambiarDuracion(int i, int duracion){
		System.out.println("La duración actual es: " + elementos[i].getDuracion());
		elementos[i].setDuracion(duracion);
		System.out.println("La nueva duracion es de: " + elementos[i].getDuracion());
	}
	//cambiar hora de inicio
	protected void cambiarHoraInicio(int i, double horainicio){
		System.out.println("La actual hora de inicio es: " + elementos[i].getHorainicio());
		elementos[i].setHorainicio(horainicio);
		System.out.println("La nueva hora de inicio es: " + elementos[i].getHorainicio());
	}
	//cambiar emisora
	protected void cambiarEmisora(int i, String emisora){
		System.out.println("La emisora actual es: " + elementos[i].getEmisora());
		elementos[i].setEmisora(emisora);
		System.out.println("La nueva emisora es: " + elementos[i].getEmisora());
	}
	//RADIO: cambiar cantidad en minutos de comerciales
	protected void cambiarMinutosCom(int i, int minutosCom){
			Radio aux = (Radio) elementos[i];
			System.out.println("La actual cantidad, en minutos, de comerciales es: " + aux.getMinutosCom());
			aux.setMinutosCom(minutosCom);
			System.out.println("La nueva cantidad de comerciales, en minutos, es: " + aux.getMinutosCom());
			elementos[i] = aux;
	}
	//RADIO: cambiar responsable de musicalización
	protected void cambiarRespMusic(int i, String respmusic){
		Radio aux = (Radio) elementos[i];
		System.out.println("El responsable de musicalización actual es: " + aux.getRespmusic());
		aux.setRespmusic(respmusic);
		System.out.println("El nuevo responsable de musicalización es: " + aux.getRespmusic());
		elementos[i] = aux;
	}
	//TELEVISIÓN: cambiar cantidad de comerciales
	protected void cambiarCantCom(int i, int cantCom) {
		Television aux = (Television) elementos[i];
		System.out.println("La cantidad actual de comerciales es: " + aux.getCantCom());
		aux.setCantCom(cantCom);
		System.out.println("La nueva cantidad de comerciales es: " + aux.getCantCom());
		elementos[i] = aux;
	}
	//TELEVISIÓN: cambiar cantidad de tandas
	protected void cambiarCantTan(int i, int cantTan){
		Television aux = (Television) elementos[i];
		System.out.println("La actual cantidad de tandas es: " + aux.getCantTan());
		aux.setCantTan(cantTan);
		System.out.println("La nueva cantidad de tandas es: " + aux.getCantTan()); 
		elementos[i] = aux;
	}	
}
