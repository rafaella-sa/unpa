package ej10;
public class Radio extends Programa{
	//atributos
	protected int minutosCom;
	protected String respmusic;
	//constructor
	public Radio(String tit, String rd, int cod, int dur, double horin, String emi, int mc, String rm){
		super(tit, rd, cod, dur, horin, emi);
		this.minutosCom = mc;
		this.respmusic = rm;
	}
	//devuelve la cantidad de minutos de comerciales
	protected int getMinutosCom(){
		return minutosCom;
	}
	//modifica la cantidad de minutos de comerciales
	protected void setMinutosCom(int minutosCom) {
		this.minutosCom = minutosCom;
	}
	//devuelve el responsable de musicalización
	protected String getRespmusic() {
		return respmusic;
	}
	//modifica el responsable de musicalización
	protected void setRespmusic(String respmusic) {
		this.respmusic = respmusic;
	}
	//RADIO: cambiar cantidad en minutos de comerciales
	protected void cambiarMinutosCom(int i, int minutosCom){
			System.out.println("La actual cantidad, en minutos, de comerciales es: " + getMinutosCom());
			setMinutosCom(minutosCom);
			System.out.println("La nueva cantidad de comerciales, en minutos, es: " + getMinutosCom());
	}
	//RADIO: cambiar responsable de musicalización
	protected void cambiarRespMusic(int i, String respmusic){
		System.out.println("El responsable de musicalización actual es: " + getRespmusic());
		setRespmusic(respmusic);
		System.out.println("El nuevo responsable de musicalización es: " + getRespmusic());
	}
}
