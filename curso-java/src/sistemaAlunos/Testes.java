package sistemaAlunos;

import sistemaAlunos.classes.*;

public class Testes {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("italo");
		aluno.setNomeEscola("Universidade do Estado do Pará");
		aluno.setIdade(20);

		Diretor diretor = new Diretor();
		diretor.setRegistroEducacao("45a432b32babdsab32bab32basbab32ba");
		diretor.setNome("cristiane");
		diretor.setIdade(48);

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("329.454.884-09");
		secretario.setIdade(18);

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorDeIdade() + " - " + aluno.msgMaiorDeIdade());
		System.out.println(diretor.pessoaMaiorDeIdade());
		System.out.println(secretario.pessoaMaiorDeIdade());
	}
}