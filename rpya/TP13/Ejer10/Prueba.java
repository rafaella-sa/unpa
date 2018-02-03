package Ejer10;
public class Prueba {
public int funcionH(int x){
	if(x>0){
		if(x==1)
			return 1;
		else{
			if(x>1)
				return (1+funcionH(x/2));
			else
				return 0;
		}
	}
	else
		return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
