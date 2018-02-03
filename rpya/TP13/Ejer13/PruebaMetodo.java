package Ejer13;

public class PruebaMetodo {
public int producto(int a, int b){
	if(b==1)
		return a;
	else
		return a + producto(a,b-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PruebaMetodo OBJ= new PruebaMetodo();
	int a=5;
	int b=3;
	System.out.println(OBJ.producto(a, b));
		}
	}
