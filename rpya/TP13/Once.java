package tp13;
import Comun.Console;
class Once {
int vocales (String cd, int dim, int c){
	int cant;
	if (dim == -1){
		cant = c;
		return cant;
	}
	else
		if (esVocal(cd.charAt(dim))){
			c++;
			return vocales(cd, dim - 1, c);
		}
}
boolean esVocal(char letra){
if (letra == 'a'|letra == 'e'|letra == 'i'|letra == 'o'|letra == 'u')
	return true;
else
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c = vocales(palabra, dim - 1, 0);
	}

}
