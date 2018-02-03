package ejer12;
//import Comun.Console;
public class PruebaPalindromo {
public boolean palindromo(char []vector,int dim, int i, int f){
	if(i>=dim/2)
		return true;
	if (vector[i]==vector[f]){
			i++;
			f--;
			return palindromo (vector, dim, i,f);
	}
	else
		return false;
}
	public static void main(String[] args) {
	PruebaPalindromo OBJ= new PruebaPalindromo();
	int dim=7;
	//int dim=Console.readInt("ingrse la dimension");
	char []vector;
	vector=new char[dim];
	int actual=0;
	int i=0;
	int f=--dim;
	vector[0]='n';
	vector[1]='e';
	vector[2]='u';
	vector[3]='q';
	vector[4]='u';
	vector[5]='e';
	vector[6]='n';
	
	
/*	while(actual<dim){
		elem=Console.readChar("ingrse una letra");
		vector[actual]=elem;
		System.out.println(" vector actual" + vector[actual]);
		actual++;
	}*/
	for (int j=0; j<actual; j++)
		System.out.println("elem:" + vector[j]);
	/*if(OBJ.palindromo(vector, dim, i, f))
		System.out.println("es palindromo");
	else
		System.out.println("no es palindromo");
	*/
	System.out.println(OBJ.palindromo(vector, f, i, f));
	}

}
