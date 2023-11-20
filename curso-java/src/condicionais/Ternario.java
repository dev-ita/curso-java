package condicionais;

public class Ternario {
	public static void main(String[] args) {
		int idade = 19;
		boolean maiorDeIdade = (idade >= 18) ? true : false;
		System.out.println(maiorDeIdade);

		int media = 3;
		String resultado = (media >= 7) ? "Aprovado" : (media >= 4 && media < 7) ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}
