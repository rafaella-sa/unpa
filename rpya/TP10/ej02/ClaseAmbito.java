package ej02;
public class ClaseAmbito {
private int id1, id2, id3;
	public ClaseAmbito(){
		id1 = 0;
		id2 = 1;
		id3 = -1;
	}
	public void metodoUno (int id1){
		id1 = id2 + 5;
		System.out.println(id1);
	}
	public void metodoDos (){
		int id2;
		id2 = 33;
		id1 = id3 + id2;
		System.out.println(id1 + "; " + id2 + "; " + id3);
	}
	public void metodoTres (){
		System.out.println(id1 + "; " + id2 + "; " + id3);
	}
	public void metodoCuatro (int id2, int id3){
		id1 = id1 + 1;
		id2 = id2 + 1;
		id3 = id3 + 1;
		System.out.println(id1 + "; " + id2 + "; " + id3);
	}
}
