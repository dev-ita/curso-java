package sistemaAlunos;

import sistemaAlunos.classes.Aluno;
import sistemaAlunos.classes.Diretor;
import sistemaAlunos.classes.Pessoa;
import sistemaAlunos.classes.Secretario;

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
		secretario.setNome("joão");

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorDeIdade() + " - " + aluno.msgMaiorDeIdade());
		System.out.println(diretor.pessoaMaiorDeIdade());
		System.out.println(secretario.pessoaMaiorDeIdade());

		System.out.println("salario = " + aluno.salario());
		System.out.println("salario = " + diretor.salario());
		System.out.println("salario = " + secretario.salario());
		
		Pessoa pessoa = new Aluno();
		pessoa = new Secretario();
		pessoa.setNome("rubens");

		teste(aluno);
		teste(diretor);
		teste(secretario);
		teste(pessoa);
	}

	public static void teste(Pessoa pessoa) {
		System.out.println("essa pessoa é demais = " + pessoa.getNome() + " e o salário é de = " + pessoa.salario());
	}
}