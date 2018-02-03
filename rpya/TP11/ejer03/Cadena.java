package ejer03;

public class Cadena {
	private char[] cadena;
	private int dim;
	private int actual;
	
	public Cadena(int D)
	{	
		actual=0;
		if (D<=0)
			{
			dim=100;
			}
		else
			{
			dim=D;	
			
			}
		cadena = new char[dim];
		}
	public boolean buscarCaracter(char X)
	{
		int pos=0;
		boolean enc=false;
		while(pos<actual && enc==false)
		{
			if (X==cadena[pos])				
				enc=true;				
			pos++;
		}
		return enc;
	}
	public void cargarCadena(String palabra)
		{
		for (int i = 0; i < palabra.length(); i++) {
	
			cadena[i] = palabra.charAt(i);
			}
		actual=palabra.length();
	
		
		}
	public void mostrarPalabra()
		{
		for (int i = 0; i < actual; i++)
		System.out.print(cadena[i]);
		}
	public void inversapalab(){
		for (int i=actual; i>=0; i++)
			cadena[i]=cadena[i];
		}
	}
	
