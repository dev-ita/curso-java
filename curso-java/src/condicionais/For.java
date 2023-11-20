package condicionais;

public class For {
	public static void main(String[] args) {
		String[] lista = { "italo", "cristiane", "isabele", "rubens" };
		int[] listaNumeros = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}

		System.out.println("--------------------");

		for (String item : lista) {
			System.out.println(item);
		}

		System.out.println("--------------------");

		orderList(listaNumeros);

		for (int item : listaNumeros) {
			System.out.println(item);
		}
	}

	public static void orderList(int[] list) {
		Integer aux = null;

		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] > list[j]) {
					aux = list[i];
					list[i] = list[j];
					list[j] = aux;
				}
			}
		}
	}
}