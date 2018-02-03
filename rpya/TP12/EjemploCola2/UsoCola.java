package EjemploCola2;

public class UsoCola {

	public static void main(String[] args) {
		Cola q=new Cola();
		q.insertar(1);
		q.insertar(2);
		q.insertar(3);
		q.insertar(4);
		q.insertar(5);
		q.insertar(6);
		if (q.estaLlena())
			System.out.println("Cola llena");
		q.borrar();
		q.borrar();
		while (!q.estaVacia())
			System.out.println(q.borrar());
	}
}

