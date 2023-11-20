package condicionais;

public class IfElse {
	public static void main(String[] args) {
		double nota1 = 900;
		double nota2 = 900;
		double nota3 = 900;
		double nota4 = 901;
		double redacao = 900;
		double media = (nota1 + nota2 + nota3 + nota4 + redacao) / 5;
		
		if (media >= 500 && redacao >= 700) {
			System.out.println("Aluno aprovado com a média: " + media);
		} else if (media >= 300 && media < 500 && redacao >= 700){
			System.out.println("Aluno em recuperação com a média: " + media);
		} else {
			System.out.println("Aluno reprovado com a média: " + media);
		}
		
		// operações lógicas aninhadas
		if (media >= 500) {
			if (media >= 700) {
				if (media > 900) {
					System.out.println("Aluno aprovado direto 1");
				} else {
					System.out.println("Aluno aprovado direto 2");
				}
			} else {
				System.out.println("Aluno em recuperação");
			}
		} else {
			System.out.println("Aluno reprovado");
		}
	}
}