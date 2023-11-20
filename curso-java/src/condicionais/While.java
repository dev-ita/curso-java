package condicionais;

public class While {
	public static void main(String[] args) {

		int numero = 10;

		while (numero <= 10) {
			System.out.println("número atual: " + numero);
			numero++;
		}

		int numero2 = 10;

		do {
			System.out.println(numero2);
			numero2++;
		} while (numero2 <= 10);

	}
}