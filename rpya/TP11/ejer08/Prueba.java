package ejer08;

public class Prueba {

	public static void main(String[] args) {

				Expresion E=new Expresion("(a+b)*[(a-b)*2]");
				boolean bandera=E.esCorrecto();
				if(bandera==true)
					System.out.println("es correcta");
				else
					System.out.println("es incorrecta");

			}

		
	}

