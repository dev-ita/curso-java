package condicionais;

public class Break {
	public static void main(String[] args) {
		int contador = 0;
		while (contador <= 10) {
			System.out.println(contador);
			if (contador == 5) {
				System.out.println("Encontrei o número " + contador);
				System.out.println("Estou parando de executar o laço.");
				break;
			}
			contador++;
		}
	}
}