package ej06;

public class Printer {
public double tinta;
public int papel;
public boolean conectar;
public boolean on_line;

public Printer(double tinta, int papel, boolean conectar, boolean on_line){
	this.tinta = tinta;
	this.papel = papel;
	this.conectar = conectar;
	this.on_line = on_line;
	}
public void cargarTinta(double tinta){
	this.tinta = this.tinta + tinta;
	}
public void cargarPapel(int papel){
	this.papel = this.papel + papel;
	}
public void conectar(){
	this.conectar = true;
	}
public void desconectar(){
	this.conectar = false;
	}
public void on_line(){
	this.on_line = true;
}
public void off_line(){
	this.on_line = false;
}
public void print(Documento doc){
	if(doc.getCanthojas() > 125 && this.tinta <= 125)
		System.out.println("No se puede imprimir");
	System.out.println("Imprimiendo documento...");
	System.out.println("");
	int j = 1;
	for(int i = 0; i < doc.getCanthojas(); i++){
		System.out.println("Hoja " + j + " de " + doc.getCanthojas());
	}
	System.out.println("");
	System.out.println("Impresión finalizada.");
}

}
