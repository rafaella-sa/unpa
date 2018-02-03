package ej04;
public class Encripta {//Nombre de la clase
	String lsdato_entrada;
	String lsdato_salida;
	char lc_comodin;
	
	Encripta(){
		lsdato_entrada="";
		lsdato_salida ="";
	}
	
	public String getLsdato_entrada() {
		return lsdato_entrada;
	}

	public void setLsdato_entrada(String lsdato_entrada) {
		this.lsdato_entrada = lsdato_entrada;
	}

	public String getLsdato_salida() {
		return lsdato_salida;
	}

	public void setLsdato_salida(String lsdato_salida) {
		this.lsdato_salida = lsdato_salida;
	}
	
	public void encriptarTexto(){
		for (int i=0;i<=lsdato_entrada.length()-1;i++){
			lc_comodin=lsdato_entrada.charAt(i);
			for (int i2=0;i2<=lsdato_salida.length();i2++){
				lc_comodin++;
			}
			lsdato_salida=lsdato_salida+lc_comodin;
		}
	}
	
	public void mostrarTexto(){
		System.out.println(this.getLsdato_salida());
	}
	
	public void desencriptarTexto(){
		lsdato_entrada = lsdato_salida;
		lsdato_salida = "";
		for (int i=0;i<=lsdato_entrada.length()-1;i++){
			lc_comodin=lsdato_entrada.charAt(i);
			for (int i2=0;i2<=lsdato_salida.length();i2++){
				lc_comodin--;
			}
			lsdato_salida=lsdato_salida+lc_comodin;
		}
	}
}

