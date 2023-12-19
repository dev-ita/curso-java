package aula1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aula1 {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("italo");
		lista.add("isabele");
		lista.add("cristiane");
		lista.add("rubens");
		
		Iterator<String> iterador = lista.iterator();
		
		while (iterador.hasNext()) {
			System.out.println(iterador.hasNext());
			iterador.next();
		}
	}
}
