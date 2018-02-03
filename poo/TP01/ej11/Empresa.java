package ej11;
public class Empresa {
	//atributos
	protected Publicacion[] elementos;
	protected int indice;
	protected int limite = 10;
	//constructor
	protected Empresa(){
		elementos = new Publicacion[limite];
		indice = 0;
	}
	//redimensionar
	protected void redimensionar(){
		Publicacion[] aux = new Publicacion[limite*2];
		for (int i = 0; i < limite; i++)
			aux[i] = elementos[i];
		elementos = aux;
		limite = limite * 2;
	}
	//agregar publicación
	protected void agregarPublicacion(Publicacion p){
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
	//eliminar una publicación
	protected void eliminarPublicacion(int cod){
		int i = buscarPubli(cod);
		if(i >= 0){
			elementos[i] = null;
			for (int j = i; j < indice - 1; j++){
				elementos[j] = elementos [j+1];	
				elementos[j+1] = null;
			}
			System.out.println("Elemento eliminado.");
			}
		}
	//borrar las publicaciones
	protected void borrarPubli(){
		for (int i = 0; i < indice; i++)
			elementos[i] = null;
		indice = 0;
		System.out.println("Programas borrados.");
	}
	//mostrar las publicaciones
	protected void mostrarPubli(){
		if(indice != 0){
			System.out.println("Las publicaciones son: ");
			for(int i = 0; i < indice; i++)
				if(elementos[i] != null){
					System.out.println("Nombre: " + elementos[i].getTitulo());
					System.out.println("Codigo: " + elementos[i].getCodigo());
					System.out.println("Director de publicación: " + elementos[i].getPersona());
				}	
		}
		else
			System.out.println("No hay publicaciones.");
	}
	//buscar publicación
	protected int buscarPubli(int cod){
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
			System.out.println("El codigo ingresado NO corresponde a ninguna publicación.");
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
	protected void cambiarPersona(int i, String persona){
		System.out.println("El actual responsable es: " + elementos[i].getPersona());
		elementos[i].setPersona(persona);
		System.out.println("El nuevo responsable es: " + elementos[i].getPersona());
	}
	//cambiar codigo
	protected void cambiarCodigo(int i, int codigo){
		System.out.println("El codigo actual es: ");												
		elementos[i].setCodigo(codigo);
		System.out.println("El nuevo codigo es: " + elementos[i].getCodigo());
	}
	//cambiar editor
	protected void cambiarEditor(int i, String editor){
		System.out.println("El editor actual es: " + elementos[i].getEditor());
		elementos[i].setEditor(editor);
		System.out.println("El nuevo editor es: " + elementos[i].getEditor());
	}
	//cambiar cantidad de páginas
	protected void cambiarCantpag(int i, int cantpag){
		System.out.println("La actual cantidad de páginas es: " + elementos[i].getCantpag());
		elementos[i].setCantpag(cantpag);
		System.out.println("La nueva cantidad de páginas es: " + elementos[i].getCantpag());
	}
	//cambiar precio
	protected void cambiarPrecio(int i, double precio){
		System.out.println("El precio actual es: " + elementos[i].getPrecio());
		elementos[i].setPrecio(precio);
		System.out.println("El nuevo precio es: " + elementos[i].getPrecio());
	}
	//cambiar año de publicación
	protected void cambiarAno(int i, int ano){
			System.out.println("El actual año de publicación es: " + elementos[i].getAno());
			elementos[i].setAno(ano);
			System.out.println("El nuevo año de publicación es: " + elementos[i].getAno());
	}
	//cambiar mes de publicación
	protected void cambiarMes(int i, int mes){
			System.out.println("El actual mes de publicación es: " + elementos[i].getMes());
			elementos[i].setMes(mes);
			System.out.println("El nuevo mes de publicación es: " + elementos[i].getMes());
	}
	//REVISTA: cambiar titulo de la nota de tapa
	protected void cambiarTapa(int i, String tapa){
		Revista aux = (Revista) elementos[i];
		System.out.println("El titulo actual es: " +  aux.getTapa());
		aux.setTapa(tapa);
		System.out.println("El nuevo titulo es: " + aux.getTapa());
		elementos[i] = aux;
	}
	//REVISTA: cambiar numero de la nota de tapa
	protected void cambiarNumero(int i, int numero){
		Revista aux = (Revista) elementos[i];
		System.out.println("El numero actual es: " + aux.getNumero());
		aux.setNumero(numero);
		System.out.println("El nuevo numero es: " + aux.getNumero());
		elementos[i] = aux;
	}
	//DIARIO: cambiar recargo por envíos al interior
	protected void cambiarRecargo(int i, double recargo) {
		Diario aux = (Diario) elementos[i];
		System.out.println("El actual recargo es: " + aux.getRecargo());
		aux.setRecargo(recargo);
		System.out.println("El nuevo recargo es: " + aux.getRecargo());
		elementos[i] = aux;
	}
	//DIARIO: cambiar semana de publicación
	protected void cambiarSemana(int i, int semana){
		Diario aux = (Diario) elementos[i];
		System.out.println("La actual semana es: " + aux.getSemana());
		aux.setSemana(semana);
		System.out.println("La nueva semana es: " + aux.getSemana()); 
		elementos[i] = aux;
	}	
}
