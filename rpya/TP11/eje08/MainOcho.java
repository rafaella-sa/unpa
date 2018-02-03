package tp11;

public class MainOcho {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]secuencia=new char[100];
		String cadena=new String(secuencia);{
			System.out.println("Ingrese la secuencia de caracteres");
			int I;
			for(I=0; I<1000; I++){
			cadena=readString();
			}
		}
	}
	public static String readString(){
	    int ch;
	    String r="";
	    boolean done=false;
	    while (!done)
	    	{
	        try
	        	{
	            ch=System.in.read();
	            if (ch < 0 || (char)ch == '\n')
	            	done=true;
	            else
	            	if ((char)ch != '\r')
	                	r=r + (char) ch;
	            }
	        catch(java.io.IOException e)
	        	{
	            done=true;
	            }
		}
	    return r;
			}		
	}
