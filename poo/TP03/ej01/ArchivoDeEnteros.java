package ej01;
import java.io.*;
public class ArchivoDeEnteros {
	RandomAccessFile archivo;
	ArchivoDeEnteros(String name){
		try{
		archivo = new RandomAccessFile(name, "rw");
		}
		catch(IOException e){
			System.out.println("ErrorXX E/S");
		}
	}
	void agregarEntero(int num){
		try{
			if(archivo.length()>0)
				archivo.seek(archivo.length());
			archivo.writeInt(num);
		}
		catch(IOException e){
			System.out.println("ErrorXX E/S");
		}
	}
}
