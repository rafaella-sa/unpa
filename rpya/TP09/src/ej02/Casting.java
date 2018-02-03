package ej02;

public class Casting {

	public static void main(String[] args) {
		int A = 5;
		int B = 3;
		int X;
		double C = 7.5;
		double D = 2.0;
		double Y;
		//a)
		System.out.println("Resultados del item a):");
		X = A/B;
		System.out.println(X);
		X = ((int) (A*D)/(int)(C/A));
		System.out.println(X);
		Y = A/B;
		System.out.println(Y);
		Y = ((double)(A/B));
		System.out.println(Y);
		Y = ((double) A*D/(int)C);
		System.out.println(Y);
		Y = (double) A*D;
		System.out.println(Y);
		Y = (double) (A*D)/(C*(int)D);
		System.out.println(Y);
		Y = A * (int)D;
		System.out.println(Y);
		Y = (int)(A*(int)D);
		System.out.println(Y);
		//b)
		System.out.println("Resultados del item b):");
		X = A/(int)C;
		System.out.println(X);
		X = A*(int)D;
		System.out.println(X);
		X = A * (int)D * (int)C;
		System.out.println(X);
		X = A*(int)D/(int)C;
		System.out.println(X);
		X = A*(int)D;
		System.out.println(X);
	}

}
