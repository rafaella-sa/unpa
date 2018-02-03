package ej15;

public class Residencia extends Alojamiento{
	protected int canthab;
	protected boolean descuentos;
	protected boolean campo;
	protected Residencia(boolean privado, double cantmetros, int canthab, boolean descuentos, boolean campo){
		super(privado, cantmetros);
		this.canthab = canthab;
		this.descuentos = descuentos;
		this.campo = campo; 
	}
	public int getCanthab() {
		return canthab;
	}
	public void setCanthab(int canthab) {
		this.canthab = canthab;
	}
	public boolean isDescuentos() {
		return descuentos;
	}
	public void setDescuentos(boolean descuentos) {
		this.descuentos = descuentos;
	}
	public boolean isCampo() {
		return campo;
	}
	public void setCampo(boolean campo) {
		this.campo = campo;
	}
}
