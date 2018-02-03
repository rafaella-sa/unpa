package ej10;
public class Television extends Programa {
	//atributos
	protected int cantCom;
	protected int cantTan;
	//constructor
	protected Television(String tit, String rd, int cod, int dur, double horin, String emi, int cc, int ct){
		super(tit, rd, cod, dur, horin, emi);
		this.cantCom = cc;
		this.cantTan = ct;
	}
	//devuelve la cantidad de tandas
	public int getCantTan() {
		return cantTan;
	}
	//modifica la cantidad de tandas
	public void setCantTan(int cantTan) {
		this.cantTan = cantTan;
	}
	//devuelve la cantidad de comerciales
	public int getCantCom() {
		return cantCom;
	}
	//modifica la cantidad de comerciales
	public void setCantCom(int cantCom) {
		this.cantCom = cantCom;
	}
}
