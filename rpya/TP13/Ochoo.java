package ejercicio8;

public class Sumas {
	int sumaSerieNumero(int n){
		int resul=0;
		if(n==1)
			resul=1;
		else 
			if(n>1)
				resul=(sumaSerieNumero(n-1^2))+n^1; 
		return resul;
	}

}
