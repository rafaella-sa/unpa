package ej1;

public class UsoPilaMetodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	PilaMetodos p=new PilaMetodos();
	int opcion=0;
	Menu m= new Menu();
	m.agregarItem("metodo puzzle");
	m.agregarItem("metodo concurso");
	m.agregarItem("metodo suma");
	m.agregarItem("metodo suma de numeros pares");
	m.agregarItem("metodo sumaConPotencia");
	m.agregarItem("metodo funcion G");
	m.agregarItem("metodo funcion h");
	m.agregarItem("metodo la cantidad de vocales en una palabra");
	
	do
	{
		opcion= m.ejecutarMenu();
		switch(opcion)
				{
		case 1://puzzle
		{
			System.out.println("Ingresar una base y un limite");
			int base =Console.readInt();
			int limite =Console.readInt();
			System.out.println("el resultado es:"  + p.puzzle(base ,limite));
		    break;
		}
		case 2: //concurso
		{
			System.out.println("Ingresar una base y un limite");
			int base =Console.readInt();
			int limite =Console.readInt();
			System.out.println("El resultado es:" + p.concurso(base,limite));
			
			break;
		}
		case 3://suma 
		{
			System.out.println("Ingresar un valor");
			int valor= Console.readInt();
			System.out.println( "El resultado es:" +suma(valor));
			break;
		}
		case 4:
		{
			System.out.println("Ingresar un numero par");
			int valor= Console.readInt();
			System.out.println( "El resultado es:" +p.sumaPares(valor));
			break;
		}
		case 5:
		{
			System.out.println("Ingresar m y n");
			int num =Console.readInt();
			int n =Console.readInt();
			System.out.println("El resultado es:" + p.serie(num, n));
			break;
		}
		case 6:
		{
			System.out.println("ingresar dos valores ");
			int x=Console.readInt();
			int y=Console.readInt();
			System.out.println("El resulatdo es:"  +p.funcionG(x, y));
		}
		case 7:
		{
			System.out.println ("Ingresar un valor");
			int x=Console.readInt();
			System.out.println("El resultado es:"  +p.funcionH(x));
			
		}
		case 8:
		{
			System.out.println("Ingrese una palabra");
			String palabra=Console.readString();
			System.out.println("la cantidad de vocales es:" + p.calcularCantVocal(palabra,0, 0));
		}
			
		default:
			break;
		}
		}while(opcion!= 0);
	}
	
	public static int suma (int valor)
	{
		if(valor== 0)
			return 0;
		else
			return (valor + suma(valor-1));
	}
	}

	
	


