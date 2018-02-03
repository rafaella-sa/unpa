package Ejer20;
import Comun.Console;
public class Secuencia {
public boolean vec2ConV1(char [] vec, char [] ve2, int i,int n,  boolean ban, int dim, int dim2){
	if(i==dim2)
		return ban;
	else{
		if(buscar(vec, i, dim,ve2[n])==false)
			return vec2ConV1(vec, ve2,i+1,n, false, dim, dim2);
		else
			return vec2ConV1(vec,ve2,i+1,n+1, true,dim,dim2);
	}
}
public boolean buscar(char [] vector, int i, int dim, char elem){
	if(i<dim){
		if(elem==vector[i])
			return true;
		else
			return false;
}
	else
		return false;
}
	public static void main(String[] args) {
	Secuencia v=new Secuencia();
	int dim=Console.readInt("ingrse la dimension del vector 1");
	int dim2=Console.readInt("ingrse la dim del vector2");
	int i=0;
	int n=0;
	char [] vec;
	char[] vec2;
	vec=new char[dim];
	vec2=new char[dim2];
	char elem;
	boolean ban = false;
	//CARGA DEL VECTOR 1
	for(int j=0; j< dim; j++)
		vec[j]=elem=Console.readChar("ingrse un elem al vector");
	//CARGA DEL SEGUNDO VECTOR
	for(int j=0; j< dim2; j++)
		vec2[j]=elem=Console.readChar("ingrse un elem al vector2");
	//
	System.out.println("esta contenido? " + v.vec2ConV1(vec,vec2,i,n,ban,dim-1,dim2-1));
}
}