package condicionais;

public class IfElse {
	public static void main(String[] args) {
		double nota1 = 300;
		double nota2 = 300;
		double nota3 = 300;
		double nota4 = 300;
		double redacao = 700;
		double media = (nota1 + nota2 + nota3 + nota4 + redacao) / 5;
		
		if (media >= 500 && redacao >= 700) {
			System.out.println("Aluno aprovado com a média: " + media);
		} else if (media >= 300 && media < 500 && redacao >= 700){
			System.out.println("Aluno em recuperação com a média: " + media);
		} else {
			System.out.println("Aluno reprovado com a média: " + media);
		}
	}
}