package ej11;

public class Publicacion {
protected String titulo;
protected String persona;
protected int codigo;
protected String editor;
protected int cantpag;
protected double precio;
protected int ano;
protected int mes;
protected Publicacion(String titulo, String persona, int codigo, String editor, int cantpag, double precio, int ano, int mes){
	this.ano = ano;
	this.cantpag = cantpag;
	this.editor = editor;
	this.codigo = codigo;
	this.persona = persona;
	this.titulo = titulo;
	this.precio = precio;
	this.mes = mes;
}
public int getMes() {
	return mes;
}
public void setMes(int mes) {
	this.mes = mes;
}
public String getEditor() {
	return editor;
}
public void setEditor(String editor) {
	this.editor = editor;
}
public int getCantpag() {
	return cantpag;
}
public void setCantpag(int cantpag) {
	this.cantpag = cantpag;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getPersona() {
	return persona;
}
public void setPersona(String persona) {
	this.persona = persona;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}


}
