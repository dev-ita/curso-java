package estruturaDeDados;

public class Matriz {
	public static void main(String[] args) {
		int testes[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 } };
		int notas[][] = new int[2][4];
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 60;
		notas[0][3] = 100;
		notas[1][0] = 20;
		notas[1][1] = 30;
		notas[1][2] = 40;
		notas[1][3] = 200;

		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println(notas[i][j]);
			}
			System.out.println("------------------");
		}

		for (int i = 0; i < testes.length; i++) {
			for (int j = 0; j < testes[i].length; j++) {
				System.out.println(testes[i][j]);
			}
		}
	}
}