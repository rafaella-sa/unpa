package olimpiadas;

public class Pais {
	
	public final String nombre;
	public Atleta[] atletas;
	
	public int cuantasMedallasOro;
	public int cuantasMedallasPlata;
	public int cuantasMedallasBronce;
	
	public Pais(String nombre)
	{
		this.nombre=nombre;
		cuantasMedallasOro=0;
		cuantasMedallasPlata=0;
		cuantasMedallasBronce=0;
		this.atletas= new Atleta[0];
	}
	
	public void añadirAtleta(Atleta nuevo)
	{
		int len=atletas.length+1;
		Atleta[] newAtletas= new Atleta[len];
		for(int i=0; i< atletas.length;i++){
			newAtletas[i]=atletas[i];
		}
		
	}
	
	public void añadirMedalla(Medalla nueva){
		
		switch(nueva.getTipo())
		{
			case Medalla.TIPO_ORO:
				cuantasMedallasOro++;
				break;
			case Medalla.TIPO_PLATA:
				cuantasMedallasPlata++;
				break;
			case Medalla.TIPO_BRONCE:
				cuantasMedallasBronce++;
				break;
		}
	}
	
	
	
	
	

}
