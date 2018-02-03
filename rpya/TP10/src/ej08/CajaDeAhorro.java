package ej08;
public class CajaDeAhorro {
	private int numero;
	private double saldo;
	private String titular;
	private String domicilio;
	private int telefono;
	public CajaDeAhorro(int num, double sal, String tit, String dom, int tel){
		numero = num;
		saldo = sal;
		titular = tit;
		domicilio = dom;
		telefono = tel;
	}
	public void setNumero(int num){
		numero = num;
	}
	public int getNumero(){
		return numero;
	}
	public void setSaldo(double cantidad){
		if(cantidad > 0)
			saldo = saldo + cantidad;
	}
	public double getSaldo(){
		return saldo;
	}
	public void setTitular(String tit){
		titular = tit;
	}
	public String getTitular(){
		return titular;
	}
	public void setDomicilio (String dom){
		domicilio = dom;
	}
	public String getDomicilio(){
		return domicilio;
	}
	public void setTelefono (int tel){
		telefono = tel;
	}
	public int getTelefono(){
		return telefono;
	}
	public void extraerDinero (double cantidad){
		if (cantidad > 0 && saldo >= cantidad)
			saldo = saldo - cantidad;
	}	
	public double consultarSaldo(){
		return saldo;
	}	
	public void consultarDatos(){
		System.out.println (this.titular);
		System.out.println (this.domicilio);
		System.out.println (this.telefono);
		System.out.println (this.numero);
		System.out.println (this.saldo);	
	}
}