package olimpiadas;
import org.contract4j5.contract.Contract;
import org.contract4j5.contract.Invar;
import org.contract4j5.contract.Post;
import org.contract4j5.contract.Pre;

@Contract
public class Medalla {
	
	public static final int TIPO_ORO=1;
	public static final int TIPO_PLATA=2;
	public static final int TIPO_BRONCE=3;
	
	private int tipo;
	public int dia, mes, año;
	@Invar(value="disciplina != null && disciplina.length()> 0", message="$this.disciplina nunca puede estar vacio")
	public String disciplina;
	@Invar(value="numeroMedallasOro >=0", message="$this.numeroMedallasOro nunca puede ser negativo")
	public static int numeroMedallasOro=0;
	public static int numeroMedallasPlata=0;
	public static int numeroMedallasBronce=0;
	
	
	@Pre(value="tipo > 0 && tipo < 4", message="tipo debe estar comprendido entre 1 y 3")
	public Medalla (int tipo, int dia, int mes, int año, String disciplina)
	{
		this.tipo=tipo;
		this.dia=dia;
		this.mes=mes;
		this.año=año;
		this.disciplina=disciplina;
	}
	
	@Post("!$this.disciplina.equals(\"baloncesto\")")
	public Medalla()
	{
		this(TIPO_ORO,1,1,2016,"baloncesto");
	}
	
	public int getTipo(){return tipo;}
	
	public void setTipo(int tipo){this.tipo=tipo;}
	
	public String toString(){
		
		String tmp="Medalla de ";
		
		switch(tipo){
		
			case TIPO_ORO:
					tmp +=" ORO";
					break;
			case TIPO_PLATA:
				tmp += "PLATA";
				break;
				
			case TIPO_BRONCE:
				tmp+=" BRONCE";
				
		}
		tmp+="ganada en la disciplina de " + disciplina;
		tmp+="el dia "+ dia + "del mes " + mes +"de "+ año;
		
	return tmp;
	}

}
