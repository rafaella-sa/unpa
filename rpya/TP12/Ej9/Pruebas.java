package Ej9;

public class Pruebas {

	public static void main(String[] args) {
		String cadena=Console.readString("Ingrese una cadena ");
		PilaChar p=new PilaChar();
		ColaChar q=new ColaChar();
		int l=cadena.length();
		int i=0;
		char x;
		while(!p.estaLlena()&& q.estaLlena()&& i<l){
			x=cadena.charAt(i);
			p.meter(x);
			q.insertar(x);
			i++;
		}
		boolean ok=true;
		while(!q.estaVacia()&&!p.estaVacio() && ok ){
			if(p.sacar()!=q.borrar())
				ok=false;
		}
		if(ok)
			System.out.println("la palabra no es palindromo");
		else
			System.out.println("la palabra es palindromo");
	}

}
