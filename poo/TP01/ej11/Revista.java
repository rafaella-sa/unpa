package ej11;

public class Revista extends Publicacion{
protected String tapa;
protected int numero;
protected Revista(String titulo, String persona, int codigo, String editor, int cantpag, double precio, int ano, int mes, String tapa, int numero){
	super(titulo, persona, codigo, editor, cantpag, precio, ano, mes);
	this.tapa = tapa;
	this.numero = numero;
}
public String getTapa() {
	return tapa;
}
public void setTapa(String tapa) {
	this.tapa = tapa;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
}
