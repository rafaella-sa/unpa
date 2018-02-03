package Ejer10;
public class Estacionamiento {
 private ColaAuto elementos;
 //CONSTRUCTOR
 public Estacionamiento(){
	 elementos= new ColaAuto();
 }
 public void agregarAuto(Auto a){
	 if (espacio()){
		 elementos.insertar(a);
	 }
 }
 public boolean espacio(){
	 if(!elementos.estaLlena())
		 return true;
	 else 
		 return false;
 }
public Auto sacar(Auto a){
		Auto aux=new Auto();
		int cant=0;
		ColaAuto help=new ColaAuto();
		boolean encontrado=false;
		while(!elementos.estaVacia() && encontrado==false){
			aux=elementos.borrar();
			if(aux.getPatente().equals(a.getPatente())){
				encontrado=true;
				//elementos.borrar();
				return aux;
				}
			else
				{
				help.insertar(aux);
				cant++;
				aux.setCant(cant);
			}
			}
			while(!elementos.estaLlena()){
				elementos.insertar(help.borrar());
				}

		return aux;
}
}