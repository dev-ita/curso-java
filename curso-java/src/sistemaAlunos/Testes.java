package sistemaAlunos;

import sistemaAlunos.classes.*;

public class Testes {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("italo");
		aluno.setNomeEscola("Universidade do Estado do Pará");

		Diretor diretor = new Diretor();
		diretor.setRegistroEducacao("45a432b32babdsab32bab32basbab32ba");

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("329.454.884-09");

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
	}
}