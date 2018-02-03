package ej05y06;
import comun.Console;
public class Main_Fecha {
	public static void main(String[] args) {
		//variables
		int D1, M1, A1, D2, M2, A2;		
		//lectura de datos
		D1 = Console.readInt("Ingrese el día de la fecha 1: ");
		M1 = Console.readInt("Ingrese el mes de la fecha 1: ");
		A1= Console.readInt("Ingrese el año de la fecha 1: ");
		D2 = Console.readInt("Ingrese el día de la fecha 2: ");
		M2 = Console.readInt("Ingrese el mes de la fecha 2: ");
		A2= Console.readInt("Ingrese el año de la fecha 2: ");		
		//creación de los objetos Fecha
		Fecha f1;
		f1 = new Fecha (D1, M1, A1);
		Fecha f2;
		f2 = new Fecha (D2, M2, A2);		
		//prueba de los métodos
		System.out.println("El dia de la segunda fecha es " + f2.getDia());		
		System.out.println("El mes de la segunda fecha es " + f2.getMes());
		System.out.println("El año de la segunda fecha es " + f2.getAnio());
		System.out.println("Redefina la primera fecha (dd/mm/aaaa): ");
		D1 = Console.readInt();
		M1 = Console.readInt();
		A1 = Console.readInt();
		f1.setDia(D1);
		f1.setMes(M1);
		f1.setAnio(A1);
		System.out.println("El nombre del mes de la segunda fecha es: " + f2.getNombreMes());
		System.out.println("La estación de la primera fecha es " + f1.definirEstacion());		
		if (f1.getAnio()<f2.getAnio())
			f1.mostrarFormatoFecha();
		else
			if(f1.getAnio() == f2.getAnio())
				if(f1.getMes()<f2.getMes())
					f1.mostrarFormatoFecha();
				else
					if(f1.getMes() == f2.getMes())
						if(f1.getDia() < f2.getDia())
							f1.mostrarFormatoFecha();
						else
							f2.mostrarFormatoFecha();
		}
}


