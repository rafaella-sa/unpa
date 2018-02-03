package ej08;
public class Expresion {
	private String cadena;	
	public Expresion(String palabra){
		cadena = palabra;
	}
	public void setCadena(String cadena){
		this.cadena = cadena;
	}
	public boolean verificarExpresion(){
		boolean verif = true;
		Pila p = new Pila();
		int i;
		char l, aux;
		for(i = 0; i < cadena.length(); i++){
			l = cadena.charAt(i);
			if(l == '{'|| l =='('|| l == '[')
				p.meter(l);
			else
				switch(l){
					case ']':{
						if (p.estaVacia())
							verif = false;
						else{
							aux = p.sacar();
							if(aux != '[')
								 verif = false;
						}
						break;
						}
					case ')':{
						if (p.estaVacia())
							verif = false;
						else{
							aux = p.sacar();
							if(aux != '(')
								verif = false;
							}
						break;
						}
					case '}':{
						if (p.estaVacia())
								verif = false;
							else{
								aux = p.sacar();
								if(aux != '{')
									verif = false;
							}
						break;
						}
				}
		}
	return verif;
	}
}
