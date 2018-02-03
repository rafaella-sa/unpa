package ej12;

public class Barco {
	protected int matricula;
	protected int eslora;
	protected int ano;
	protected Barco(int matricula, int eslora, int ano){
		this.matricula = matricula;
		this.eslora = eslora;
		this.ano = ano;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getEslora() {
		return eslora;
	}
	public void setEslora(int eslora) {
		this.eslora = eslora;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	protected double calcularModulo(){
		return eslora * 10;
	}
}
