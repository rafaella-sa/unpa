package ejer08;
import Comun.PilaChar;
public class Expresion {
	private String cadena;
	
	public Expresion(String pal){
		cadena=pal;
}
	public void setCadena(String cadena) {
		this.cadena = cadena;
		}
	public boolean esCorrecto(){
		boolean bandera=true;
		PilaChar p= new PilaChar();
		int i;
		char L;
		for(i=0; i<cadena.length();i++){
			L=cadena.charAt(i);
			if(L== '{'|| L=='('|| L== '[')
				p.meter(L);
			else
				switch(L)
				{
				case ']':{
					if (p.estaVacia())
						bandera=false;
					else{
						p.sacar();
						if(L !=']')
							bandera=false;
					}
				break;
				}
				case ')':{
					if (p.estaVacia())
						if (p.estaVacia())
							bandera=false;
						else{
							p.sacar();
							if(L !=')')
								bandera=false;
						}
					break;
					}
				case '}':{
					if (p.estaVacia())
						if (p.estaVacia())
							bandera=false;
						else{
							p.sacar();
							if(L !='}')
								bandera=false;
				}
				}
		}
	}
		return bandera;
}
}