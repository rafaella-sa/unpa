package ej1;

public class PilaMetodos {
	
private final int maxpila=100;
private int [] elementos;
private int cima;
	//constructor
	public PilaMetodos()
	{
		elementos= new int [maxpila];
		cima=-1;
	}
	//verificar si esta o no vacia
	public boolean estaVacia()
	{
		return(cima==-1);
		}
		//verificar si esta llena
		public boolean estaLlena()
		{
			return(cima== maxpila-1);
		}
		// agregar elemento a la pila
		public  void meter(int elem)
		{
			if(!estaLlena())
			{
				cima++;
				elementos[cima]=elem;
			    
			}
		         return ;
		}
		//sacar  elemento a la pila
		public int sacar()
		{
			int aux=Integer.MIN_VALUE;
			if(!estaVacia())
			{
			   aux=elementos[cima];
			   cima--;
			    
			}
			return aux;
			}
		// metodo puzzle
		public int puzzle(int base, int limite)
		{
			if(base > limite)
				return -1;
			else
				if (base== limite)
					return 1;
						else
							return (base * puzzle(base +1, limite));
				   
		}
		public int concurso(int base, int limite)
		{
			if (base== limite)
				return 1;
			else
				if(base > limite)
					return 0;
			return (base + concurso(base + 1, limite));
			
		}
		public int suma (int valor)
		{
			if(valor== 0)
				return 0;
			else
				return (valor + suma(valor-1));
		}
		public int sumaPares(int valor)
		{
			if (valor<=1)
				return 0;
			else
				return (valor +	sumaPares(valor -2));
		}
		public int potencia(int m, int n)
		{
			if(n==0)
				return 1;
			else
				return (m* potencia(m, n-1));
		}
		public int serie(int m, int n)
		{
			if (n==1)
				return m;
			else
				return (potencia(m, n)+ serie(m+1, n-1));
				
		}
		public int funcionG(int x, int y)
		{
			if(x<=y)
				return 1;
			else
			
				return (funcionG(x, y +1)+1);
		}
		public int funcionH(int x)
		{
			if(x==1)
				return 1;
			else
				return (funcionH(x/2) +1 );
		}
		public int calcularCantVocal(String cd, int i, int cont)
		{
		if(cd.length()==(i))
				return cont;
			else
			{
				if(cd.charAt(i)=='a'|| cd.charAt(i)=='e'|| cd.charAt(i)=='i'|| cd.charAt(i)=='o'|| cd.charAt(i)=='u')
					cont++;
				i++;
				return (calcularCantVocal(cd, i, cont));
			}
		}
		
	
		
		}




