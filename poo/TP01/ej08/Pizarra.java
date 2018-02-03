package ej08;
public class Pizarra {
	//atributos
	protected Figura[] elementos;
	protected int indice;
	protected int limite = 10;
	protected String color;
	//constructor
	protected Pizarra(){
		elementos = new Figura[limite];
		indice = 0;
		color = "No tiene color";
	}
	//devolver el color de la pizarra
	protected String getColor(){
		return color;
	}
	//cambiar el color de la pizarra
	protected void setColor(String color){		
		this.color = color;
	}
	protected void cambiarColor(String color){
		System.out.println("El color actual es: " + getColor());
		setColor(color);
		System.out.println("El nuevo color es: " + color);
		System.out.println("Cambio efectuado con suceso.");
	}
	//agrega una figura a la pizarra
	protected void agregarFigura(Figura f){
		if(indice < limite){
			elementos[indice] = f;
			indice++;
		}
		else{
			redimensionar();
			elementos[indice] = f;
			indice++;
		}
	}
	//redimensionar la pizarra
	protected void redimensionar(){
		Figura[] aux = new Figura[limite*2];
		for (int i = 0; i < limite; i++)
			aux[i] = elementos[i];
		elementos = aux;
		limite = limite * 2;
	}
	//eliminar una figura de la pizarra
	protected void eliminarFigura(int pos){
		if(pos >= 0 && pos < indice)
			for (int i = pos; i < limite - 1; i++)
				elementos[i] = elementos [i+1];
		System.out.println("Elemento eliminado.");
	}
	//borrar la pizarra
	protected void borrarPizarra(){
		for (int i = 0; i < indice; i++)
			elementos[i] = null;
		indice = 0;
		System.out.println("Pizarra borrada.");
	}
	//calcular la superfície de la pizarra
	protected double superficiePizarra(){
		double s = 0.0;
		for (int i = 0; i < indice; i++)
			if(elementos[i]!= null){
				System.out.println("Superficie de la figura " + i + " : " + elementos[i].superficie());
				s = s + elementos[i].superficie();
			}
		return s;
	}
	//calcular el perímetro de la pizarra
	protected void perimetroPizarra(){
		for(int i = 0; i < indice; i++)
			if(elementos[i]!=null)
				System.out.println("Perimetro de " + i + " : " + elementos[i].perimetro());
	}
	//dibujar la pizarra
	protected void dibujarPizarra(){
		if(indice != 0)
			for(int i = 0; i < indice; i++)
				if(elementos[i] != null)
					elementos[i].dibujar();
		else
			System.out.println("La pizarra está vacia.");
		
	}
	//cambiar el color de borde de una figura
	protected void cambiarColorBorde(int pos, String cb){
		System.out.println("El color actual es: " + elementos[pos].getBorde());
		elementos[pos].setBorde(cb);
		System.out.println("El nuevo color es: " + elementos[pos].getBorde());
		System.out.println("Cambio efectuado con éxito.");
	}
	//cambiar el color de fondo de una figura
	protected void cambiarColorFondo(int pos, String cf){
		System.out.println("El color actual es: " + elementos[pos].getFondo());
		elementos[pos].setFondo(cf);
		System.out.println("El nuevo color es: " + elementos[pos].getFondo());
		System.out.println("Cambio efectuado con éxito.");
	}
	//mostrar la pizarra
	protected void mostrarPizarra(){
		if(indice != 0){
			for(int i = 0; i < indice; i++)
				if(elementos[i] != null){
					elementos[i].dibujar();
					System.out.println("El color de borde es: " + elementos[i].getBorde());
					System.out.println("El color de fondo es: " + elementos[i].getFondo());
				}	
		}
		else
			System.out.println("La pizarra esta vacia.");
	}
}
