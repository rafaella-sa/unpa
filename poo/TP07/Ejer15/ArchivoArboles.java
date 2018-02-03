package Ej15;

import java.io.*;


public class ArchivoArboles {
	
	RandomAccessFile arch;
	
	
//CONSTRUCTOR
	
public ArchivoArboles(String name)
			{
			try
			   {
				arch=new RandomAccessFile(name, "rw");
			   }
			catch(FileNotFoundException e)
				{
				System.out.println("Error:el archivo no existe!!!");
				}
			catch(IOException e)
			    {
				System.out.println("ERROR: al crear el archivo !!!");
			    }
			}
	
//MÉTODOS

public void cargarNumeros(int num)
			  {
			 try
			 	{
				 if(arch.length()>0)
					 arch.seek(arch.length());
				 arch.writeInt(num);
				}
			 catch(IOException e)
			 		{
				 System.out.println("Error en la carga del numero");
			 		}
	
			  }

public void mostrar()
			  {
	          try
	          	{
	        	  arch.seek(0);
	        	  while(arch.getFilePointer()<arch.length())
	        		  System.out.print("-"+arch.readInt());
	          	}
	          catch(IOException e)
	          		{ 
	        	  	 System.out.print("Error al mostrar!!!");
	          		}
	
			  }

public boolean buscarNumero(int n)
				{
				try
				  {
				   while(arch.getFilePointer()<arch.length())
						 {
						 if(n==arch.readInt())
							 return true;
						 }
				  }
				catch(IOException e)
					  {
					System.out.println("Error en la busqueda!!");
					  }
				finally
					{
					return false;
					}
	
				}


public void cerrar()
	{
	try
      {
		arch.close();
      }
	catch(IOException e)
		{   
		System.out.println("Error ");
		}
	}




}








