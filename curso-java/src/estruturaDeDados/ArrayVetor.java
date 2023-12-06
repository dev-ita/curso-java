package estruturaDeDados;

public class ArrayVetor {
	public static void main(String[] args) {
		int[] numeros = { 5, 4, 3, 2, 1 };

		orderArray(numeros);

		for (var item : numeros) {
			System.out.println(item);
		}
	}

	public static void orderArray(int[] array) {
		int aux = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}

	}
}